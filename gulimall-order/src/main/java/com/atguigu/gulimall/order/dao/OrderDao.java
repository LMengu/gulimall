package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author limengyu
 * @email limengyu@gmail.com
 * @date 2020-07-03 16:40:10
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
