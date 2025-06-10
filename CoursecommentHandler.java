package com.itheima.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.mapper.CoursecommentMapper;
import com.itheima.domain.CoursecommentCust;
import com.itheima.config.util.IDUtil;
import com.itheima.domain.Coursecomment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
*@description: description
*@author: tangxiaocheng
*@create: 2021-02-13 10:07
*/
@Controller
@RequestMapping("/coursecomment")
public class CoursecommentHandler {

    @Autowired
    CoursecommentMapper coursecommentMapper;

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void addcomment(@RequestParam("sid") String sid,@RequestParam("cid")String cid,
                           @RequestParam("score")int score, @RequestParam("content")String content,
                           HttpServletResponse response) throws IOException {
        Coursecomment coursecomment = new Coursecomment();
        coursecomment.setCcid(IDUtil.getID());
        coursecomment.setCid(cid);
        coursecomment.setSid(sid);
        coursecomment.setScore(score);
        coursecomment.setContent(content);
        coursecommentMapper.insert(coursecomment);
        PrintWriter out=null;
        out=response.getWriter();
        out.flush();
        out.close();
    }


    @RequestMapping("/query/{cid}/{pn}")
    public String query(@PathVariable(value = "cid") String cid, Model model, HttpServletRequest request,
                        @PathVariable(value = "pn") String pn) {
        int no = Integer.parseInt(pn);
        PageHelper.startPage(no, 5);
        List<CoursecommentCust> commentList = coursecommentMapper.query(cid);
        PageInfo page = new PageInfo(commentList, 5);
        model.addAttribute("pageInfo", page);
        model.addAttribute("cid", cid);
        for (CoursecommentCust coursecommentCust:commentList){
            System.out.println(coursecommentCust);
        }
        model.addAttribute("commentList",commentList);
        return "teacher/seecomment";
    }


}
