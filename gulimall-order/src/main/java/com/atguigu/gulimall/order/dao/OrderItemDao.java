package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author limengyu
 * @email limengyu@gmail.com
 * @date 2020-07-03 16:40:10
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
