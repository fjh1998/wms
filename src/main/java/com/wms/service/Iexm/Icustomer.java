package com.wms.service.Iexm;

import com.wms.common.RestResult;
import com.wms.modal.SysCustomer;

public interface Icustomer {
    RestResult getAllcustomer();
    RestResult updateByPrimaryKeySelective(SysCustomer sysCustomer);
    RestResult deleteByPrimaryKey(Integer id);
}
