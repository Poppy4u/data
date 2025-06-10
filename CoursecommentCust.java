package com.itheima.domain;

/**
 * @description: description
 * @author: tangxiaocheng
 * @create: 2021-02-13 11:31
 */
public class CoursecommentCust extends Coursecomment{
    private String cname;
    private String sname;
    private String tname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "CoursecommentCust{" +
                "cname='" + cname + '\'' +
                ", sname='" + sname + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }
}
