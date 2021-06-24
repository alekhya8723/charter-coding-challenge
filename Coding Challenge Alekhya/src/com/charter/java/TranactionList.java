package com.charter.java;

import java.util.ArrayList;
import java.util.List;

import com.charter.entity.Transaction;

public class TranactionList {
    public static void main(String[] args) {
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(addTransaction(120));
        getTotalRewards(transactionList);

    }

    /**
     * getTotalRewards method is used to get the rewards for the transactions
     * @param transactionList
     */
    private static void getTotalRewards(List<Transaction> transactionList) {
        if (transactionList.size() > 0) {
            transactionList.stream().forEach(action -> {
                System.out.println(action.reward);
            });
        }
    }

    /**
     * addTransaction method is used to add transaction and calculate the reward points
     * @param price
     * @return
     */
    private static Transaction addTransaction(int price) {
        return new Transaction(price);

    }
}
