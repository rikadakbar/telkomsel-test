package com.telkomsel.rikad.controller;

import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.telkomsel.rikad.entity.ShoppingCart;
import com.telkomsel.rikad.model.request.OrderCheckoutRequest;
import com.telkomsel.rikad.model.request.ShoppingCartRequest;
import com.telkomsel.rikad.service.OrderService;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

  private static final Logger log = LoggerFactory.getLogger(OrderController.class);

  @Autowired
  OrderService orderService;

  @PostMapping(path = "/shoppingCart")
  public ResponseEntity<Object> insertToShoppingCart(@RequestHeader(value = "token") String token,
      @RequestBody ShoppingCartRequest shoppingCartRequest) {
    log.info("Token : {}", token);

    ShoppingCart shoppingCart = orderService.addToShoppingCart(shoppingCartRequest);
    if(Objects.isNull(shoppingCart)) {
      return ResponseEntity.notFound().build();
    }
    
    return ResponseEntity.ok(null);
  }
  
  @PostMapping(path = "/checkout")
  public ResponseEntity<Object> checkoutOrder(@RequestHeader(value = "token") String token,
      @RequestBody List<OrderCheckoutRequest> request){
    
    return ResponseEntity.ok(request);
  }
}
