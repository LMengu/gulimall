package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author limengyu
 * @email limengyu@gmail.com
 * @date 2020-07-03 15:01:04
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
