package bankmanagement;

import java.util.Random;

import java.util.Scanner;

class AccountCreate {
	Scanner sc=new Scanner(System.in);
	private String name;
	private long mobno;
	private long aadharno;
	private String pancard;
	private String address;
	
	
		public String getname() {
		System.out.println("Enter Your Name: ");
		 name=sc.nextLine();
		 return name;
	}
		public long getmobno() {
		System.out.println("Enter your MobNo: ");
		 mobno=sc.nextLong();
		 return mobno;
		}
		public long getaadharno() {
		System.out.println("Enter Your AadharNo: ");
		 aadharno=sc.nextLong();
		 return aadharno;
		}
		public String pancard() {
		System.out.println("enter Your pancardNo: ");
		 pancard=sc.next();
		 return pancard;
		}
		public String address() {
		System.out.println("Enter Your Address: ");
		 address=sc.next();
		 return address;
	}				
	}

	class CashDeposit
	{
		Scanner sc=new Scanner(System.in);
		private String name;
		private int acNbr;
		int cash=0;


		public void getName()
		{
			System.out.println("Enter Your Name: ");
			name=sc.nextLine();
	
		}
		public int  getAcnbr()
		{
			System.out.println("Enter Your account no: ");
			BankMenu bm=new BankMenu();
			acNbr=sc.nextInt();
			int nbr=bm.accno;
			CashWithdraw cw=new CashWithdraw();
	
			if(nbr==acNbr)
			{
		
				System.out.println(acNbr);

				if(bm.choice==2)
					deposit();	
				else if(bm.choice==3)
					cw.withdrawal();
			}
			else 
			{
				System.out.println("Invalid Account number ");
			}
			return acNbr;
		}

		public int deposit()
			{  
			BankMenu bm=new BankMenu();
		   int amt;  
		   System.out.println("Enter the deposit amount: ");  
		   amt = sc.nextInt();
		   System.out.println("Your Cash Has Been Debited!!!"); 
		   cash=bm.balance + amt;
		   
		   System.out.println("Your Current balance is:"+cash);
		   return cash;
			}
		}


		 	class CashWithdraw  extends CashDeposit {
			 
			public void withdrawal() 
			{  
					Scanner sc=new Scanner(System.in);
					BankMenu bm=new BankMenu();
				    int amt;  
				    System.out.println("Enter the amount you want to withdraw: ");  
				    amt = sc.nextInt(); 
				    System.out.println(cash);
				    if (cash >= amt)
				    {  
				       cash= cash - amt;  
				        System.out.println("Balance after withdrawal: " +cash);  
				    } else
				    {  
				        System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
				    }  
				}  
			}
			
			interface BalanceEnquiry {
				
				void balance();	
			}


			public class BankMenu implements BalanceEnquiry {
				
				 static int accno;
				 int balance;
				 static int choice;
				
				public static void main(String[] args) {
				
					//BankMenu bm=new BankMenu();
					
					do {
					
					System.out.println("                    Bank Of India               ");
					System.out.println();
					System.out.println("Main menu");
					System.out.println(" 1.Create Account \n 2.cash Deposit \n 3.cash withdrawl \n 4.Balance Enquiry \n 5.exit");
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter your Choice:");
					 choice=sc.nextInt();
					
					switch(choice) {
					case 1:
						AccountCreate ac=new AccountCreate();
						ac.getname();
						ac.getmobno();
						ac.getaadharno();
						ac.pancard();
						ac.address();
						System.out.println("Your Account Has Been Created!");
						 Random rand = new Random();
						 accno = rand.nextInt(10000);
					        System.out.println("Your Account Number: "+accno);
					      
						break;
					case 2:
						CashDeposit cs=new CashDeposit();
						cs.getName();
						cs.getAcnbr();
						break;
					case 3:
			
						CashWithdraw cw=new CashWithdraw();
						cw.getName();
						cw.getAcnbr();
						break;
					case 4:
							BankMenu bm=new BankMenu();
							bm.balance();
						break;
					case 5:
						System.out.println(" exited!!!!!");
						break;
					default:
						System.out.println("please enter Valid key!");
						
					}
					
					
					}while(choice!=5);
				}


	@Override
	public void balance() {
		Scanner sc=new Scanner(System.in);
		BankMenu bm=new BankMenu();
	 	int acNbr;
		System.out.println("Enter Your account no: ");
		CashDeposit cd=new CashDeposit();
		acNbr=sc.nextInt();
		int nbr=bm.accno;	
		if(nbr==acNbr)
		{
			System.out.println(acNbr);
			System.out.println("balance:"+bm.balance);
		}
		
		else 
			System.out.println("Invalid Account number ");
	}
}

                                                                