package com.lanxuan.order.info;

import java.util.List;

public class OrderRto {
    private List<OrderDetail> list;
    private OrderBase orderBase;

    public List<OrderDetail> getList() {
        return list;
    }

    public void setList(List<OrderDetail> list) {
        this.list = list;
    }

    public OrderBase getOrderBase() {
        return orderBase;
    }

    public void setOrderBase(OrderBase orderBase) {
        this.orderBase = orderBase;
    }
}
