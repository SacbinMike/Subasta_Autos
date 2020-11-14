package com.app.sacbin.subasta.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.sacbin.subasta.model.dao.IHoraSubastaDao;
import com.app.sacbin.subasta.model.entity.HoraSubasta;

@Service
public class HoraSubastaImpl implements IHoraSubasta{
	
	@Autowired
	private IHoraSubastaDao horaSubataDao;

	@Override
	@Transactional(readOnly = true)
	public List<HoraSubasta> findAll() {
		
		return horaSubataDao.findAll();
	}

}
