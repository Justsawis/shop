package com.lanxuan.order.service;

import com.lanxuan.order.info.OrderBase;
import com.lanxuan.order.mapper.OrderMapper;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;
    public OrderBase getMoney(Integer id){
        return orderMapper.getMoneyById(id);
    }
}
