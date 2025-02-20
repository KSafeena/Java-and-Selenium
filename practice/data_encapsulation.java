package practice;
class account
{
	private int accno;
	private int balance;
	private int deposite;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	
}

public class data_encapsulation {

	public static void main(String[] args) {
		account acc=new account();
		acc.setAccno(1000);
		System.out.println(acc.getAccno());
		acc.setBalance(1200);
		System.out.println(acc.getBalance());
		acc.setDeposite(200);
		System.out.println(acc.getDeposite());
	}

}
