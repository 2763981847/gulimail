package com.oreki.gulimall.coupon.dao;

import com.oreki.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-22 21:44:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
