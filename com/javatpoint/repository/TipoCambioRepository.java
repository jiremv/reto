package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.TipoCambio;

public interface TipoCambioRepository extends CrudRepository<TipoCambio, Integer> {
}
