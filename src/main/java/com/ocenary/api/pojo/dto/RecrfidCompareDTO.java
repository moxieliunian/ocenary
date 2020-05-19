package com.ocenary.api.pojo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Shi Meng
 * @version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecrfidCompareDTO {
    private String SKU_COMPARE_NO1;
    private String SKU_COMPARE_NO2;
    private String SKU_COMPARE_NAME1;
    private String SKU_COMPARE_NAME2;
    private String EQUIPMENT_NO;
    private String STORE_NO;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date COMPARE_TIME;
}
