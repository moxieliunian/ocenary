package com.ocenary.api.service;

import com.ocenary.api.pojo.Do.*;

import java.util.List;

/**
 * @author Shi Meng
 * @version 1.0
 * @date 2020/5/19
 **/
public interface IApiService {
    /****
     * 保存 粉底液-对比组数据 数据
     * @param recrfidCompareDO recrfidCompareDO
     */
    void saveRecrfidCompareDO(RecrfidCompareDO recrfidCompareDO);
    /**
     * 查询 粉底液-对比组数据 全量数据
     * @return java.util.List<com.ocenary.api.pojo.Do.RecrfidCompareDO>
     */
    List<RecrfidCompareDO> listRecrfidCompareDO();

    /**
     * 保存 粉底粉底液-设备数据 数据
     * @param recrfidEquipmentDO recrfidEquipmentDO
     */
    void saveRecrfidEquipmentDO(RecrfidEquipmentDO recrfidEquipmentDO);
    /**
     * 查询 粉底粉底液-设备数据 全量数据
     * @return java.util.List<com.ocenary.api.pojo.Do.RecrfidEquipmentDO>
     */
    List<RecrfidEquipmentDO> listRecrfidEquipmentDO();
    /**
     * 保存 粉底液-产品数据 数据
     * @param recrfidProductDO  recrfidProductDO
     */
    void saveRecrfidProductDO(RecrfidProductDO recrfidProductDO);
    /**
     * 查询 粉底液-产品数据 全量数据
     * @return java.util.List<com.ocenary.api.pojo.Do.RecrfidProductDO>
     */
    List<RecrfidProductDO> listRecrfidProductDO();
    /**
     * 保存 粉底液-商品数据 数据
     * @param recrfidSkuDO recrfidSkuDO
     */
    void saveRecrfidSkuDO(RecrfidSkuDO recrfidSkuDO);
    /**
     * 查询 粉底液-商品数据 全量数据
     * @return java.util.List<com.ocenary.api.pojo.Do.RecrfidSkuDO>
     */
    List<RecrfidSkuDO> listRecrfidSkuDO();
    /**
     * 保存 眼影-定制 数据
     * @param recyyCustomDO recyyCustomDO
     */
    void saveRecyyCustomDO(RecyyCustomDO recyyCustomDO);
    /**
     *  查询 眼影-定制 全量数据
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyCustomDO>
     */
    List<RecyyCustomDO> listRecyyCustomDO();
    /**
     * 保存 眼影-设备 数据
     * @param recyyEquipmentDO recyyEquipmentDO
     */
    void saveRecyyEquipmentDO(RecyyEquipmentDO recyyEquipmentDO);
    /**
     * 查询 眼影-设备 全量数据
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyEquipmentDO>
     */
    List<RecyyEquipmentDO> listRecyyEquipmentDO();
    /**
     * 保存 眼影-KOL组合 数据
     * @param recyyKolDO recyyKolDO
     */
    void saveRecyyKolDO(RecyyKolDO recyyKolDO);
    /**
     * 查询 眼影-KOL组合 全量数据
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyKolDO>
     */
    List<RecyyKolDO> listRecyyKolDO();
    /**
     * 保存 眼影-模块 数据
     * @param recyyModuelDO recyyModuelDO
     */
    void saveRecyyModuelDO(RecyyModuelDO recyyModuelDO);
    /**
     * 查询 眼影-模块 全量数据
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyModuelDO>
     */
    List<RecyyModuelDO> listRecyyModuelDO();
    /**
     * 保存 眼影-打开购买页 数据
     * @param recyyOpenPurchasePageDO recyyOpenPurchasePageDO
     */
    void saveRecyyOpenPurchasePageDO(RecyyOpenPurchasePageDO recyyOpenPurchasePageDO);
    /**
     * 查询 眼影-打开购买页 全量数据
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyOpenPurchasePageDO>
     */
    List<RecyyOpenPurchasePageDO> listRecyyOpenPurchasePageDO();
}
