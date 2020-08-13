package org.example.wjs.transactions.web;

import org.example.wjs.service.api.TransactionService;
import org.example.entity.TTblTransactions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class ClientController {

    @Resource
    private TransactionService transactionService;

    @RequestMapping("/test")
    public String testController() {
      return "transactions";
    }

    @RequestMapping("/testQuery")
    public String testQuery() {
        TTblTransactions entity=new TTblTransactions();
        int i=transactionService.queryService(entity);
        System.out.println("输出结果"+i);
        return "testQuery";
    }

}