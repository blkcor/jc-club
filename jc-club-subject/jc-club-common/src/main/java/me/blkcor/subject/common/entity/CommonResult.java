package me.blkcor.subject.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用返回对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    // 状态码
    private Integer code;
    // 返回信息
    private String message;
    // 返回数据
    private T data;


    public static <T> CommonResult<T> success(){
        return new CommonResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), null);
    }

    public static <T> CommonResult<T> success(T data){
        return new CommonResult<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResult<T> failed(){
        return new CommonResult<>(ResultEnum.FAILED.getCode(), ResultEnum.FAILED.getMessage(), null);
    }

    public static <T> CommonResult<T> failed(String message){
        return new CommonResult<>(ResultEnum.FAILED.getCode(), message, null);
    }

    public static<T> CommonResult<T> failed(ResultEnum resultEnum){
        return new CommonResult<>(resultEnum.getCode(), resultEnum.getMessage(), null);
    }
}
