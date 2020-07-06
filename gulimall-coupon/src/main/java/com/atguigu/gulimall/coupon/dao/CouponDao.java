package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author limengyu
 * @email limengyu@gmail.com
 * @date 2020-07-03 16:13:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
