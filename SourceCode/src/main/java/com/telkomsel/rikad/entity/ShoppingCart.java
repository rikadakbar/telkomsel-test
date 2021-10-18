package com.telkomsel.rikad.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "shopping_cart")
public class ShoppingCart extends Order {

  @Id @GeneratedValue
  private Long cartId;

  public Long getCartId() {
    return cartId;
  }

  public void setCartId(Long cartId) {
    this.cartId = cartId;
  }

  @Override
  public String toString() {
    return "ShoppingCart [cartId=" + cartId + ", getCartId()=" + getCartId() + ", getAccountId()="
        + getAccountId() + ", getQuantity()=" + getQuantity() + ", getClass()=" + getClass()
        + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
  }
  
}
