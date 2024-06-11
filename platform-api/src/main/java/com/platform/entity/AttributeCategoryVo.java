package com.platform.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * @author hukai
 * @email 365157138@qq.com
 * @date 2017-08-15 08:03:41
 */
@Data
public class AttributeCategoryVo implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer id;
    //
    private String name;
    //
    private Integer enabled;
}
