package com.platform.utils;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.platform.xss.SQLFilter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * MybatisPlus查询参数
 * 兼容原有的分页，所以不用原来的Query
 *
 * @author hukai
 * @email 365157138@qq.com
 * @date 2017-03-14 23:15
 */
public class QueryPlus<T> extends LinkedHashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    /**
     * mybatis-plus分页参数
     */
    private Page<T> page;
    /**
     * 当前页码
     */
    private int currPage = 1;
    /**
     * 每页条数
     */
    private int limit = 10;

    public static final String ASC = "asc";

    public QueryPlus(Map<String, Object> params) {

        String strPage = "page";
        String strLimit = "limit";
        this.putAll(params);

        //分页参数
        if (params.get(strPage) != null) {
            currPage = Integer.parseInt((String) params.get("page"));
        }
        if (params.get(strLimit) != null) {
            limit = Integer.parseInt((String) params.get("limit"));
        }

        this.put("offset", (currPage - 1) * limit);
        this.put("page", currPage);
        this.put("limit", limit);

        String sidx = (String) params.get("sidx");
        //默认升序
        Boolean asc = true;
        if (!StringUtils.isNullOrEmpty(params.get(ASC))) {
            asc = (Boolean) params.get("asc");
        }
        //mybatis-plus分页
        this.page = new Page<>(currPage, limit);

        //排序
        if (StringUtils.isNotEmpty(sidx)) {
            if (asc) {
                this.page.addOrder(OrderItem.asc(sidx));
            } else {
                this.page.addOrder(OrderItem.desc(sidx));
            }
        }

    }

    public Page<T> getPage() {
        return page;
    }

    public int getCurrPage() {
        return currPage;
    }

    public int getLimit() {
        return limit;
    }
}
