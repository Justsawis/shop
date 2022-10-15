package com.lanxuan.order.mapper;

import com.lanxuan.order.info.OrderBase;
import com.lanxuan.order.info.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderBase getMoneyById(Integer id);

    List<OrderDetail> getOrderDetail(Integer orderId);
}
