package com.user.service.base;

import javax.annotation.Resource;

import com.user.util.CacheUtil;

/**
 * 抽象服务类模板
 * @author Administrator
 *
 */
public abstract class BaseService {
	/**
	 * 注入缓存工具类
	 */
	protected CacheUtil cache;
	@Resource(name="cacheUtil")
	public void setEhCache(CacheUtil cache) {
	   this.cache = cache;
	}
}
