package com.yidu.jyz.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.base.allEntity.Videolabel;
import com.yidu.base.allMapper.VideolabelMapper;
import com.yidu.jyz.service.VideolabelService;

@Service
public class VideolabelServiceImpl implements VideolabelService{
	@Autowired
	public VideolabelMapper mapper;
	
	public List<Videolabel> getVideolable(){
		List<Videolabel> selectAll = mapper.selectAll();
		return selectAll;
	};
}
