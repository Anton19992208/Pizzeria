package com.example.msscpizzaorder.mapper;

import com.example.model.dto.PizzaOrderLineDto;
import com.example.msscpizzaorder.domain.PizzaOrderLine;
import org.mapstruct.Mapper;

@Mapper
public interface PizzaOrderLineMapper {

    PizzaOrderLineDto pizzaOrderLineToPizzaOrderLineDto(PizzaOrderLine pizzaOrderLine);

    PizzaOrderLine pizzaOrderLineDtoToPizzaOrderLine(PizzaOrderLineDto pizzaOrderLineDto);
}
