package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import org.omg.SendingContext.RunTime;

/**
 * @Author: dealsky
 * @Date: 2018/5/1 18:17
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
