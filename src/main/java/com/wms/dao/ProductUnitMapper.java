package com.wms.dao;

import com.wms.modal.ProductUnit;

public interface ProductUnitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductUnit record);

    int insertSelective(ProductUnit record);

    ProductUnit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductUnit record);

    int updateByPrimaryKey(ProductUnit record);
}