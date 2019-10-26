package com.wms.dao;

import com.wms.modal.ProductOutRecord;

public interface ProductOutRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductOutRecord record);

    int insertSelective(ProductOutRecord record);

    ProductOutRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductOutRecord record);

    int updateByPrimaryKey(ProductOutRecord record);
}