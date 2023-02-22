package com.example.msscpizzaorder.service;

import com.example.model.dto.PizzaOrderDto;
import com.example.model.dto.PizzaOrderPagedList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PizzaOrderServiceImpl implements PizzaOrderService{

    @Override
    public PizzaOrderPagedList listOrders(Long customerId, Pageable pageable) {
        return null;
    }

    @Override
    public PizzaOrderDto placeOrder(Long customerId, PizzaOrderDto beerOrderDto) {
        return null;
    }

    @Override
    public PizzaOrderDto getOrderById(Long customerId, Long orderId) {
        return null;
    }

    @Override
    public void pickupOrder(Long customerId, Long orderId) {

    }
}
