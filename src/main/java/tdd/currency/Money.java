/*
 * @(#)Money.java $version 2015. 2. 2.
 *
 * Copyright 2015 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package tdd.currency;

/**
 * 
 * @author 박성현[kr17352@navercorp.com]
 * @version 1.0
 */
public class Money implements Expression {

	protected int amount;
	protected String currency;
	
	static Dollar dollar(int amout) {
		return new Dollar(amout, "USD");
	}
	
	static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	public String currency() {
		return currency;
	}
	
	@Override
	public boolean equals(Object o) {
		Money money = (Money) o;
		return this.amount == money.amount
				&& currency().equals(money.currency());
			
	}

	/**
	 * @param five
	 * @return
	 */
	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}

	/**
	 * @param to
	 * @return
	 * @see tdd.currency.Expression#reduce(java.lang.String)
	 */
	@Override
	public Money reduce(String to) {
		return this;
	}
}
