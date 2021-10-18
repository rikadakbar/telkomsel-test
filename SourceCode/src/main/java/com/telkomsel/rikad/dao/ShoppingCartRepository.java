package com.telkomsel.rikad.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.telkomsel.rikad.entity.ShoppingCart;

@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
  public ShoppingCart findByItemIdAndAccountId(Long itemId, Long accountId);
}
