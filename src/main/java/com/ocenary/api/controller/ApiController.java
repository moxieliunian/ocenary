package com.ocenary.api.controller;

import com.ocenary.api.config.CommonConstants;
import com.ocenary.api.pojo.Do.RecrfidCompareDO;
import com.ocenary.api.pojo.dto.RecrfidCompareDTO;
import com.ocenary.api.pojo.vo.InsertSuccessVO;
import com.ocenary.api.pojo.vo.QuerySuccessVo;
import com.ocenary.api.service.IApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Shi Meng
 * @version 1.0
 **/
@RestController
@Slf4j
public class ApiController {
    private final IApiService apiService;
    public ApiController(IApiService apiService){
        this.apiService=apiService;
    }
    @PostMapping(value = "/recrfidCompare/insert")
    public ResponseEntity<?> saveRecrfidCompare(@RequestParam(value = "SKU_COMPARE_NO1")String skuCompareNo1, @RequestParam(value = "SKU_COMPARE_NO2")String skuCompareNo2,
                                             @RequestParam(value = "SKU_COMPARE_NAME1")String skuCompareName1, @RequestParam(value = "SKU_COMPARE_NAME2")String skuCompareName2,
                                             @RequestParam(value = "EQUIPMENT_NO")String equipmentNo, @RequestParam(value = "STORE_NO")String storeNo,
                                             @RequestParam(value = "COMPARE_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date compareTime
                                   ){
        RecrfidCompareDO recrfidCompareDO=  RecrfidCompareDO.builder()
                .SKU_COMPARE_NO1(skuCompareNo1)
                .SKU_COMPARE_NO2(skuCompareNo2)
                .SKU_COMPARE_NAME1(skuCompareName1)
                .SKU_COMPARE_NAME2(skuCompareName2)
                .EQUIPMENT_NO(equipmentNo)
                .STORE_NO(storeNo)
                .COMPARE_TIME(compareTime).build();
        apiService.save(recrfidCompareDO);
        return new ResponseEntity<>(InsertSuccessVO.builder().code(CommonConstants.SUCCSS).res(CommonConstants.SUCCSS_DESCRIPTION).build(),HttpStatus.OK);
    }

    @PostMapping(value = "/recrfidCompare/list")
    public ResponseEntity<?> listRecrfidCompare(){
        return new ResponseEntity<>(QuerySuccessVo.<RecrfidCompareDTO>builder().code(CommonConstants.SUCCSS).description(CommonConstants.SUCCSS_DESCRIPTION).data(apiService.listRecrfidCompareDO()).build(),HttpStatus.OK);
    }
}
