package com.telkomsel.rikad.model.request;

public class ShoppingCartRequest {
  private Long itemId;
  private Long accountId;
  private Integer qty;
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
  public Integer getQty() {
    return qty;
  }
  public void setQty(Integer qty) {
    this.qty = qty;
  }
  
  
}
