package com.charter.entity;

import java.util.Date;

public class Transaction {

	public int price;
	public int reward;
	public Date transactionDate = new Date();

	/**
	 * Constructor
	 */
	public Transaction(int price) {
		this.price = price;
		this.reward = calculateRewards(price);
		this.transactionDate = new Date();
	}

	/**
	 * calculateRewards method is used to calculate the reward points
	 * @param price
	 * @return int
	 */
	private int calculateRewards(int price) {
		if (price >= 50 && price < 100) {
			return price - 50;
		} else {
			return (2 * (price - 100) + 50);
		}
	}

}
