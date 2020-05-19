package com.ocenary.api.pojo.vo;

import com.ocenary.api.pojo.dto.RecrfidCompareDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shi Meng
 * @version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuerySuccessVo<T>{
    private int code;
    private String description;
    private List<T> data;

//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public List<T> getData() {
//        return data;
//    }
//
//    public void setData(List<T> data) {
//        this.data = data;
//    }
//
//    public static void main(String[] args) {
//        QuerySuccessVo<RecrfidCompareDTO> querySuccessVo=new QuerySuccessVo<>();
//        querySuccessVo.setCode(1);
//        querySuccessVo.setDescription("1231");
//        querySuccessVo.setData(new ArrayList<>());
//    }
}
