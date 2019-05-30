package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.*;

/**
 * @author CCY
 * @date 2019/5/28 17:42
 */
public interface IAdUnitService {

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest creativeUnitRequest)throws AdException;

    AdUnitResponse createUnit(AdUnitResponse request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request) throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request) throws  AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request) throws AdException;

}
