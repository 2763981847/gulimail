package com.oreki.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oreki.common.utils.PageUtils;
import com.oreki.common.utils.Query;

import com.oreki.gulimall.product.dao.CategoryDao;
import com.oreki.gulimall.product.entity.CategoryEntity;
import com.oreki.gulimall.product.service.CategoryService;


/**
 * @author Oreki
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public List<CategoryEntity> listByTree() {
        return getChildren(0L);
    }

    private List<CategoryEntity> getChildren(Long parentCid) {
        List<CategoryEntity> categoryEntities = this.lambdaQuery().list();
        return categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid().equals(parentCid))
                .peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity.getCatId(), categoryEntities)))
                .sorted(Comparator.comparingInt(c -> Optional.ofNullable(c.getSort()).orElse(0)))
                .collect(Collectors.toList());
    }

    private List<CategoryEntity> getChildren(Long parentCid, List<CategoryEntity> categoryEntities) {
        return categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid().equals(parentCid))
                .peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity.getCatId(), categoryEntities)))
                .sorted(Comparator.comparingInt(c -> Optional.ofNullable(c.getSort()).orElse(0)))
                .collect(Collectors.toList());
    }
}