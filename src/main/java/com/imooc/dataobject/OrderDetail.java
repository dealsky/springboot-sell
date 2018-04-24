package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: dealsky
 * @Date: 2018/4/24 21:47
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    @Id
    private String detailId;

    private String orderId;

    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 商品库存
     */
    private Integer productQuantity;

    /**
     * 商品小图
     */
    private String productIcon;
}
