package com.sacral.CT1-72.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.CT1-72.entity.Viewers;
import com.sacral.CT1-72.service.ViewersService;

@RestController
@RequestMapping("/viewers")
public class ViewersController {
	
	@Autowired
	private ViewersService viewersService;
	
	@GetMapping("/invoices")
	public ResponseEntity<List<Viewers>> getAllByInvoices(@RequestParam String invoices) {
		List<Viewers> viewers = viewersService.getAllByInvoices(invoices);
		if (viewers.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(viewers, HttpStatus.OK);
	}
	
	@GetMapping("/deliveryNotes")
	public ResponseEntity<List<Viewers>> getAllByDeliveryNotes(@RequestParam String deliveryNotes) {
		List<Viewers> viewers = viewersService.getAllByDeliveryNotes(deliveryNotes);
		if (viewers.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(viewers, HttpStatus.OK);
	}
	
	@GetMapping("/creditNotes")
	public ResponseEntity<List<Viewers>> getAllByCreditNotes(@RequestParam String creditNotes) {
		List<Viewers> viewers = viewersService.getAllByCreditNotes(creditNotes);
		if (viewers.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(viewers, HttpStatus.OK);
	}
	
	@GetMapping("/creditProcessed")
	public ResponseEntity<List<Viewers>> getAllByCreditProcessed(@RequestParam String creditProcessed) {
		List<Viewers> viewers = viewersService.getAllByCreditProcessed(creditProcessed);
		if (viewers.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(viewers, HttpStatus.OK);
	}
	
	@GetMapping("/goodsSupplied")
	public ResponseEntity<List<Viewers>> getAllByGoodsSupplied(@RequestParam String goodsSupplied) {
		List<Viewers> viewers = viewersService.getAllByGoodsSupplied(goodsSupplied);
		if (viewers.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(viewers, HttpStatus.OK);
	}
	
	@GetMapping("/newspaperRecall")
	public ResponseEntity<List<Viewers>> getAllByNewspaperRecall(@RequestParam String newspaperRecall) {
		List<Viewers> viewers = viewersService.getAllByNewspaperRecall(newspaperRecall);
		if (viewers.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(viewers, HttpStatus.OK);
	}
	
	@GetMapping("/magazineRecall")
	public ResponseEntity<List<Viewers>> getAllByMagazineRecall(@RequestParam String magazineRecall) {
		List<Viewers> viewers = viewersService.getAllByMagazineRecall(magazineRecall);
		if (viewers.isEmpty()) {