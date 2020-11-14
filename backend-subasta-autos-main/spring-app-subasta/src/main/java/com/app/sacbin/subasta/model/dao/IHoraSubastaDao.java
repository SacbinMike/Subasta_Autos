package com.app.sacbin.subasta.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.sacbin.subasta.model.entity.HoraSubasta;

public interface IHoraSubastaDao extends JpaRepository<HoraSubasta, Long> {

}
