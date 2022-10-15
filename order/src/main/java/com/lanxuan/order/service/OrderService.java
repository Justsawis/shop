package com.lanxuan.order.service;

import com.lanxuan.order.info.OrderBase;
import com.lanxuan.order.info.OrderRto;
import com.lanxuan.order.mapper.OrderMapper;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public OrderRto getMoney(Integer id) {
        List list = orderMapper.getOrderDetail(id);
        OrderBase orderBase = orderMapper.getMoneyById(id);
        OrderRto orderRto = new OrderRto();
        orderRto.setOrderBase(orderBase);
        orderRto.setList(list);
        return orderRto;
    }

    public List getOrderDetail(Integer orderId) {
        return orderMapper.getOrderDetail(orderId);
    }
}
