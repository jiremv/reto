package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.TipoCambio;
import com.javatpoint.repository.TipoCambioRepository;

//defining the business logic
@Service
public class TipoCambioService {
	@Autowired
	TipoCambioRepository tipoCambioRepository;

//getting all records
	public List<TipoCambio> getAllTipoCambio() {
		List<TipoCambio> tipoCambios = new ArrayList<>();
		tipoCambioRepository.findAll().forEach(tipoCambio -> tipoCambios.add(tipoCambio));
		return tipoCambios;
	}

//getting a specific record
	public TipoCambio getTipoCambioById(int id) {
		return tipoCambioRepository.findById(id).get();
	}

	public void saveOrUpdate(TipoCambio tipoCambio) {
		tipoCambioRepository.save(tipoCambio);
	}

//deleting a specific record
	public void delete(int id) {
		tipoCambioRepository.deleteById(id);
	}
}