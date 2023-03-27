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