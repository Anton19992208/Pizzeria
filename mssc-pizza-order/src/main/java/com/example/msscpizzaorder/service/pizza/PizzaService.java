package com.example.msscpizzaorder.service.pizza;

import com.example.model.dto.PizzaDto;

import java.util.Optional;

public interface PizzaService {

    Optional<PizzaDto> fondPizzaById(Long id);

    Optional<PizzaDto> fondPizzaByUpc(String upc);
}
