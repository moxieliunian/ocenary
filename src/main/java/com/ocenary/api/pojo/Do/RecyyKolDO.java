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
@Table(name = "stg_jy_recyy_kol")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecyyKolDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String COMPARE_NO;
    private String COMPARE_NAME;
    private String EQUIPMENT_NO;
    private String STORE_NO;
    private Date OPEN_TIME;
}
