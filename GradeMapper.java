package com.itheima.mapper;

import java.util.List;
import java.util.Map;

import com.itheima.domain.Grade;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
	 /**
     * 	 添加成绩
     * @param grade   成绩
     * @return  插入结果 !=0则插入成功
     */
    public int insertGrade(Grade grade);

    public int deleteGrade(@Param("cid") String cid, @Param("sid")String sid);

    /**
     * 	查询学生自己的总学分
     */
    public String queryCreditsSum(String sid);
    
    /**
     * 	学生查看本人已修改课程
     */
    public List<Grade> getEedCourseBySid(Map<String, Object> data);

    /**
     * 	查询学生某个课程的学分
     */
    public int getGrade(@Param("sid")String sid,@Param("cid")String cid);

}
