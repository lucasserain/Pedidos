package com.serain.pedidos.adapter.http.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StandardError {

    private Integer status;
    private String message;
    private Long timeStamp;
}
