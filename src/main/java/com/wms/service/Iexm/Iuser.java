package com.wms.service.Iexm;

import com.wms.common.RestResult;
import com.wms.modal.SysUser;

public interface Iuser {
    RestResult getAlluser();
    RestResult updateByPrimaryKeySelective(SysUser user);
    RestResult deleteByPrimaryKey(Integer id);
}
