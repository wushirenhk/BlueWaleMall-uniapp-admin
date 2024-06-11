package com.platform.dao;

import com.platform.entity.SysRoleMenuEntity;

import java.util.List;

/**
 * 角色与菜单对应关系
 *
 * @author hukai
 * @email 365157138@qq.com
 * @date 2023年9月18日 上午9:33:46
 */
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {

    /**
     * 根据角色ID，获取菜单ID列表
     */
    List<Long> queryMenuIdList(Long roleId);
}
