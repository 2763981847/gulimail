package com.oreki.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.oreki.gulimall.product.entity.CategoryEntity;
import com.oreki.gulimall.product.service.CategoryService;
import com.oreki.common.utils.PageUtils;
import com.oreki.common.utils.R;


/**
 * 商品三级分类
 *
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-21 13:46:01
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有分类及其子分类，并以树形结构组装起来
     */
    @GetMapping("/list/tree")
    public R listByTree() {
        List<CategoryEntity> categoryEntities = categoryService.listByTree();
        return R.ok().put("data", categoryEntities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.deleteByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
