package com.restaurant.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.restaurant.management.model.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>
{
}
