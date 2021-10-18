package com.telkomsel.rikad.service;

import com.telkomsel.rikad.entity.ShoppingCart;
import com.telkomsel.rikad.model.request.ShoppingCartRequest;

public interface OrderService {
  public ShoppingCart addToShoppingCart(ShoppingCartRequest request);
  
}
