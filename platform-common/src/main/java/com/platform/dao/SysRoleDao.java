package com.platform.dao;

import com.platform.entity.SysRoleEntity;
import com.platform.entity.UserWindowDto;

import java.util.List;

/**
 * 角色管理
 *
 * @author hukai
 * @email 365157138@qq.com
 * @date 2023年9月18日 上午9:33:33
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

    /**
     * 查询用户创建的角色ID列表
     */
    List<Long> queryRoleIdList(Long createUserId);

    /**
     * 查询角色审批选择范围
     * @return
     */
    List<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto);
}
