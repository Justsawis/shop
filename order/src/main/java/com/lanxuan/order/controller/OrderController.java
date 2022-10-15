package com.lanxuan.order.controller;

import com.lanxuan.order.info.OrderBase;
import com.lanxuan.order.info.OrderRto;
import com.lanxuan.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("getMoney")
    public @ResponseBody OrderRto getMoney(Integer id) {
        OrderRto rto = orderService.getMoney(id);
        return rto;
    }

    @GetMapping("getTest")
    public @ResponseBody Integer getTest(Integer id){
        return 1111;
    }
}

