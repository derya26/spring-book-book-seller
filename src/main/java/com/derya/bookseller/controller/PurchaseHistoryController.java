package com.derya.bookseller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.derya.bookseller.model.PurchaseHistory;
import com.derya.bookseller.security.UserPrincipal;
import com.derya.bookseller.service.IPurchaseHistoryService;

@RestController
@RequestMapping("api/purchase-history")
public class PurchaseHistoryController {
	
	@Autowired
	private IPurchaseHistoryService purchaseHistoryService;
	
	public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistory  purchaseHistory){
		return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(purchaseHistory),HttpStatus.CREATED);
	}

	public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal){
		return ResponseEntity.ok(purchaseHistoryService.findPurchasedItemsOfUser(userPrincipal.getId()));
		
	}
}
