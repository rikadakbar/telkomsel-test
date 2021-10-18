package com.telkomsel.rikad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "order_detail")
public class OrderDetail {

  @Id
  @GeneratedValue
  @Column(name = "order_detail_id")
  private Long orderDetailId;

  private Long orderId;
  private Long price;
  private Integer qty;

  public Long getOrderDetailId() {
    return orderDetailId;
  }

  public void setOrderDetailId(Long orderDetailId) {
    this.orderDetailId = orderDetailId;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

}
