package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author CCY
 * @date 2019/5/28 17:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdUnitKeywordRequest {

    private List<UnitKeyword> unitKeywordList;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UnitKeyword{
        private Long unitId;
        private String keyword;
    }
}
