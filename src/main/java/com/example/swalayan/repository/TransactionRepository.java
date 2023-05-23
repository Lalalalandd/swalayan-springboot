package com.example.swalayan.repository;

import com.example.swalayan.model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository <Transaction, Integer> {
}
