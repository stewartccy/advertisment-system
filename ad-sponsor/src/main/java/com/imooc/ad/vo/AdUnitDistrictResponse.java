package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author CCY
 * @date 2019/5/28 18:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdUnitDistrictResponse {
    private List<Long> ids;
}
