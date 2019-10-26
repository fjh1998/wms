package com.wms.dao;

import com.wms.modal.ProductInRecord;

public interface ProductInRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductInRecord record);

    int insertSelective(ProductInRecord record);

    ProductInRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductInRecord record);

    int updateByPrimaryKey(ProductInRecord record);
}