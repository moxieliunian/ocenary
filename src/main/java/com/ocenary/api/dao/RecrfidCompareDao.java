package com.ocenary.api.dao;

import com.ocenary.api.pojo.Do.RecrfidCompareDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author Shi Meng
 * @version 1.0
 * @date 2020/5/19
 **/
public interface RecrfidCompareDao extends JpaRepository<RecrfidCompareDO, Serializable>, JpaSpecificationExecutor<RecrfidCompareDO> {
}
