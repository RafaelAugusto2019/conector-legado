package br.com.boa.forma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.boa.forma.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository< Cliente, Integer>{

}
