package com.platform.dao;

import com.platform.entity.SmsLogVo;
import com.platform.entity.UserVo;
import org.apache.ibatis.annotations.Param;

/**
 * 用户
 *
 * @author hukai
 * @email 365157138@qq.com
 * @gitee https://gitee.com/fuyang_hukai/platform
 * @date 2017-03-23 15:22:06
 */
public interface ApiUserMapper extends BaseDao<UserVo> {

    UserVo queryByMobile(String mobile);

    UserVo queryByOpenId(@Param("openId") String openId);

    /**
     * 获取用户最后一条短信
     *
     * @param userId
     * @return
     */
    SmsLogVo querySmsCodeByUserId(@Param("userId") Long userId);

    /**
     * 保存短信
     *
     * @param smsLogVo
     * @return
     */
    int saveSmsCodeLog(SmsLogVo smsLogVo);
}
