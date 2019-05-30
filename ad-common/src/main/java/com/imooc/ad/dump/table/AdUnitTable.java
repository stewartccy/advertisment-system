package com.imooc.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CCY
 * @date 2019/5/29 16:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitTable {
    private Long unitId;
    private Integer unitStatus;
    private Integer positionType;

    private Long planId;
}
