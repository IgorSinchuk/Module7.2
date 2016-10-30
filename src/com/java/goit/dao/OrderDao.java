package com.java.goit.dao;

import com.java.goit.model.Orders;

import java.util.List;

public interface OrderDao {

    void save(Orders orders);

    List<Orders> findAllOrders();

    void removeAll();

}
