package com.example.swalayan.repository;

import com.example.swalayan.model.TransactionItems;
import org.springframework.data.repository.CrudRepository;

public interface TransactionItemsRepository extends CrudRepository <TransactionItems, Integer> {
}
