package com.yidu.jyz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.base.allEntity.Videolabel;
import com.yidu.base.allMapper.VideolabelMapper;

@Service
public class VideolabelService {
	@Autowired
	public VideolabelMapper mapper;
	
	public List<Videolabel> getVideolable(){
		List<Videolabel> selectAll = mapper.selectAll();
		return selectAll;
	};
}
