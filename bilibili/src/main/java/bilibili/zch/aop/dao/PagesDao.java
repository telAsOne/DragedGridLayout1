package bilibili.zch.aop.dao;

import org.springframework.stereotype.Repository;

/**
 * 获取页面dao
 * @author Z
 *
 */
@Repository
public interface PagesDao {
	
	public void getIframePage(String iframeUrl);
}
