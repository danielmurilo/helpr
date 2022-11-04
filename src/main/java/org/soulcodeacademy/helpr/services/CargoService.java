package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {
    @Autowired
    private CargoRepository cargoRepository;
    public List<Cargo> listar(){
        return this.cargoRepository.findAll();
    }
    public Cargo getCargoPorId(Integer id){
        Optional<Cargo> cargo = this.cargoRepository.findById(id);
        if (cargo.isEmpty()){
            throw new RuntimeException("O cargo não foi encontrado!");
        } else {
            return cargo.get();
        }
    }
    public Cargo salvar(Cargo novoCargo){
        novoCargo.setId(null);
        Cargo cargoSalvo = this.cargoRepository.save(novoCargo);
        return cargoSalvo;
    }

    public Cargo atualizar(Integer id, Cargo cargo){
        this.getCargoPorId(id); //Se não existir já vai dar RunTimeException
        cargo.setId(id);
        return this.cargoRepository.save(cargo);
    }

    public void deletar(Integer id) {
        Cargo cargo = this.getCargoPorId(id);
        this.cargoRepository.delete(cargo);
    }

}
