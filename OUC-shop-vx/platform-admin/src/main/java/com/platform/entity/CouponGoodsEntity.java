package com.platform.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 优惠券关联商品实体
 * 表名 nideshop_coupon_goods
 *
 * @author hukai
 * @email 365157138@qq.com
 * @date 2017-08-29 21:50:17
 */
@Data
public class CouponGoodsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Integer id;
    //优惠券Id
    private Integer couponId;
    //商品id
    private Integer goodsId;
}
