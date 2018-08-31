package com.yidu.hj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yidu.base.allEntity.Columns;
import com.yidu.base.allEntity.Draft;
import com.yidu.base.allMapper.ColumnsMapper;
import com.yidu.base.allMapper.DraftMapper;
import com.yidu.hj.dao.forntDao.SubmissionDao;
import com.yidu.hj.service.SubmissionService;
@Service("subscription")
public class SubmissionServiceImpl implements SubmissionService{
	@Autowired
	private ColumnsMapper columnsMapper;
	
	@Autowired
	private DraftMapper draftMapper;
	@Override
	@Transactional
	public int insertColumn(Columns columns) {
		int insert = columnsMapper.insert(columns);
		return insert;
	}
	@Override
	public int getIdUpdateContentAddress(Columns c) {
		return columnsMapper.updateByPrimaryKey(c);
	}
	
	@Override
	@Transactional
	public int insertDraft(Draft draft) {
		int insert = draftMapper.insert(draft);
		return insert;
	}
}
