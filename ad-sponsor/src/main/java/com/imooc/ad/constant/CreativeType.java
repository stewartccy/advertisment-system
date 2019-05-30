package com.imooc.ad.constant;

import lombok.Getter;

/**
 * @author CCY
 * @date 2019/5/28 14:59
 */
@Getter
public enum CreativeType {
    IMAGE(1,"图片"),
    VIDEO(2,"视频"),
    TEXT(3,"文本");

    private int type;
    private String desc;

    CreativeType(int type, String desc){
        this.desc = desc;
        this.type = type;
    }
}
