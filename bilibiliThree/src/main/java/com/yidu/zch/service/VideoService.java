package com.yidu.zch.service;

import java.util.List;
import java.util.Map;

import com.yidu.base.allEntity.Video;

/**
 * 视频信息管理
 * @author Z
 *
 */
public interface VideoService {
	
	/**
	 * 上传视频信息
	 */
	public int uploadVideo(Video video);
	
	/**
	 * 查询登录用户的所有上传视频
	 */
	public Map<String, Object> selectAllVideo(int userId, int stateId);
	
	/**
	 * 删除视频信息
	 */
	public int delVideo(int videoId);

	/**
	 * 修改视频信息
	 */
	public int updateVideo(Video video);
	
	/**
	 * 根据视频id查询视频信息
	 */
	public Video selectVideoById(int videoId);

}
