package com.itheima.domain;

public class StuExitSelect implements java.io.Serializable {

    /**
     *  序列化
     */
    private static final long serialVersionUID = 1L;
    //课程编号
    private String cid;
    //课程名称
    private String Cname;
    //学号
    private String sid;
    //总人数
    private Integer totalNum;
    //学生总数
    private Integer stuSum;
    public String getCid() {
        return cid;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getCname() {
        return Cname;
    }
    public void setCname(String cname) {
        Cname = cname;
    }
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public void setStuSum(Integer stuSum) {
        this.stuSum = stuSum;
    }
    public Integer getStuSum() {
        return this.stuSum;
    }
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

}

