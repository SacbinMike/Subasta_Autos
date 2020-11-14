package com.app.sacbin.subasta.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.sacbin.subasta.model.entity.TiempoSubasta;

@Service
public class TiempoSubastaImpl implements ITiempoSubasta{
	
	@Autowired
	private ITiempoSubasta tiempoSubastaDao;

	@Override
	@Transactional(readOnly = true)
	public List<TiempoSubasta> findAll() {
		
		return tiempoSubastaDao.findAll();
	}

}
