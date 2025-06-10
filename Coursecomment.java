package com.itheima.domain;

import java.sql.Timestamp;

/**
 * @description: description
 * @author: tangxiaocheng
 * @create: 2021-02-09 16:12
 */
public class Coursecomment implements java.io.Serializable{
    /**
     *  序列化
     */
    private static final long serialVersionUID = 1L;
    private String ccid;
    private String cid;
    private String sid;
    private String content;
    private Integer score;
    private Timestamp ctime;

    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }
}
