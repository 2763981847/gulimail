package com.oreki.gulimall.product.dao;

import com.oreki.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-21 13:46:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
