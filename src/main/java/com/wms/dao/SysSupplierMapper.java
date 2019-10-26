package com.wms.dao;

import com.wms.modal.SysSupplier;

public interface SysSupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysSupplier record);

    int insertSelective(SysSupplier record);

    SysSupplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysSupplier record);

    int updateByPrimaryKey(SysSupplier record);
}