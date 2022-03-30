package com.blog.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entidades.Publicacion;

public interface PublicacionRepositorio extends JpaRepository<Publicacion, Long> {

}
