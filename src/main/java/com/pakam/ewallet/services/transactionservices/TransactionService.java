package com.pakam.ewallet.services.transactionservices;

import com.pakam.ewallet.data.models.Transaction;
import com.pakam.ewallet.dtos.request.CreateTransactionRequest;

import java.util.List;

public interface TransactionService {
  Transaction createTransaction( Long userId, CreateTransactionRequest createTransactionRequest);
  List<Transaction> viewTransaction(Long userId);
}
