package com.java.goit.dao;

import com.java.goit.model.Dish;

import java.util.List;

public interface DishDao {

    void save(Dish dish);

    List<Dish> findAll();

    Dish findByName(String name);

    void removeAll();

}
