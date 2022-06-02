package com.tangshi.templatetest.exception;

/**
 * code可以作为统一的应答码
 * @author zhengjt
 * @date 20220324
 */
public enum BizExceptionEnums {
    SUCCEED_CODE("00000", "处理成功");

    private String code;
    private String msg;

    BizExceptionEnums(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static BizExceptionEnums statOf(String code) {
        for (BizExceptionEnums state : values())
            if (state.getCode().equals(code))
                return state;
        return null;
    }
}