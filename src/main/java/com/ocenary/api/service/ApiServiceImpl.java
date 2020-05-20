package com.ocenary.api.service;

import com.ocenary.api.dao.*;
import com.ocenary.api.pojo.Do.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Shi Meng
 * @version 1.0
 **/
@Service
public class ApiServiceImpl implements IApiService {
    private final RecrfidCompareDao recrfidCompareDao;
    private final RecrfidEquipmentDao recrfidEquipmentDao;
    private final RecrfidProductDao recrfidProductDao;
    private final RecrfidSkuDao recrfidSkuDao;
    private final RecyyCustomDao recyyCustomDao;
    private final RecyyEquipmentDao recyyEquipmentDao;
    private final RecyyKolDao recyyKolDao;
    private final RecyyModuelDao moduelDao;
    private RecyyOpenPurchasePageDao recyyOpenPurchasePageDao;

    public ApiServiceImpl(RecrfidCompareDao recrfidCompareDao,RecrfidEquipmentDao recrfidEquipmentDao,RecrfidProductDao recrfidProductDao
                          ,RecrfidSkuDao recrfidSkuDao,RecyyCustomDao recyyCustomDao,RecyyEquipmentDao recyyEquipmentDao,
                          RecyyKolDao recyyKolDao,RecyyModuelDao moduelDao,RecyyOpenPurchasePageDao recyyOpenPurchasePageDao) {
        this.recrfidCompareDao = recrfidCompareDao;
        this.recrfidEquipmentDao=recrfidEquipmentDao;
        this.recrfidProductDao=recrfidProductDao;
        this.recrfidSkuDao=recrfidSkuDao;
        this.recyyCustomDao=recyyCustomDao;
        this.recyyEquipmentDao=recyyEquipmentDao;
        this.recyyKolDao=recyyKolDao;
        this.moduelDao=moduelDao;
        this.recyyOpenPurchasePageDao=recyyOpenPurchasePageDao;
    }


    /****
     * 保存 粉底液-对比组数据 数据
     * @param recrfidCompareDO recrfidCompareDO
     */
    @Override
    public void saveRecrfidCompareDO(RecrfidCompareDO recrfidCompareDO) {
        recrfidCompareDao.save(recrfidCompareDO);
    }

    /**
     * 查询 粉底液-对比组数据 全量数据
     *
     * @return java.util.List<com.ocenary.api.pojo.Do.RecrfidCompareDO>
     */
    @Override
    public List<RecrfidCompareDO> listRecrfidCompareDO() {
        return recrfidCompareDao.findAll();
    }

    /**
     * 保存 粉底粉底液-设备数据 数据
     *
     * @param recrfidEquipmentDO recrfidEquipmentDO
     */
    @Override
    public void saveRecrfidEquipmentDO(RecrfidEquipmentDO recrfidEquipmentDO) {
        recrfidEquipmentDao.save(recrfidEquipmentDO);
    }

    /**
     * 查询 粉底粉底液-设备数据 全量数据
     *
     * @return java.util.List<com.ocenary.api.pojo.Do.RecrfidEquipmentDO>
     */
    @Override
    public List<RecrfidEquipmentDO> listRecrfidEquipmentDO() {
        return recrfidEquipmentDao.findAll();
    }

    /**
     * 保存 粉底液-产品数据 数据
     *
     * @param recrfidProductDO recrfidProductDO
     */
    @Override
    public void saveRecrfidProductDO(RecrfidProductDO recrfidProductDO) {
        recrfidProductDao.save(recrfidProductDO);
    }

    /**
     * 查询 粉底液-产品数据 全量数据
     *
     * @return java.util.List<com.ocenary.api.pojo.Do.RecrfidProductDO>
     */
    @Override
    public List<RecrfidProductDO> listRecrfidProductDO() {
        return recrfidProductDao.findAll();
    }

    /**
     * 保存 粉底液-商品数据 数据
     *
     * @param recrfidSkuDO recrfidSkuDO
     */
    @Override
    public void saveRecrfidSkuDO(RecrfidSkuDO recrfidSkuDO) {
        recrfidSkuDao.save(recrfidSkuDO);
    }

    /**
     * 查询 粉底液-商品数据 全量数据
     *
     * @return java.util.List<com.ocenary.api.pojo.Do.RecrfidSkuDO>
     */
    @Override
    public List<RecrfidSkuDO> listRecrfidSkuDO() {
        return recrfidSkuDao.findAll();
    }

    /**
     * 保存 眼影-定制 数据
     *
     * @param recyyCustomDO recyyCustomDO
     */
    @Override
    public void saveRecyyCustomDO(RecyyCustomDO recyyCustomDO) {
        recyyCustomDao.save(recyyCustomDO);
    }

    /**
     * 查询 眼影-定制 全量数据
     *
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyCustomDO>
     */
    @Override
    public List<RecyyCustomDO> listRecyyCustomDO() {
        return recyyCustomDao.findAll();
    }

    /**
     * 保存 眼影-设备 数据
     *
     * @param recyyEquipmentDO recyyEquipmentDO
     */
    @Override
    public void saveRecyyEquipmentDO(RecyyEquipmentDO recyyEquipmentDO) {
        recyyEquipmentDao.save(recyyEquipmentDO);
    }

    /**
     * 查询 眼影-设备 全量数据
     *
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyEquipmentDO>
     */
    @Override
    public List<RecyyEquipmentDO> listRecyyEquipmentDO() {
        return recyyEquipmentDao.findAll();
    }

    /**
     * 保存 眼影-KOL组合 数据
     *
     * @param recyyKolDO recyyKolDO
     */
    @Override
    public void saveRecyyKolDO(RecyyKolDO recyyKolDO) {
        recyyKolDao.save(recyyKolDO);
    }

    /**
     * 查询 眼影-KOL组合 全量数据
     *
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyKolDO>
     */
    @Override
    public List<RecyyKolDO> listRecyyKolDO() {
        return recyyKolDao.findAll();
    }

    /**
     * 保存 眼影-模块 数据
     *
     * @param recyyModuelDO recyyModuelDO
     */
    @Override
    public void saveRecyyModuelDO(RecyyModuelDO recyyModuelDO) {
        moduelDao.save(recyyModuelDO);
    }

    /**
     * 查询 眼影-模块 全量数据
     *
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyModuelDO>
     */
    @Override
    public List<RecyyModuelDO> listRecyyModuelDO() {
        return moduelDao.findAll();
    }

    /**
     * 保存 眼影-打开购买页 数据
     *
     * @param recyyOpenPurchasePageDO recyyOpenPurchasePageDO
     */
    @Override
    public void saveRecyyOpenPurchasePageDO(RecyyOpenPurchasePageDO recyyOpenPurchasePageDO) {
        recyyOpenPurchasePageDao.save(recyyOpenPurchasePageDO);
    }

    /**
     * 查询 眼影-打开购买页 全量数据
     *
     * @return java.util.List<com.ocenary.api.pojo.Do.RecyyOpenPurchasePageDO>
     */
    @Override
    public List<RecyyOpenPurchasePageDO> listRecyyOpenPurchasePageDO() {
        return recyyOpenPurchasePageDao.findAll();
    }
}
