package com.mybook.app.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则匹配 url 扫描 xml
 */
@CacheConfig(cacheNames = "docheckUrls")
@Configuration
public class MatchUrlUtils {

	private Pattern pattern = null;
	private Matcher match = null;
	@Value("${mybook-app.notcheckLoginUrl}")
	private String checkLoginUrls;
	/**
	 * 
	 * @param url
	 * @param
	 * @return
	 * 
	 *         正则匹配url
	 */
	@Cacheable("docheckUrls")
	public boolean checkUrls(String url){
		return isMactchUrl(checkLoginUrls, url);
	}

	private boolean isMactchUrl(String urls, String url) {
		// 判断含有 url
		if (null == urls) {
			return false;
		}
		List<String> urlsList = Arrays.asList(urls.split(","));

		for(String params:urlsList){
			// 匹配成功，跳出循环
			if (url.contentEquals(params)) {
				return true;
			}
			pattern = Pattern.compile(params);
			match = pattern.matcher(url);
			// 匹配成功，跳出循环
			if (match.matches()) {
				return true;
			}
		}
		return false;
	}

}
