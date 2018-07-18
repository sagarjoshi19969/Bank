package bank;
public class BankDriver
{

	public static void main(String[] args) {
		
		Bank b=new Bank(100);
                
		b.withdraw(35);
		b.deposit(55);
		b.withdraw(23);
		b.withdraw(33);
		b.deposit(10);
		
        }
}
