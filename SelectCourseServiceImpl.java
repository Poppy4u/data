package com.itheima.service.impl;

import com.itheima.domain.SC;
import com.itheima.domain.StuExitSelect;
import com.itheima.domain.StuSelectResult;
import com.itheima.mapper.SelectCourseMapper;
import com.itheima.domain.Student;
import com.itheima.service.SelectCourseService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelectCourseServiceImpl implements SelectCourseService {

    @Mapper
    private SelectCourseMapper selectCourseMapper;

    /**
     * 选课
     * @return  选课结果
     */
    @Override
    public int selectCourse(String cid, String sid) {
        return selectCourseMapper.selectCourse(cid,sid);
    }

    /**
     * 判断是否加入过此课程
     * @param cid   课程编号
     * @param sid   学号
     * @return
     */
    @Override
    public String existCourse(String cid, String sid) {
        return selectCourseMapper.existCourse(cid,sid);
    }

    /**
     * 查询全部
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    @Override
    public List<SC> getAllSC(int pageNo, int pageSize, String sid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("sid",sid);
        return selectCourseMapper.getAllSC(data);
    }

    /**
     * 根据课程编号查询课程选课信息
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param cid       课程编号
     * @return  查询结果
     */
    @Override
    public List<SC> getSCByCid(int pageNo, int pageSize, String cid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("cid",cid);
        return selectCourseMapper.getSCByCid(data);
    }

    /**
     * 根据学号查询本人已选课程
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    @Override
    public List<StuSelectResult> getSCBySid(int pageNo, int pageSize, String sid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("sid",sid);
        return selectCourseMapper.getSCBySid(data);
    }

    /**
     * 根据学号退选（待确定··）
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    @Override
    public List<StuExitSelect> getExitBysid(int pageNo, int pageSize, String sid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("sid",sid);
        return selectCourseMapper.getExitBysid(data);
    }


    /**
     * 退选
     * @param cid
     * @return
     */
    @Override
    public int deleteSC(String cid,String sid) {
        return selectCourseMapper.deleteSC(cid,sid);
    }

    /**
     * 查看课程已选人数
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param tid       教师编号
     * @return
     */
    @Override
    public List<StuExitSelect> getLookByTid(int pageNo, int pageSize, String tid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("tid",tid);
        return selectCourseMapper.getLookByTid(data);
    }

    /**
     * 查看课程的学生详细信息
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param cid       课程编号
     * @return
     */
    @Override
    public List<Student> getByStuSid(int pageNo, int pageSize, String cid) {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("pageNo",(pageNo-1) * pageSize);
        data.put("pageSize",pageSize);
        data.put("cid",cid);
        return selectCourseMapper.getByStuSid(data);
    }
}
