package com.telkomsel.rikad.service.impl;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.telkomsel.rikad.dao.ItemRepository;
import com.telkomsel.rikad.dao.ShoppingCartRepository;
import com.telkomsel.rikad.entity.Item;
import com.telkomsel.rikad.entity.ShoppingCart;
import com.telkomsel.rikad.model.request.ShoppingCartRequest;
import com.telkomsel.rikad.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
  
  @Autowired
  ItemRepository itemRepository;
  
  @Autowired
  ShoppingCartRepository shoppingCartRepository;

  @Override
  public ShoppingCart addToShoppingCart(ShoppingCartRequest request) {
    Item item = itemRepository.findById(request.getItemId()).orElse(null);
    if (Objects.isNull(item)) {
      return null;
    }
    
    ShoppingCart shoppingCart = shoppingCartRepository.findByItemIdAndAccountId(
        request.getItemId(), request.getAccountId());
    if (Objects.isNull(shoppingCart)) {
      shoppingCart = new ShoppingCart();
    }
    shoppingCart.setAccountId(request.getAccountId());
    shoppingCart.setQuantity(shoppingCart.getQuantity() + request.getQty());
    shoppingCart.setItem(item);
    shoppingCartRepository.save(shoppingCart);
    
    return shoppingCart;
  }

}
