package com.Presupuesto.LogicaNegocio;

import com.Presupuesto.entidades.Movimiento;
import com.Presupuesto.repo.InterfaceRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ImplementacionReportes implements InterfaceReportes {
    private InterfaceRepository repository;

    public ImplementacionReportes(InterfaceRepository repository){

        this.repository = repository;
    }

    @Override
    public List<String> getMovimientos() {
        Movimiento m = new Movimiento("nombre",
                "USD",
                "Cat",
                2) {
            @Override
            public String getDetails() {
                return "";
            }
        };

        return this.repository.read().stream().map(item -> item + "\n")
                .collect(Collectors.toList());
    }

    @Override
    public void getGastos() {
        this.repository.read();
    }

}
