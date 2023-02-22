package com.oreki.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oreki.common.utils.PageUtils;
import com.oreki.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-21 13:46:00
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

