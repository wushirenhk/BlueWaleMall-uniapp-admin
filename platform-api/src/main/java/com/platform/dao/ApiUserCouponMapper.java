package com.platform.dao;

import com.platform.entity.UserCouponVo;
import org.apache.ibatis.annotations.Param;

/**
 * @author hukai
 * @email 365157138@qq.com
 * @gitee https://gitee.com/fuyang_hukai/platform
 * @date 2017-08-11 09:16:47
 */
public interface ApiUserCouponMapper extends BaseDao<UserCouponVo> {
    UserCouponVo queryByCouponNumber(@Param("couponNumber") String couponNumber);
}
