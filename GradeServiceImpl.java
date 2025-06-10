package com.itheima.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itheima.domain.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.mapper.GradeMapper;
import com.itheima.service.GradeService;

@Service
public class GradeServiceImpl implements GradeService {

	@Mapper
	private GradeMapper gradeMapper;
	
	@Override
	public int insertGrade(Grade grade) {
		//如果已经录入过分数就进行跟新或者先删除以前的
		gradeMapper.deleteGrade(grade.getCid(),grade.getSid());
		return gradeMapper.insertGrade(grade);
	}

	@Override
	public String queryCreditsSum(String sid) {
		return gradeMapper.queryCreditsSum(sid);
	}

	@Override
	public List<Grade> getEedCourseBySid(int pageNo, int pageSize, String sid) {
		Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("sid",sid);
        return gradeMapper.getEedCourseBySid(data);
	}

}
