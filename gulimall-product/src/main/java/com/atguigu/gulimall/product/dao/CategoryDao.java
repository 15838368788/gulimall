package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhongbeiOS
 * @email 743250394@qq.com
 * @date 2021-01-05 11:42:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
