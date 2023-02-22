package com.oreki.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oreki.common.utils.PageUtils;
import com.oreki.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-22 22:07:20
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

