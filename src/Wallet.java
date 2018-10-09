/*
 * Represents a wallet with dollar bills form various denominations
 */
public class Wallet {

	private int ones;
	private int fives;
	private int tens;
	private int twenties;
	private int hundreds;

	public Wallet(int ones, int fives, int tens, int twenties, int hundreds) {
		super();
		this.ones = ones;
		this.fives = fives;
		this.tens = tens;
		this.twenties = twenties;
		this.hundreds = hundreds;
	}
	
	/*
	 * Creates a new wallet with exactly the same bills as the parameter wallet
	 */
	public Wallet(Wallet w) {
		this.ones = w.ones;
		this.fives = w.fives;
		this.tens = w.tens;
		this.twenties = w.twenties;
		this.hundreds = w.hundreds;
	}
	
	/*
	 * Return true if and only if the parameter wallet contans exactly the same bills 
	 * as the target object.
	 */
	public boolean equals(Object o) {
		if (!(o instanceof Wallet)) { return false; }
		Wallet w = (Wallet) o;
		return ((w.ones == this.ones) &&
				(w.fives == this.fives) &&
				(w.tens == this.tens) &&
				(w.twenties == this.twenties) &&
				(w.hundreds == this.hundreds));
	}

	/*
	 * Creates a new wallet with the minimal number of bills necessary to represent the
	 * number of dollars received as a parameter
	 */
	public Wallet(int dollars) {
		this.hundreds = dollars/100;
		this.twenties = dollars%100/20;
		this.tens= dollars%100%20/10;
		this.fives = dollars%100%20%10/5;
		this.ones = dollars%100%20%10%5/1;
		
		

		
		
		
		
	
	}

	// Getters 
	
	public int getOnes() { return ones; }
	public int getFives() { return fives; }
	public int getTens() { return tens; }
	public int getTwenties() { return twenties; }
	public int getHundreds() { return hundreds; }
	
	/*
	 * Returns the amount of money in dollars contained in the wallet
	 */
	public int getAmount() {
		return getOnes() + (getFives()*5) + (getTens()*10) + (getTwenties()*20) + (getHundreds()*100);
	}
	
	/*
	 * Modifies the target wallet to add the bills from the parameter wallet
	 */
	public Wallet add(Wallet w2) {
		this.ones+=w2.ones;
		this.fives+=w2.fives;
		this.tens+=w2.tens;
		this.twenties+=w2.twenties;
		this.hundreds+=w2.hundreds;
		
		return this;
		
		
		 
	}

	/*
	 * Modifies the target wallet to add the minimal number of bills necessary to add
	 * the amount of money represented by the dollars parameter
	 */
	public Wallet add(int dollars) {
		this.hundreds = dollars/100;
		this.twenties = dollars%100/20;
		this.tens= dollars%100%20/10;
		this.fives = dollars%100%20%10/5;
		this.ones = dollars%100%20%10%5/1;
		return this;
	}

	/*
	 * Modifies the target wallet to contain the same amount as before, but using the minimal
	 * number of bills
	 */
	public Wallet minimize() {
		int dollars = this.hundreds*100+this.twenties*20+this.tens*10+this.fives*5+this.ones;
		
		this.hundreds = dollars/100;
		this.twenties = dollars%100/20;
		this.tens= dollars%100%20/10;
		this.fives = dollars%100%20%10/5;
		this.ones = dollars%100%20%10%5/1;
		
		
		
		return this;
		
	}

}