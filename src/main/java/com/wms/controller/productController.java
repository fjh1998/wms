package com.wms.controller;

import com.wms.common.RestResult;
import com.wms.service.Iexm.Iproduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/product")
public class productController {
    @Autowired
    Iproduct iproduct;

    @GetMapping("/getAllProduct")
    public RestResult getAllProduct(){
        return (RestResult) iproduct.getAllProduct();
    }
}
