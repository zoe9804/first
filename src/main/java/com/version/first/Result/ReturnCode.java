package com.version.first.Result;


public enum ReturnCode {
        SUCCESS("0000","查询成功有数据"),
        NODATA("0001","查询成功无记录"),
        FAILED("0002","查询失败"),
        EXCEPTION("0003","出现异常"),
        ACCOUNT_EXISTS("0004","用户已存在"),
        ACCOUNT_ERROR("1000", "账户不存在或被禁用"),
        API_NOT_EXISTS("1001", "请求的接口不存在"),
        API_NOT_PER("1002", "没有该接口的访问权限"),
        PARAMS_ERROR("1004", "参数为空或格式错误");

private String code;
private String msg;

public String getCode() {
        return code;
        }

public String getMsg() {
        return msg;
        }

        ReturnCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
        }

        }
