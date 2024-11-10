package me.blkcor.subject.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultEnum {
    SUCCESS(200, "成功"),
    FAILED(500, "失败");

    private final Integer code;
    private final String message;
}
