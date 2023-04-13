package com.sacral.CT1-72.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.CT1-72.entity.Viewers;
import com.sacral.CT1-72.repository.ViewersRepository;

@Service
public class ViewersService {
	
	@Autowired
	private ViewersRepository viewersRepository;
	
	public List<Viewers> getAllByInvoices(String invoices) {
		return viewersRepository.findAllByInvoices(invoices);
	}
	
	public List<Viewers> getAllByDeliveryNotes(String deliveryNotes) {
		return viewersRepository.findAllByDeliveryNotes(deliveryNotes);
	}
	
	public List<Viewers> getAllByCreditNotes(String creditNotes) {
		return viewersRepository.findAllByCreditNotes(creditNotes);
	}
	
	public List<Viewers> getAllByCreditProcessed(String creditProcessed) {
		return viewersRepository.findAllByCreditProcessed(creditProcessed);
	}
	
	public List<Viewers> getAllByGoodsSupplied(String goodsSupplied) {
		return viewersRepository.findAllByGoodsSupplied(goodsSupplied);
	}
	
	public List<Viewers> getAllByNewspaperRecall(String newspaperRecall) {
		return viewersRepository.findAllByNewspaperRecall(newspaperRecall);
	}
	
	public List<Viewers> getAllByMagazineRecall(String magazineRecall) {
		return viewersRepository.findAllByMagazineRecall(magazineRecall);
	}
	
	public List<Viewers> getAllBySalesPoint(String salesPoint) {
		return viewersRepository.findAllBySalesPoint(salesPoint);
	}
	
	public List<Viewers> getAllByInmRebateCredit(String inmRebateCredit) {
		return viewersRepository.findAllByInmRebateCredit(inmRebateCredit);
	}
	
	public List<Viewers> getAllByAccountNumber(String accountNumber) {
		return viewersRepository.findAllByAccountNumber(accountNumber);
	}
	
	public List<Viewers> getAllByDateBetween(Date fromDate, Date toDate) {
		return viewersRepository.findAllByDateBetween(fromDate, toDate);
	}
	
	public List<Viewers> getAllByInteractionType(String interactionType) {
		return viewersRepository.findAllByInteractionType(interactionType);
	}
	
	public List<Viewers> getAllByLastTwoYearReport(String lastTwoYearReport) {
		return viewersRepository.findAllByLastTwoYearReport(lastTwoYearReport);
	}

}