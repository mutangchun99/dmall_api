package com.djg.dmall_api.common.constant;

/**
 * @author mac
 */

public enum ResultCodeEnum {
    /**
     * 失败
     */
    ERROR(4000, "失败"),
    /**
     * 业务异常
     */
    BIZ_ERROR(4001, "业务异常"),
    /**
     * 文件最大限制
     */
    FILE_OUT_MAX(4002, "文件最大限制"),
    /**
     * 文件格式不正确
     */
    FILE_FORMAT_ERROR(4003, "文件格式不正确"),
    /**
     * 参数错误
     */
    PARAM_ERROR(4004, "参数错误"),
    /**
     * Json解析异常
     */

    JSON_FORMAT_ERROR(4005, "Json解析异常"),
    /**
     * Sql解析异常
     */
    SQL_ERROR(4006, "Sql解析异常"),
    /**
     * 网络超时
     */
    NETWORK_TIMEOUT(4007, "网络超时"),
    /**
     * 未知的接口
     */
    UNKNOWN_INTERFACE(4008, "未知的接口"),
    /**
     * 请求方法不支持
     */
    REQ_MODE_NOT_SUPPORTED(4009, "请求方法不支持"),
    /**
     * 系统异常
     */
    SYS_ERROR(4010, "系统异常"),
    /**
     * 成功
     */
    SUCCESS(200, "成功");

    private int code;
    private String msg;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
