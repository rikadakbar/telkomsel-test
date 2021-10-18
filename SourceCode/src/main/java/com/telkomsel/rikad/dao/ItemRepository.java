package com.telkomsel.rikad.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.telkomsel.rikad.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}
