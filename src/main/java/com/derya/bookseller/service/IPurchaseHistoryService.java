package com.derya.bookseller.service;

import java.util.List;

import com.derya.bookseller.model.PurchaseHistory;
import com.derya.bookseller.repository.projection.IPurchaseItem;

public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}