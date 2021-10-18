package com.telkomsel.rikad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "order_checkout")
public class OrderCheckout {

  @Id @GeneratedValue
  private Long orderId;
  
  private Long totalPrice;
  private Long accountId;
  private String paymentMethod;
  private String orderStatus;


  public Long getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Long totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }
}
