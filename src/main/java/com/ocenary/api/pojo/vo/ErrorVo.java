package com.ocenary.api.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Shi Meng
 * @version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorVo {
    private int code;
    private String res;
}
