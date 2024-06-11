package com.platform.annotation;

import java.lang.annotation.*;

/**
 * 忽略Token验证
 *
 * @author hukai
 * @email 365157138@qq.com
 * @gitee https://gitee.com/fuyang_hukai/platform
 * @date 2017-03-23 15:44
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {

}
