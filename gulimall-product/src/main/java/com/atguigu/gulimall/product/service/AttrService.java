package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.AttrGroupRelationVo;
import com.atguigu.gulimall.product.vo.AttrRespVo;
import com.atguigu.gulimall.product.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author limengyu
 * @email limengyu@gmail.com
 * @date 2020-07-12 14:33:52
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void saveAttr(AttrVo attr);

    void updateAttr(AttrVo attr);
}

