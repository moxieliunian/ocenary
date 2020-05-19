package com.ocenary.api.service;

import com.ocenary.api.dao.RecrfidCompareDao;
import com.ocenary.api.pojo.Do.RecrfidCompareDO;
import com.ocenary.api.pojo.dto.RecrfidCompareDTO;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shi Meng
 * @version 1.0
 **/
@Service
public class ApiServiceImpl implements IApiService {
    private final RecrfidCompareDao recrfidCompareDao;

    public ApiServiceImpl(RecrfidCompareDao recrfidCompareDao) {
        this.recrfidCompareDao = recrfidCompareDao;
    }

    @Override
    public void save(RecrfidCompareDO recrfidCompareDO) {
        recrfidCompareDao.save(recrfidCompareDO);
    }

    @Override
    public List<RecrfidCompareDTO> listRecrfidCompareDO() {
        List<RecrfidCompareDO> recrfidCompareDOS = recrfidCompareDao.findAll();
        BeanCopier copier = BeanCopier.create(RecrfidCompareDO.class, RecrfidCompareDTO.class, false);
        return recrfidCompareDOS.stream().map(p -> {
            RecrfidCompareDTO temp = RecrfidCompareDTO.builder().build();
            copier.copy(p, temp, null);
            return temp;
        }).collect(Collectors.toList());
    }
}
