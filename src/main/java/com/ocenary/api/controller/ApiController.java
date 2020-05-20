package com.ocenary.api.controller;

import com.ocenary.api.config.CommonConstants;
import com.ocenary.api.pojo.Do.*;
import com.ocenary.api.pojo.vo.InsertSuccessVO;
import com.ocenary.api.pojo.vo.QuerySuccessVo;
import com.ocenary.api.service.IApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
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

    public ApiController(IApiService apiService) {
        this.apiService = apiService;
    }

    /**
     *
     * 插入 粉底液-对比组数据
     */
    @PostMapping(value = "/recrfidCompare/insert")
    public InsertSuccessVO saveRecrfidCompare(@RequestParam(value = "SKU_COMPARE_NO1") String SKU_COMPARE_NO1, @RequestParam(value = "SKU_COMPARE_NO2") String SKU_COMPARE_NO2,
                                              @RequestParam(value = "SKU_COMPARE_NAME1") String SKU_COMPARE_NAME1, @RequestParam(value = "SKU_COMPARE_NAME2") String SKU_COMPARE_NAME2,
                                              @RequestParam(value = "EQUIPMENT_NO") String EQUIPMENT_NO, @RequestParam(value = "STORE_NO") String STORE_NO,
                                              @RequestParam(value = "COMPARE_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date COMPARE_TIME) {
        RecrfidCompareDO recrfidCompareDO = RecrfidCompareDO.builder()
                .SKU_COMPARE_NO1(SKU_COMPARE_NO1)
                .SKU_COMPARE_NO2(SKU_COMPARE_NO2)
                .SKU_COMPARE_NAME1(SKU_COMPARE_NAME1)
                .SKU_COMPARE_NAME2(SKU_COMPARE_NAME2)
                .EQUIPMENT_NO(EQUIPMENT_NO)
                .STORE_NO(STORE_NO)
                .COMPARE_TIME(COMPARE_TIME).build();
        apiService.saveRecrfidCompareDO(recrfidCompareDO);
        return InsertSuccessVO.builder()
                .code(CommonConstants.SUCCSS)
                .res(CommonConstants.SUCCSS_DESCRIPTION)
                .build();
    }

    /**
     * 查询 粉底液-对比组数据 全量数据
     */
    @PostMapping(value = "/recrfidCompare/list")
    public QuerySuccessVo listRecrfidCompare() {
        return QuerySuccessVo.<RecrfidCompareDO>builder()
                .code(CommonConstants.SUCCSS)
                .description(CommonConstants.SUCCSS_DESCRIPTION)
                .data(apiService.listRecrfidCompareDO())
                .build();
    }

    /**
     * 插入 粉底粉底液-设备数据
     */
    @PostMapping(value = "/recrfidEquipment/insert")
    public InsertSuccessVO saveRecrfidEquipment(@RequestParam(value = "EQUIPMENT_NO") String EQUIPMENT_NO, @RequestParam(value = "STORE_NO") String STORE_NO,
                                                @RequestParam(value = "INTERACTION_TIME") int INTERACTION_TIME, @RequestParam(value = "OPEN_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date OPEN_TIME) {
        RecrfidEquipmentDO recrfidCompareDO = RecrfidEquipmentDO.builder()
                .EQUIPMENT_NO(EQUIPMENT_NO)
                .STORE_NO(STORE_NO)
                .INTERACTION_TIME(INTERACTION_TIME)
                .OPEN_TIME(OPEN_TIME)
                .build();
        apiService.saveRecrfidEquipmentDO(recrfidCompareDO);
        return InsertSuccessVO.builder()
                .code(CommonConstants.SUCCSS)
                .res(CommonConstants.SUCCSS_DESCRIPTION)
                .build();
    }

    /**
     * 查询 粉底粉底液-设备数据 全量数据
     */
    @PostMapping(value = "/recrfidEquipment/list")
    public QuerySuccessVo listRecrfidEquipment() {
        return QuerySuccessVo.<RecrfidEquipmentDO>builder()
                .code(CommonConstants.SUCCSS)
                .description(CommonConstants.SUCCSS_DESCRIPTION)
                .data(apiService.listRecrfidEquipmentDO())
                .build();
    }

    /**
     * 保存 粉底液-产品数据 数据
     */
    @PostMapping(value = "/recrfidProduct/insert")
    public InsertSuccessVO saveRecrfidProduct(@RequestParam(value = "PRODUCT_NO") String PRODUCT_NO, @RequestParam(value = "PRODUCT_NAME") String PRODUCT_NAME,
                                              @RequestParam(value = "EQUIPMENT_NO") String EQUIPMENT_NO, @RequestParam(value = "STORE_NO") String STORE_NO, @RequestParam(value = "OPEN_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date OPEN_TIME) {
        RecrfidProductDO recrfidProductDO = RecrfidProductDO.builder()
                .EQUIPMENT_NO(EQUIPMENT_NO)
                .PRODUCT_NO(PRODUCT_NO)
                .PRODUCT_NAME(PRODUCT_NAME)
                .STORE_NO(STORE_NO)
                .OPEN_TIME(OPEN_TIME)
                .build();
        apiService.saveRecrfidProductDO(recrfidProductDO);
        return InsertSuccessVO.builder()
                .code(CommonConstants.SUCCSS)
                .res(CommonConstants.SUCCSS_DESCRIPTION)
                .build();
    }

    /**
     * 查询 粉底液-产品数据 全量数据
     */
    @PostMapping(value = "/recrfidProduct/list")
    public QuerySuccessVo listRecrfidProduct() {
        return QuerySuccessVo.<RecrfidProductDO>builder()
                .code(CommonConstants.SUCCSS)
                .description(CommonConstants.SUCCSS_DESCRIPTION)
                .data(apiService.listRecrfidProductDO())
                .build();
    }

    /**
     * 保存 粉底液-商品数据 数据
     */
    @PostMapping(value = "/recrfidSku/insert")
    public InsertSuccessVO saveRecrfidSku(@RequestParam(value = "SKU_NO") String SKU_NO, @RequestParam(value = "SKU_NAME") String SKU_NAME,
                                          @RequestParam(value = "EQUIPMENT_NO") String EQUIPMENT_NO, @RequestParam(value = "STORE_NO") String STORE_NO, @RequestParam(value = "ADD_CART_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date ADD_CART_TIME) {
        RecrfidSkuDO recrfidSkuDO = RecrfidSkuDO.builder()
                .ADD_CART_TIME(ADD_CART_TIME)
                .EQUIPMENT_NO(EQUIPMENT_NO)
                .SKU_NAME(SKU_NAME)
                .SKU_NO(SKU_NO)
                .STORE_NO(STORE_NO)
                .build();
        apiService.saveRecrfidSkuDO(recrfidSkuDO);
        return InsertSuccessVO.builder()
                .code(CommonConstants.SUCCSS)
                .res(CommonConstants.SUCCSS_DESCRIPTION)
                .build();
    }

    /**
     * 查询 粉底液-商品数据 全量数据
     */
    @PostMapping(value = "/recrfidSku/list")
    public QuerySuccessVo listRecrfidSku() {
        return QuerySuccessVo.<RecrfidSkuDO>builder()
                .code(CommonConstants.SUCCSS)
                .description(CommonConstants.SUCCSS_DESCRIPTION)
                .data(apiService.listRecrfidSkuDO())
                .build();
    }

    /**
     * 保存 眼影-设备 数据
     */
    @PostMapping(value = "/recyyEquipment/insert")
    public InsertSuccessVO saveRecyyEquipment(@RequestParam(value = "EQUIPMENT_NO") String EQUIPMENT_NO, @RequestParam(value = "STORE_NO") String STORE_NO,
                                          @RequestParam(value = "INTERACTION_TIME") int INTERACTION_TIME, @RequestParam(value = "TURN_ON_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date TURN_ON_TIME) {
        RecyyEquipmentDO recyyEquipmentDO=   RecyyEquipmentDO.builder().EQUIPMENT_NO(EQUIPMENT_NO)
                .STORE_NO(STORE_NO)
                .INTERACTION_TIME(INTERACTION_TIME)
                .TURN_ON_TIME(TURN_ON_TIME)
                .build();
        apiService.saveRecyyEquipmentDO(recyyEquipmentDO);
        return InsertSuccessVO.builder()
                .code(CommonConstants.SUCCSS)
                .res(CommonConstants.SUCCSS_DESCRIPTION)
                .build();
    }

    /**
     * 查询 眼影-设备 全量数据
     */
    @PostMapping(value = "/recyyEquipment/list")
    public QuerySuccessVo listRecyyEquipment() {
        return QuerySuccessVo.<RecyyEquipmentDO>builder()
                .code(CommonConstants.SUCCSS)
                .description(CommonConstants.SUCCSS_DESCRIPTION)
                .data(apiService.listRecyyEquipmentDO())
                .build();
    }

    /**
     * 保存 眼影-打开购买页 数据
     */
    @PostMapping(value = "/recyyOpenPurchasePage/insert")
    public InsertSuccessVO saveRecyyOpenPurchasePage(@RequestParam(value = "EQUIPMENT_NO") String EQUIPMENT_NO, @RequestParam(value = "STORE_NO") String STORE_NO,
                                                     @RequestParam(value = "OPEN_PURCHASE_PAGE_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date OPEN_PURCHASE_PAGE_TIME) {
        RecyyOpenPurchasePageDO recyyOpenPurchasePageDO= RecyyOpenPurchasePageDO.builder()
                .EQUIPMENT_NO(EQUIPMENT_NO)
                .STORE_NO(STORE_NO)
                .OPEN_PURCHASE_PAGE_TIME(OPEN_PURCHASE_PAGE_TIME)
                .build();
        apiService.saveRecyyOpenPurchasePageDO(recyyOpenPurchasePageDO);
        return InsertSuccessVO.builder()
                .code(CommonConstants.SUCCSS)
                .res(CommonConstants.SUCCSS_DESCRIPTION)
                .build();
    }

    /**
     * 查询 眼影-打开购买页 全量数据
     */
    @PostMapping(value = "/recyyOpenPurchasePage/list")
    public QuerySuccessVo listRecyyOpenPurchasePage() {
        return QuerySuccessVo.<RecyyOpenPurchasePageDO>builder()
                .code(CommonConstants.SUCCSS)
                .description(CommonConstants.SUCCSS_DESCRIPTION)
                .data(apiService.listRecyyOpenPurchasePageDO())
                .build();
    }

    /**
     * 保存 眼影-KOL组合 数据
     */
    @PostMapping(value = "/recyyKol/insert")
    public InsertSuccessVO saveRecyyKol(@RequestParam(value = "COMPARE_NO") String COMPARE_NO, @RequestParam(value = "COMPARE_NAME") String COMPARE_NAME,
                                        @RequestParam(value = "EQUIPMENT_NO") String EQUIPMENT_NO,@RequestParam(value = "STORE_NO") String STORE_NO,
                                                     @RequestParam(value = "OPEN_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date OPEN_TIME) {
        RecyyKolDO recyyKolDO=  RecyyKolDO.builder()
                .COMPARE_NO(COMPARE_NO)
                .COMPARE_NAME(COMPARE_NAME)
                .EQUIPMENT_NO(EQUIPMENT_NO)
                .STORE_NO(STORE_NO)
                .OPEN_TIME(OPEN_TIME)
                .build();
        apiService.saveRecyyKolDO(recyyKolDO);
        return InsertSuccessVO.builder()
                .code(CommonConstants.SUCCSS)
                .res(CommonConstants.SUCCSS_DESCRIPTION)
                .build();
    }

    /**
     * 查询 眼影-KOL组合 全量数据
     */
    @PostMapping(value = "/recyyKol/list")
    public QuerySuccessVo listRecyyKol() {
        return QuerySuccessVo.<RecyyKolDO>builder()
                .code(CommonConstants.SUCCSS)
                .description(CommonConstants.SUCCSS_DESCRIPTION)
                .data(apiService.listRecyyKolDO())
                .build();
    }

    /**
     * 保存 眼影-定制 数据
     */
    @PostMapping(value = "/recyyCustom/insert")
    public InsertSuccessVO saveRecyyCustom(@RequestParam(value = "EQUIPMENT_NO") String EQUIPMENT_NO, @RequestParam(value = "STORE_NO") String STORE_NO,
                                        @RequestParam(value = "BOX_MODEL_NO") String BOX_MODEL_NO,@RequestParam(value = "BOX_MODEL_NAME") String BOX_MODEL_NAME,
                                        @RequestParam(value = "COLOR_NO") String COLOR_NO,@RequestParam(value = "COLOR_NAME") String COLOR_NAME,
                                        @RequestParam(value = "BOX_MODEL_CHOOSE_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date BOX_MODEL_CHOOSE_TIME,
                                        @RequestParam(value = "COLOR_CHOOSE_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date COLOR_CHOOSE_TIME) {
        RecyyCustomDO recyyCustomDO=  RecyyCustomDO.builder()
                .BOX_MODEL_CHOOSE_TIME(BOX_MODEL_CHOOSE_TIME)
                .BOX_MODEL_NAME(BOX_MODEL_NAME)
                .BOX_MODEL_NO(BOX_MODEL_NO)
                .COLOR_CHOOSE_TIME(COLOR_CHOOSE_TIME)
                .COLOR_NAME(COLOR_NAME)
                .COLOR_NO(COLOR_NO)
                .EQUIPMENT_NO(EQUIPMENT_NO)
                .STORE_NO(STORE_NO)
                .build();
        apiService.saveRecyyCustomDO(recyyCustomDO);
        return InsertSuccessVO.builder()
                .code(CommonConstants.SUCCSS)
                .res(CommonConstants.SUCCSS_DESCRIPTION)
                .build();
    }

    /**
     * 查询 眼影-定制 全量数据
     */
    @PostMapping(value = "/recyyCustom/list")
    public QuerySuccessVo listRecyyCustom() {
        return QuerySuccessVo.<RecyyCustomDO>builder()
                .code(CommonConstants.SUCCSS)
                .description(CommonConstants.SUCCSS_DESCRIPTION)
                .data(apiService.listRecyyCustomDO())
                .build();
    }

    /**
     * 保存 眼影-模块 数据
     */
    @PostMapping(value = "/recyyModule/insert")
    public InsertSuccessVO saveRecyyModule(@RequestParam(value = "PRODUCT_NO") String PRODUCT_NO, @RequestParam(value = "PRODUCT_NAME") String PRODUCT_NAME,
                                           @RequestParam(value = "EQUIPMENT_NO") String EQUIPMENT_NO,@RequestParam(value = "STORE_NO") String STORE_NO,
                                           @RequestParam(value = "OPEN_TIME") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date OPEN_TIME) {
        RecyyModuelDO recyyModuelDO=   RecyyModuelDO.builder()
                .EQUIPMENT_NO(EQUIPMENT_NO)
                .OPEN_TIME(OPEN_TIME)
                .PRODUCT_NAME(PRODUCT_NAME)
                .PRODUCT_NO(PRODUCT_NO)
                .STORE_NO(STORE_NO)
                .build();
        apiService.saveRecyyModuelDO(recyyModuelDO);
        return InsertSuccessVO.builder()
                .code(CommonConstants.SUCCSS)
                .res(CommonConstants.SUCCSS_DESCRIPTION)
                .build();
    }

    /**
     * 查询 眼影-模块 全量数据
     */
    @PostMapping(value = "/recyyCustom/list")
    public QuerySuccessVo listRecyyModule() {
        return QuerySuccessVo.<RecyyModuelDO>builder()
                .code(CommonConstants.SUCCSS)
                .description(CommonConstants.SUCCSS_DESCRIPTION)
                .data(apiService.listRecyyModuelDO())
                .build();
    }
}
