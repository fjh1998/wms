package com.wms.controller;

import com.wms.common.RestResult;
import com.wms.modal.SysUser;
import com.wms.service.Iexm.Iuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class userController {
    @Autowired
    Iuser iuser;

    @RequestMapping("/getAlluser")
    public RestResult getAlluser(){
        return  iuser.getAlluser();
    }

    @PostMapping("/Updateuser")
    public RestResult updateByPrimaryKeySelective(@RequestBody SysUser user){
        return iuser.updateByPrimaryKeySelective(user);
    }

    @GetMapping("/Deleteuser")
    public  RestResult deleteByPrimaryKey(@RequestParam(value = "userid",required = false) Integer userid){
        return iuser.deleteByPrimaryKey(userid);
    }
}
