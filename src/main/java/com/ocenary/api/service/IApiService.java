package com.ocenary.api.service;

import com.ocenary.api.pojo.Do.RecrfidCompareDO;
import com.ocenary.api.pojo.dto.RecrfidCompareDTO;

import java.util.List;

/**
 * @author Shi Meng
 * @version 1.0
 * @date 2020/5/19
 **/
public interface IApiService {
    void save(RecrfidCompareDO recrfidCompareDO);

    List<RecrfidCompareDTO> listRecrfidCompareDO();
}
