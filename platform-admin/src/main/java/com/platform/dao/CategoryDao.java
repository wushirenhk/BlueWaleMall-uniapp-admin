package com.platform.dao;

import com.platform.entity.CategoryEntity;

/**
 * Dao
 *
 * @author hukai
 * @email 365157138@qq.com
 * @date 2017-08-21 15:32:31
 */
public interface CategoryDao extends BaseDao<CategoryEntity> {

    public int deleteByParentBatch(Object[] id);
}
