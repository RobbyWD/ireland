package com.ireland.travel.service;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ireland.travel.domain.Customer;
import com.ireland.travel.domain.Product;
import com.ireland.travel.domain.Purchase;
import com.ireland.travel.domain.PurchaseItem;
import com.ireland.travel.repository.PurchaseRepository;


@Service
@Transactional
public class PurchaseService {

	@Autowired
	private PurchaseRepository purchaseReposititory;
	
	public long countAllPurchases() {
		List <Purchase> list = (List<Purchase>)purchaseReposititory.findAll();   
		return list.size(); 
    }

	public void deletePurchase(Purchase purchase) {
		purchaseReposititory.delete(purchase);
    }

	public Purchase findPurchase(Long id) {
        return purchaseReposititory.findOne(id);
    }

	public List<Purchase> findAllPurchases() {
        return (List<Purchase>) purchaseReposititory.findAll();
    }

//	public List<Purchase> findPurchaseEntries(int firstResult, int maxResults) {
//        return purchaseReposititory.findAll(firstResult, maxResults);
//    }

	public void savePurchase(Purchase purchase) {
		purchaseReposititory.save(purchase);
    }

	public Purchase updatePurchase(Purchase purchase) {
        return purchaseReposititory.save(purchase);
    }

	public void savePurchase(Map<Product, Integer> cartContents, Customer purchasedBy) {
		
		Purchase purchase = new Purchase();
		Calendar now = Calendar.getInstance();
		for (Entry<Product, Integer> entry : cartContents.entrySet()) {
			PurchaseItem purchaseItem = new PurchaseItem();
			purchaseItem.setProduct(entry.getKey());
			purchaseItem.setQuantity(entry.getValue());
			purchaseItem.setOrderDate(now);
			
			purchaseItem.setPurchase(purchase);
			purchase.getPurchaseItems().add(purchaseItem);
		}
		purchase.setOrderDate(now);
		purchase.setOrderedBy(purchasedBy);
		
		this.savePurchase(purchase);
	}
}
