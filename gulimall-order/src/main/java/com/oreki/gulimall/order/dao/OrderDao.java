package com.oreki.gulimall.order.dao;

import com.oreki.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-22 22:00:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
