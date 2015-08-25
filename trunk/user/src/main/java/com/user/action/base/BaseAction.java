package com.user.action.base;

import javax.annotation.Resource;

import com.user.entity.page.Page;
import com.user.util.CacheUtil;

public abstract class BaseAction {
	/**
	 * 处理分页对象，将起始偏移量和每页显示个数防止到page的map里，传给MYBATIS
	 * @param page
	 */
	protected void processPage(Page page) {
		if (page != null) {
			page.getCondition().put("startIndex", page.getStartIndex());
			page.getCondition().put("pageSize", page.getPageSize());
		}
	}
	
	/**
	 * 注入缓存工具类
	 */
	protected CacheUtil cache;
	@Resource(name="cacheUtil")
	public void setEhCache(CacheUtil cache) {
	   this.cache = cache;
	}
}
