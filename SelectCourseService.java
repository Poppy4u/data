package com.itheima.service;

import com.itheima.domain.SC;
import com.itheima.domain.StuExitSelect;
import com.itheima.domain.StuSelectResult;
import com.itheima.domain.Student;

import java.util.List;

public interface SelectCourseService {

    /**
     * 选课
     * @return  选课结果
     */
    public int selectCourse(String cid, String sid);

    /**
     * 判断是否加入过此课程
     * @param cid   课程编号
     * @param sid   学号
     * @return
     */
    public String existCourse(String cid, String sid);

    /**
     * 查询全部
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    public List<SC> getAllSC(int pageNo, int pageSize, String sid);

    /**
     * 根据课程编号查询课程选课信息
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param cid       课程编号
     * @return  查询结果
     */
    public List<SC> getSCByCid(int pageNo, int pageSize, String cid);

    /**
     * 根据学号查询本人已选课程
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    public List<StuSelectResult> getSCBySid(int pageNo, int pageSize, String sid);

    /**
     * 根据学号退选（待确定··）
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param sid       学号
     * @return  查询结果
     */
    public List<StuExitSelect> getExitBysid(int pageNo, int pageSize, String sid);

    /**
     * 退选
     * @param cid
     * @return
     */
    public int deleteSC(String cid,String sid);

    /**
     * 查看课程已选人数
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param tid       教师编号
     * @return
     */
    public List<StuExitSelect> getLookByTid(int pageNo, int pageSize, String tid);

    /**
     * 查看课程的学生详细信息
     * @param pageNo    起始条
     * @param pageSize      终止条
     * @param cid       课程编号
     * @return
     */
    public List<Student> getByStuSid(int pageNo, int pageSize, String cid);

}
