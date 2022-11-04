package org.soulcodeacademy.helpr.controllers;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CargoController {
    @Autowired
    private CargoService cargoService;

    @GetMapping("/cargos")
    public List<Cargo> listar(){
        return this.cargoService.listar();
    }

    @GetMapping("/cargos/{id}")
    public Cargo findCargoById(@PathVariable Integer id){
        return this.cargoService.getCargoPorId(id);
    }

    @PostMapping("/cargos")
    public Cargo salvar(@RequestBody Cargo cargo){
        return this.cargoService.salvar(cargo);
    }

    @PutMapping("/cargos/{id}")
    public Cargo atualizar(@PathVariable Integer id, @RequestBody Cargo cargo){
        return this.cargoService.atualizar(id, cargo);
    }

    @DeleteMapping("/cargos/{id}")
    public void  deletar(@PathVariable Integer id){
        this.cargoService.deletar(id);
    }
}
