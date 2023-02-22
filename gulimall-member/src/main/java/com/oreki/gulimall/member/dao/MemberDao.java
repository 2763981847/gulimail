package com.oreki.gulimall.member.dao;

import com.oreki.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author oreki
 * @email 2763981847@qq.com
 * @date 2023-02-22 21:51:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
