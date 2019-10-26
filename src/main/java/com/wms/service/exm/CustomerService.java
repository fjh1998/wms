package com.wms.service.exm;

import com.wms.common.RestResult;
import com.wms.common.ResultGenerator;
import com.wms.dao.SysCustomerMapper;
import com.wms.modal.SysCustomer;
import com.wms.service.Iexm.Icustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements Icustomer {

    @Autowired
    SysCustomerMapper sysCustomerMapper;
    @Autowired
    ResultGenerator resultGenerator;

    @Override
    public RestResult getAllcustomer(){
        List<SysCustomer>list = sysCustomerMapper.getAllcustomer();
        if(!list.isEmpty()){
            RestResult restResult= resultGenerator.getSuccessResult(list);
            return restResult;
        }else {
            return resultGenerator.getFailResult("获取失败");
        }
    }

    @Override
    public  RestResult updateByPrimaryKeySelective(SysCustomer sysCustomer){
        int flag=sysCustomerMapper.updateByPrimaryKeySelective(sysCustomer);
        List<SysCustomer>list = sysCustomerMapper.getAllcustomer();
        if(flag>0){
            return(resultGenerator.getSuccessResult(list));
        }else{
            return resultGenerator.getFailResult("更新失败");
        }
    }

    @Override
    public  RestResult deleteByPrimaryKey(Integer id){
        int flag=sysCustomerMapper.deleteByPrimaryKey(id);
        List<SysCustomer>list = sysCustomerMapper.getAllcustomer();
        if(flag>0){
            return(resultGenerator.getSuccessResult(list));
        }else{
            return resultGenerator.getFailResult("删除失败");
        }
    }
}
