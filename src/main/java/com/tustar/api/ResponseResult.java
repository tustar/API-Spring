package com.tustar.api;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private Integer code = 200;
    private String msg = "";
    private T data;

    public ResponseResult(T data) {
        this.data = data;
    }
}
