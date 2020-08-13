package org.example.wjs.service;

import org.example.wjs.service.api.TransactionService;
import org.example.entity.TTblTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.wjs.mapper.TTblTransactionsMapper;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TTblTransactionsMapper transactionDao;
    @Override
    public int queryService(TTblTransactions transactionEntity) {
        return transactionDao.selectAll().size();
    }
}
