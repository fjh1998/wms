package com.wms.dao;

import com.wms.modal.StorageInfo;
import com.wms.modal.StorageInfoKey;

public interface StorageInfoMapper {
    int deleteByPrimaryKey(StorageInfoKey key);

    int insert(StorageInfo record);

    int insertSelective(StorageInfo record);

    StorageInfo selectByPrimaryKey(StorageInfoKey key);

    int updateByPrimaryKeySelective(StorageInfo record);

    int updateByPrimaryKey(StorageInfo record);
}