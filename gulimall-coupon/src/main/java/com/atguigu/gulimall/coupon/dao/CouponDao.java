package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhongbeiOS
 * @email 743250394@qq.com
 * @date 2021-01-05 15:51:44
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
