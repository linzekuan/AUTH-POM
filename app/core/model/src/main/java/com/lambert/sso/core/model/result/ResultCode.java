package com.lambert.sso.core.model.result;

/**
 * @author lambert
 * @version $Id: ResultCode.java, v 0.1 2020年01月18日 3:26 PM lambert Exp $
 */
public enum  ResultCode {

    TOKEN_NON_EXISTENT("TOKEN_NON_EXISTENT","TOKEN 错误");

    private String code;

    private String desc;

    ResultCode(String code, String desc) {

        this.code = code;
        this.desc = desc;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
