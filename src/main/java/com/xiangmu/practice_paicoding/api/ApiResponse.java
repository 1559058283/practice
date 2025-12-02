package com.xiangmu.practice_paicoding.api;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ApiResponse {
    private String code;
    private String msg;
    private Object data;
    public ApiResponse(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
