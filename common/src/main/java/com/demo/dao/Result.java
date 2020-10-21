/**
 * projectName: cloud2020- fileName: Result.java packageName: com.demo.dao date: 2020-09-20
 * copyright(c) 2017-2020 xxx公司
 */
package com.demo.dao;

import javax.print.DocFlavor;
import java.io.Serializable;

/**
 * @version: V1.0
 * @author: stjh756
 * @className: Result
 * @packageName: com.demo.dao
 * @description: 公共信息结果类
 * @data: 2020-09-20
 */
public class Result<T> implements Serializable {
    private Integer code;
    private String mesge;
    private T data;

    public Result(Integer code, String mesge, T data) {
        this.code = code;
        this.mesge = mesge;
        this.data = data;
    }

    public Result() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMesge() {
        return mesge;
    }

    public void setMesge(String mesge) {
        this.mesge = mesge;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
