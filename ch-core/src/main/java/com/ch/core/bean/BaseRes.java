package com.ch.core.bean;

import lombok.Data;

@Data
public class BaseRes {
    private Integer code;

    private String msg;


    private T data;
}
