package com.example.demo.Service.Order;

import com.example.demo.DTO.PlaceOrder;

public interface OrderService {

    String createOrderAndAddItems(PlaceOrder placeOrderRequest);
}
