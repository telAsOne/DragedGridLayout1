package bilibili.zch.aop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bilibili.zch.aop.dao.PagesDao;
import bilibili.zch.aop.service.PagesService;

/**
 * 管理网页页面显示
 * @author Z
 *
 */
@Service("pagesService")
public class PagesServiceImpl implements PagesService{
	
	@Autowired
	private PagesDao pagesDao;

	@Override
	public void getIframePage(String iframeUrl) {
		pagesDao.getIframePage(iframeUrl);
	}
	
}
