package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author limengyu
 * @email limengyu@gmail.com
 * @date 2020-07-03 16:26:20
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
