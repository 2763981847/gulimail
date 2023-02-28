package com.oreki.gulimall.member;

import com.oreki.gulimall.member.feign.CouponFeignService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;

@SpringBootTest
class GulimallMemberApplicationTests {
    @Resource
    private CouponFeignService couponFeignService;

    @Test
    void contextLoads() {
        couponFeignService.test();
    }

}
