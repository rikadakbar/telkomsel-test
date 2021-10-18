package com.telkomsel.rikad.model.request;

public class OrderCheckoutRequest {
  private Long itemId;
  private Long accountId;
  private Long qty;
  private Long cartId;

  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Long getQty() {
    return qty;
  }

  public void setQty(Long qty) {
    this.qty = qty;
  }

  public Long getCartId() {
    return cartId;
  }

  public void setCartId(Long cartId) {
    this.cartId = cartId;
  }


}
