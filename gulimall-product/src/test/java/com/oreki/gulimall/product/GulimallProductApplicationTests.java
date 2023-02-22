package com.oreki.gulimall.product;

import com.oreki.gulimall.product.entity.BrandEntity;
import com.oreki.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallProductApplicationTests {
    @Resource
    private BrandService brandService;

    @Test
    void contextLoads() {
        System.out.println(brandService
                .lambdaUpdate()
                .eq(BrandEntity::getBrandId,1)
                .set(BrandEntity::getName,"华为").update());
    }

}
