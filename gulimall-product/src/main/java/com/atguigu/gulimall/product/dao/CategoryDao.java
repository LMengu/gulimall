package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author limengyu
 * @email limengyu@gmail.com
 * @date 2020-07-12 14:33:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
