package com.imooc.ad.service;

import com.imooc.ad.vo.CreativeRequest;
import com.imooc.ad.vo.CreativeResponse;

/**
 * @author CCY
 * @date 2019/5/28 18:51
 */
public interface ICreativeService {
    CreativeResponse createCreative(CreativeRequest request);
}
