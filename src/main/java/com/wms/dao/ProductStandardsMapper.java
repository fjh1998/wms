package com.wms.dao;

import com.wms.modal.ProductStandards;

public interface ProductStandardsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductStandards record);

    int insertSelective(ProductStandards record);

    ProductStandards selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductStandards record);

    int updateByPrimaryKey(ProductStandards record);
}