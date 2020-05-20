package com.ocenary.api.dao;

import com.ocenary.api.pojo.Do.RecrfidEquipmentDO;
import com.ocenary.api.pojo.Do.RecrfidProductDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author Shi Meng
 * @version 1.0
 * @date 2020/5/19
 **/
public interface RecrfidProductDao extends JpaRepository<RecrfidProductDO, Serializable>, JpaSpecificationExecutor<RecrfidProductDO> {
}
