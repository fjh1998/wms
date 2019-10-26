package com.wms.service.exm;

import com.wms.common.RestResult;
import com.wms.common.ResultGenerator;
import com.wms.dao.SysUserMapper;
import com.wms.modal.SysUser;
import com.wms.service.Iexm.Iuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements Iuser {

    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    ResultGenerator resultGenerator;
    @Override
    public RestResult getAlluser(){
        List<SysUser>list = sysUserMapper.getAlluser();
        if(!list.isEmpty()){
            return resultGenerator.getSuccessResult(list);
        }else{
            return resultGenerator.getFailResult("用户表获取失败!");
        }
    }

    @Override
    public  RestResult updateByPrimaryKeySelective(SysUser sysuser){
        int flag=sysUserMapper.updateByPrimaryKeySelective(sysuser);
        List<SysUser>list = sysUserMapper.getAlluser();
        if(flag>0){
            return(resultGenerator.getSuccessResult(list));
        }else{
            return resultGenerator.getFailResult("更新失败");
        }
    }

    @Override
    public  RestResult deleteByPrimaryKey(Integer id){
        int flag=sysUserMapper.deleteByPrimaryKey(id);
        List<SysUser>list = sysUserMapper.getAlluser();
        if(flag>0){
            return(resultGenerator.getSuccessResult(list));
        }else{
            return resultGenerator.getFailResult("删除失败");
        }
    }
}
