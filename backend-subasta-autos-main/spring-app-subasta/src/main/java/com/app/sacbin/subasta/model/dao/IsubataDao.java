package com.app.sacbin.subasta.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.sacbin.subasta.model.entity.Subasta;

public interface IsubataDao extends JpaRepository<Subasta, Long> {

}
