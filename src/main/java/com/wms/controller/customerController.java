package com.wms.controller;

import com.wms.common.RestResult;
import com.wms.modal.SysCustomer;
import com.wms.service.Iexm.Icustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/customer")
public class customerController {
    @Autowired
    Icustomer icustomer;

    @GetMapping("/getAllcustomer")
    public RestResult getAllcustomer(){
        return  icustomer.getAllcustomer();
    }

    @PostMapping("/Updateuser")
    public RestResult updateByPrimaryKeySelective(@RequestBody SysCustomer sysCustomer){
        return icustomer.updateByPrimaryKeySelective(sysCustomer);
    }

    @GetMapping("/Deleteuser")
    public  RestResult deleteByPrimaryKey(@RequestParam(value = "userid",required = false) Integer customerid){
        return icustomer.deleteByPrimaryKey(customerid);
    }
}
