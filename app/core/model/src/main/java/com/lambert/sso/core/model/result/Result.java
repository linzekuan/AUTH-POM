package com.lambert.sso.core.model.result;

import java.io.Serializable;

public class Result<T> implements Serializable {

	 /** serialId */
	private static final long serialVersionUID = -3035296152778492506L;


    public Result() {
        this.isSuccess = false;
    }

    /**
     * 返回的数据对象
     */
    private T                 data;
    /**
     * 错误类型CODE
     */
    private String            code;

    /**
     * 自定义错误信息
     */
    private String            resultMessage;

    private Boolean           isSuccess;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setResultFailMsg(String resultMessage){
        this.isSuccess = false;
        this.resultMessage = resultMessage;

    }
}
