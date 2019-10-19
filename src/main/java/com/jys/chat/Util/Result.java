package com.jys.chat.Util;

public class Result {
    private int ResultCode;
    private int id;
    private String Reason;
    private Route data;

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int resultCode) {
        ResultCode = resultCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public Route getData() {
        return data;
    }

    public void setData(Route data) {
        this.data = data;
    }
}
