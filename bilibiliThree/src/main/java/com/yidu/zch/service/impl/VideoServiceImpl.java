package com.yidu.zch.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.zch.dao.VideoDao;
import com.yidu.zch.entity.Video;
import com.yidu.zch.service.VideoService;

/**
 * 视频信息管理实现
 * @author Z
 *
 */
@Service("videoService")
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	private VideoDao videoDao;

	/**
	 * 保存视频信息
	 */
	@Override
	public int uploadVideo(Video video) {
		int i = videoDao.uploadVideo(video);
		return i;
	}
	
	/**
	 * 查询登录用户的所有上传视频
	 */
	@Override
	public Map<String, Object> selectAllVideo(int userId, int stateId) {
		Video video = new Video();
		
		video.setVideoUpOfUser(userId);
		video.setVideoState(stateId);
		
		List<Video> allVideo = videoDao.selectAllVideo(video);
		
		int goVideo = 0;
		int okVideo = 0;
		int notVideo = 0;
		
		for (int j = 0; j < allVideo.size(); j++) {

			Video video2 = allVideo.get(j);
			if(video2.getVideoState() == 0){
				goVideo++;
			}else if(video2.getVideoState() == 1){
				okVideo++;
			}else if(video2.getVideoState() == 2){
				notVideo++;
			}
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("goVideo", goVideo);
		map.put("okVideo", okVideo);
		map.put("notVideo", notVideo);
		map.put("videoList", allVideo);
		
		return map;
	}

	/**
	 * 删除视频信息
	 */
	@Override
	public int delVideo(int videoId) {
		int i = videoDao.delVideo(videoId);
		return i;
	}

	/**
	 * 修改视频信息
	 */
	@Override
	public int updateVideo(Video video) {
		int i = videoDao.updateVideo(video);
		return i;
	}

	/**
	 * 根据视频id查询视频信息
	 */
	@Override
	public Video selectVideoById(int videoId) {
		Video videoById = videoDao.selectVideoById(videoId);
		return videoById;
	}

}
