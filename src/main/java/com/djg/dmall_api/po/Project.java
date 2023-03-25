package com.djg.dmall_api.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * project
 * @author 
 */
@Data
public class Project implements Serializable {
    private Integer id;

    private String pj_Name;

    private String pj_Desc;

    private String pj_Mem;

    private Date pj_Create;

    private Date pj_Update;

    private String cs_Name;

    private static final long serialVersionUID = 1L;
}