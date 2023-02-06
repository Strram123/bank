package bankmanagement;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;


	class Account{
		
		
		
		private String accountType,name;
		private int id,balance,deposit,withdraw;
		Scanner sc = new Scanner(System.in);
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		public void setdeposit(int i) {
			
			this.deposit=this.balance+i;
			System.out.println("succesfully Deposited "+i);
			
		}
		public int getdeposit() {
			System.out.println("After Deposited Your Balance "+this.deposit);
			return this.deposit;
		}
		
		
		public void setwithdraw(int j) {
			
			 if (j <= this.balance )
			 {
				this.withdraw= this.balance-j; 
				System.out.println("After Withdrawel  your Balance"+this.withdraw);
			 }
			 else
			 {
				 System.out.println("Your Insuffient Amount!!!");
			 }
		}
		public int getwithdraw() 
		{
			return withdraw;
		}

	
		public String toString() {
			return "Name:"+this.name+" ID:"+this.id+" ACcountType:"+this.accountType+" Balance"+this.balance;
			
		}
			
	}

	public class BankSystem {
		
		
			 
			public static void main(String[] args) {
				
					Scanner sc = new Scanner(System.in);
					List<Account> list=new ArrayList<Account>();
				 
					System.out.println("Create A Account For 3 times");
		
				
				for(int i=0;i<3 ;i++ )
					{
					
					Account ac = new Account();
					System.out.println("Enter Your Name: ");
					ac.setName(sc.next());
					System.out.println("Enter Id: ");
					ac.setId(sc.nextInt());
					System.out.println("Enter accountType: ");		
					ac.setAccountType(sc.next());
					System.out.println("Enter Balance: ");
					ac.setBalance(sc.nextInt());
					System.out.println(i+" account Created");
					list.add(ac);
					
					}
				int choice;
				do {
					System.out.println(list);
					System.out.println("You Are Created 3 Accounts!");
					System.out.println("Press 0 For Account1 \n press 1 For Account2 \n press 2 For Account3!!");
					int value=sc.nextInt();
					System.out.println("Your Account Details \n"+ list.get(value));
					
					Account operationObj = list.get(value);
					
					System.out.println("1 for WithDraw \n 2 for Deposit \n 3  for Balance Enquiry \n 4 for exit!!!  ");
					 choice=sc.nextInt();
					
					switch(choice)
					{
					case 1:
						System.out.println("Enter your Withdrawal Amount");
						operationObj.setwithdraw(sc.nextInt());
						break;
					case 2:
						System.out.println("Enter Your Deposit Amount");
						operationObj.setdeposit(sc.nextInt());
						operationObj.getdeposit();
						break;
					
					case 3:
						System.out.println(operationObj.getBalance());
						break;
					default:
						break;
					}	
						System.out.println(list);
						
				}while(choice!=4);
				
				
			}		
	}
		
		
	
			
			
			
	
		


