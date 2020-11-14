package com.app.sacbin.subasta.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.sacbin.subasta.model.entity.FechaSubasta;

public interface IFechaSubastaDao extends JpaRepository<FechaSubasta, Long> {
	
	@Query("select f from FechaSubasta f where f.status='A' and f.fecha >current_date()")
	public List<FechaSubasta> findAllFechas();
}
