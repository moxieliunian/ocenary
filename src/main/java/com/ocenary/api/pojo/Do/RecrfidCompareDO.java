package com.ocenary.api.pojo.Do;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Shi Meng
 * @version 1.0
 * 粉底液-对比组数据
 **/
@Entity
@Table(name = "STG_JY_RECRFID_COMPARE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecrfidCompareDO {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String SKU_COMPARE_NO1;
    private String SKU_COMPARE_NO2;
    private String SKU_COMPARE_NAME1;
    private String SKU_COMPARE_NAME2;
    private String EQUIPMENT_NO;
    private String STORE_NO;
    private Date COMPARE_TIME;
}
