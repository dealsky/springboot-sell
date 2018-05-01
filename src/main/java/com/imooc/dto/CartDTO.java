package com.imooc.dto;


import lombok.Data;

/**
 * 购物车
 *
 * @Author: dealsky
 * @Date: 2018/5/1 20:15
 */
@Data
public class CartDTO {

    /**
     * 商品Id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
