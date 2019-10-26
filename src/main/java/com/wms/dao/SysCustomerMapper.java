package com.wms.dao;

import com.wms.modal.SysCustomer;

import javax.validation.constraints.Max;
import java.util.List;

public interface SysCustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCustomer record);

    int insertSelective(SysCustomer record);

    SysCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCustomer record);

    int updateByPrimaryKey(SysCustomer record);
    List<SysCustomer> getAllcustomer();
}