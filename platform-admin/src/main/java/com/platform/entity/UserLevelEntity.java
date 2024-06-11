package com.platform.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * 实体
 * 表名 nideshop_user_level
 *
 * @author hukai
 * @email 365157138@qq.com
 * @date 2017-08-16 16:52:22
 */
@Data
public class UserLevelEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer id;
    //
    private String name;
    //
    private String description;
}
