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
@Table(name = "stg_jy_recyy_equipment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecyyEquipmentDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String EQUIPMENT_NO;
    private String STORE_NO;
    private Date TURN_ON_TIME;
    private int INTERACTION_TIME;
}
