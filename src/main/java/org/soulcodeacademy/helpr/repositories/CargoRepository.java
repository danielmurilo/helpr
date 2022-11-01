package org.soulcodeacademy.helpr.repositories;
//Repository é um recurso que permite manipular a entidade no banco de dados.

import org.soulcodeacademy.helpr.domain.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {
}
