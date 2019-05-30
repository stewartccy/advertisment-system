package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @author CCY
 * @date 2019/5/28 15:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreateUserRequest {

    private String username;
    public boolean validate(){
        return !StringUtils.isEmpty(username);
    }
}
