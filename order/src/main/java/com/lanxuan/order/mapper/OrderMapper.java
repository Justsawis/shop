package com.lanxuan.order.mapper;

import com.lanxuan.order.info.OrderBase;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    OrderBase getMoneyById(Integer id);
}
