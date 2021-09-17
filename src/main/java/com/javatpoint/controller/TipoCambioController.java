package com.javatpoint.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.javatpoint.model.TipoCambio;
import com.javatpoint.service.TipoCambioService;

//creating RestController
@RestController
public class TipoCambioController {
//autowired the TipoCambioService class
	@Autowired
	TipoCambioService tipoCambioService;

	// POST SOLICITADO
	// creating post mapping that post the tipoCambio detail in the database
	@PostMapping("/tipocambio")
	private ObjectNode saveStudent(@RequestBody TipoCambio tipoCambio) {
		tipoCambioService.saveOrUpdate(tipoCambio);
		// tipoCambio.getId();
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("monto con tipo de cambio", tipoCambio.getMonto() * 4.12);
		objectNode.put("moneda origen", tipoCambio.getMonedaOrigen());
		objectNode.put("moneda destino", tipoCambio.getMonedaDestino());
		return objectNode;
	}

	// creating a get mapping that retrieves all the tipoCambio detail from the
	// database
	@GetMapping("/tipocambio")
	private List<TipoCambio> getAllTipoCambio() {
		return tipoCambioService.getAllTipoCambio();
	}

	// creating a get mapping that retrieves the detail of a specific tipoCambio
	@GetMapping("/tipocambio/{id}")
	private TipoCambio getTipoCambio(@PathVariable("id") int id) {
		return tipoCambioService.getTipoCambioById(id);
	}

	// creating a delete mapping that deletes a specific tipoCambio
	@DeleteMapping("/tipocambio/{id}")
	private void deleteTipoCambio(@PathVariable("id") int id) {
		tipoCambioService.delete(id);
	}

}
