package br.com.luiz.mvc.Visual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luiz.mvc.Visual.model.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente , Long>{

}
