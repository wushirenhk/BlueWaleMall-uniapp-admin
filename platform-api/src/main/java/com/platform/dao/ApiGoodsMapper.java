package com.platform.dao;

import com.platform.entity.GoodsVo;

import java.util.List;
import java.util.Map;

/**
 * @author hukai
 * @email 365157138@qq.com
 * @gitee https://gitee.com/fuyang_hukai/platform
 * @date 2017-08-11 09:16:45
 */
public interface ApiGoodsMapper extends BaseDao<GoodsVo> {

    List<GoodsVo> queryHotGoodsList(Map<String, Object> params);

    List<GoodsVo> queryCatalogProductList(Map<String, Object> params);
}
