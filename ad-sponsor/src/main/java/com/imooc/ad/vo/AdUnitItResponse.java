package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author CCY
 * @date 2019/5/28 18:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdUnitItResponse {
    private List<Long> ids;
}
