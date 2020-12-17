package br.com.luiz.mvc.Visual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luiz.mvc.Visual.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario , Long> {

}
