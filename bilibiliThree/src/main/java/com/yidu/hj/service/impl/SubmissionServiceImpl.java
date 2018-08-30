package com.yidu.hj.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.base.allEntity.Columns;
import com.yidu.base.allMapper.ColumnsMapper;
import com.yidu.hj.service.SubmissionService;
@Service("subscription")
public class SubmissionServiceImpl implements SubmissionService{
	@Autowired
	private ColumnsMapper columnsMapper;
	@Override
	public int insertColumn(Columns columns) {
		int insert = columnsMapper.insert(columns);
		return insert;
	}
}
