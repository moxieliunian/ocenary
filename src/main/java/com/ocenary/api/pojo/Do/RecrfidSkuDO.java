package com.ocenary.api.pojo.Do;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Shi Meng
 * @version 1.0
 **/
@Entity
@Table(name = "stg_jy_recrfid_sku")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecrfidSkuDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String SKU_NO;
    private String SKU_NAME;
    private String EQUIPMENT_NO;
    private String STORE_NO;
    private Date ADD_CART_TIME;
}
