package com.app.sacbin.subasta.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.sacbin.subasta.model.dao.IFechaSubastaDao;
import com.app.sacbin.subasta.model.entity.FechaSubasta;

@Service
public class FechaSubastaImpl implements IFechaSubasta{
	
	@Autowired
	private IFechaSubastaDao fechaSubastaDao;

	@Override
	@Transactional(readOnly = true)
	public List<FechaSubasta> findAll() {
		
		return fechaSubastaDao.findAll();
	}

	@Override
	@Transactional
	public FechaSubasta store(FechaSubasta fechaSubasta) {
	
		return fechaSubastaDao.save(fechaSubasta);
	}

	@Override
	@Transactional(readOnly = true)
	public FechaSubasta findById(Long id) {
		
		return fechaSubastaDao.findById(id).orElse(null);
	}

}
