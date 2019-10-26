package com.wms.service.exm;

import com.wms.common.RestResult;
import com.wms.common.ResultGenerator;
import com.wms.dao.ProductMapper;
import com.wms.dto.productDTO;
import com.wms.service.Iexm.Iproduct;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements Iproduct {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ResultGenerator resultGenerator;

    @Override
    public RestResult getAllProduct(){
        List<productDTO>list = productMapper.getAllProduct();
        if(!list.isEmpty()){
            RestResult restResult= resultGenerator.getSuccessResult(list);
            return restResult;
        }else {
            return resultGenerator.getFailResult("获取失败");
        }
    }
}
