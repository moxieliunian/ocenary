package com.ocenary.api.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Shi Meng
 * @version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsertSuccessVO {
    private int code;
    private String res;
}
