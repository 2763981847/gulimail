package com.oreki.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oreki.common.utils.PageUtils;
import com.oreki.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-22 21:51:49
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

