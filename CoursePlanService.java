package com.itheima.service;

import com.itheima.domain.CourseGrade;
import com.itheima.domain.CoursePlan;

import java.util.List;

public interface CoursePlanService {

    /**
     *  添加课程安排
     * @param coursePlan   课程安排信息
     * @return  插入结果 !=0则插入成功
     */
    public int insertCoursePlan(CoursePlan coursePlan);

    /**
     *  根据排课班级名删除课程信息信息
     * @param courseclass   排课班级名
     * @return  删除结果，!=0则删除成功
     */
    public int deleteCoursePlan(String courseclass);

    /**
     *  修改课程信息
     * @param coursePlan   课程安排信息
     * @return  修改结果 !=0则修改成功
     */
    public int modifyCoursePlan(CoursePlan coursePlan);



    //查询全部课程安排，暂无需求
    //public List<CoursePlan> selectCoursePlanBySql(int pageNo, int pageSize);

    /**
     * 根据排课班级名查询课程安排信息
     * @param pageNo
     * @param pageSize
     * @param courseclass   开课班级名
     * @return  查询结果
     */
    public List<CoursePlan> getByCoursePlanCourseclass(int pageNo, int pageSize, String courseclass);

    /**
     * 根据教师id查询该教师所安排课程信息
     * @param pageNo
     * @param pageSize
     * @param tid   教师id
     * @return  查询结果
     */
    public List<CoursePlan> getByCoursePlanTid(int pageNo, int pageSize, String tid);

    /**
     * 根据教师id查询该教师所安排课程的课程编号，以方便查询课程具体信息
     * @param pageNo
     * @param pageSize
     * @param   tid     教师id
     * @return  查询结果
     */
    public List<CoursePlan> getCidByCoursePlanTid(int pageNo, int pageSize, String tid);

    /**
     * 根据课程id查询该课程的上课教师，以方便查询教师具体信息
     * @param pageNo
     * @param pageSize
     * @param   cid     课程编号
     * @return  查询结果
     */
    public List<CoursePlan> getTidByCoursePlanCid(int pageNo, int pageSize, String cid);

    /**
     * 根据上课时间、地点、查询课程安排信息，为了ajax查重
     * @param coursetime    上课时间
     * @param courseweek    上课周
     * @param classroom     上课教师
     * @return  查询结果
     */
    public String ajaxGetCoursePlan(String coursetime, String courseweek, String classroom);

    /**
     *  根据课程编号查询该课程，用于查询是否有有安排课程
     * @param cid
     * @return
     */
    public String existsCoursePlan(String cid);
    
    
    /**
     *  	根据课程编号查询该课程学分
     * @param cid
     * @return
     */
    public Integer getCreditsByCid(String cid);
    
    /**
     * 根据课程id查询该课程的上课教师，以方便查询教师具体信息
     * @param pageNo
     * @param pageSize
     * @param   cid     课程编号
     * @return  查询结果
     */
    public List<CourseGrade> getCourseGrade(int pageNo, int pageSize, String cid);

}
