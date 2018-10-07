package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @Author: dealsky
 * @Date: 2018/4/21 21:58
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {

    Up(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
