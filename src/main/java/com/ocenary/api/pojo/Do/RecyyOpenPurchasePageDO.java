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
@Table(name = "stg_jy_recyy_open_purchase_page")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecyyOpenPurchasePageDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String EQUIPMENT_NO;
    private String STORE_NO;
    private Date OPEN_PURCHASE_PAGE_TIME;
}
