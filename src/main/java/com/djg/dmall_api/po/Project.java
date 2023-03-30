package com.djg.dmall_api.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * project
 *
 * @author
 */
@Data
public class Project implements Serializable {

    private Integer id;

    private String pj_Name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPj_Name() {
        return pj_Name;
    }

    public void setPj_Name(String pj_Name) {
        this.pj_Name = pj_Name;
    }

    public String getPj_Desc() {
        return pj_Desc;
    }

    public void setPj_Desc(String pj_Desc) {
        this.pj_Desc = pj_Desc;
    }

    public String getPj_Mem() {
        return pj_Mem;
    }

    public void setPj_Mem(String pj_Mem) {
        this.pj_Mem = pj_Mem;
    }

    public Date getPj_Create() {
        return pj_Create;
    }

    public void setPj_Create(Date pj_Create) {
        this.pj_Create = pj_Create;
    }

    public Date getPj_Update() {
        return pj_Update;
    }

    public void setPj_Update(Date pj_Update) {
        this.pj_Update = pj_Update;
    }

    public String getCs_Name() {
        return cs_Name;
    }

    public void setCs_Name(String cs_Name) {
        this.cs_Name = cs_Name;
    }

    private String pj_Desc;

    private String pj_Mem;
    //解决fastjson返回到前端，转成时间戳问题
    /**
     * @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
     * 解决fastjson返回到前端，转成时间戳问题
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date pj_Create;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date pj_Update;

    private String cs_Name;

    private static final long serialVersionUID = 1L;
}