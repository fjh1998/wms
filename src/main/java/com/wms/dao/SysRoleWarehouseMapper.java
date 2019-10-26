package com.wms.dao;

import com.wms.modal.SysRoleWarehouse;

public interface SysRoleWarehouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleWarehouse record);

    int insertSelective(SysRoleWarehouse record);

    SysRoleWarehouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleWarehouse record);

    int updateByPrimaryKey(SysRoleWarehouse record);
}