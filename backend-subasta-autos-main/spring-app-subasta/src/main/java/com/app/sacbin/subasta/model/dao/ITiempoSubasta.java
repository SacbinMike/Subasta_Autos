package com.app.sacbin.subasta.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.sacbin.subasta.model.entity.TiempoSubasta;

public interface ITiempoSubasta extends JpaRepository<TiempoSubasta, Long> {

}
