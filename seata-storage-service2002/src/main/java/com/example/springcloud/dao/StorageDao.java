package com.example.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @date 2020/3/8 15:35
 **/
@Mapper
public interface StorageDao {
    /**
     * 减库存
     * @param productId
     * @param count
     * @return
     */
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
