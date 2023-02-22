package com.example.msscpizzaorder.service;

import com.example.model.dto.PizzaOrderDto;
import com.example.msscpizzaorder.domain.PizzaOrder;
import com.example.msscpizzaorder.domain.PizzaOrderEvent;
import com.example.msscpizzaorder.domain.PizzaOrderStatus;
import com.example.msscpizzaorder.repository.PizzaOrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PizzaOrderManagerImpl implements PizzaOrderManager{

    public static final String ORDER_ID_HEADER = "ORDER_ID_HEADER";

    private final StateMachineFactory<PizzaOrderStatus, PizzaOrderEvent> stateMachineFactory;
    private final PizzaOrderRepository pizzaOrderRepository;

    @Override
    public PizzaOrder newPizzaOrder(PizzaOrder pizzaOrder) {
        return null;
    }

    @Override
    public void processValidationResult(Long pizzaOrderId, Boolean isValid) {

    }

    @Override
    public void pizzaOrderAllocationPassed(PizzaOrderDto pizzaOrderDto) {

    }

    @Override
    public void pizzaOrderAllocationPendingInventory(PizzaOrderDto pizzaOrderDto) {

    }

    @Override
    public void pizzaOrderAllocationFailed(PizzaOrderDto pizzaOrderDto) {

    }

    @Override
    public void pizzaOrderPickedUp(Long id) {

    }

    @Override
    public void cancelOrder(Long id) {

    }
}
