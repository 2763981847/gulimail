package com.oreki.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oreki.common.utils.PageUtils;
import com.oreki.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-22 22:00:46
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

