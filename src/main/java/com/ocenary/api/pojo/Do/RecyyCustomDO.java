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
@Table(name = "stg_jy_recyy_custom")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecyyCustomDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String EQUIPMENT_NO;
    private String STORE_NO;
    private String BOX_MODEL_NO;
    private String BOX_MODEL_NAME;
    private String COLOR_NO;
    private String COLOR_NAME;
    private Date BOX_MODEL_CHOOSE_TIME;
    private Date COLOR_CHOOSE_TIME;
}
