package com.dpcenter.service;

import com.dpcenter.dto.Result;
import com.dpcenter.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @since 2021-12-22
 */
public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    /** 压测对照：基础版 Redis→MySQL */
    Result queryByIdLegacyRedis(Long id);

    Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
