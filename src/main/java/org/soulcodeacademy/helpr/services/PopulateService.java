package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PopulateService {
    @Autowired
    private CargoRepository cargoRepository;

    public void populate(){
        Cargo c1 = new Cargo(null, "Diretor Geral", "Gerenciar empresa", 30000.00);
        Cargo c2 = new Cargo(null, "Diretor de Setor", "Gerenciar setor da empresa", 18000.00);
        Cargo c3 = new Cargo(null, "Técnico Geral", "Gerencia chamados", 12000.00);
        Cargo c4 = new Cargo(null, "Auxiliar Técnico", "Atende chamados", 4000.00);
        this.cargoRepository.save(c1);
        this.cargoRepository.save(c2);
        this.cargoRepository.save(c3);
        this.cargoRepository.save(c4);
    }
}
