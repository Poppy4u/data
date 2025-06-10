package com.itheima.mapper;

import com.itheima.domain.CoursecommentCust;
import com.itheima.domain.Coursecomment;

import java.util.List;

/**
 * @description: description
 * @author: tangxiaocheng
 * @create: 2021-02-09 16:11
 */
public interface CoursecommentMapper {

    /**
     *  新增
     */
    public int insert(Coursecomment course);

    /**
     *  删除
     */
    public int delete(String ccid);

    /**
     * 查询
     * @param cid
     * @return
     */
    List<CoursecommentCust> query(String cid);
}
