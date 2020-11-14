package com.app.sacbin.subasta.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.sacbin.subasta.model.dao.IsubataDao;
import com.app.sacbin.subasta.model.entity.Subasta;

@Service
public class SubastaServiceImpl implements ISubastaService{
	
	@Autowired
	private IsubataDao subastaDao;

	@Override
	@Transactional
	public Subasta store(Subasta subasta) {
		
		return subastaDao.save(subasta);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Subasta> findAll() {
		
		return subastaDao.findAll();
	}

}
