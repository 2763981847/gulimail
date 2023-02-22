package com.oreki.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oreki.common.utils.PageUtils;
import com.oreki.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-22 21:51:48
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

