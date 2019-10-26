package com.wms.dao;

import com.wms.modal.SysWarehouse;

public interface SysWarehouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysWarehouse record);

    int insertSelective(SysWarehouse record);

    SysWarehouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysWarehouse record);

    int updateByPrimaryKey(SysWarehouse record);
}