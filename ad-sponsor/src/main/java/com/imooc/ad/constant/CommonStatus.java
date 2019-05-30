package com.imooc.ad.constant;

import lombok.Getter;

/**
 * @author CCY
 * @date 2019/5/27 21:52
 */
@Getter
public enum CommonStatus {
    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc){
        this.status = status;
        this.desc = desc;
    }
}
