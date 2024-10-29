import java.util.Scanner;
import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class phonenumber
{
	private long phonenumber;
	void setDetails(long phonenumber)
	{
		this.phonenumber=phonenumber;
	}
	long getpass()
	{
		return phonenumber;
	}
}

class Login
{
    static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purple = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	static Scanner sc=new Scanner(System.in);
	void start()
	{
		long phonenum;
       		String str;
		char ch;
        	do 
		{
			System.out.print(yellow);
			System.out.println("Enter your mobile number:");
			System.out.print(def);
			phonenum = sc.nextLong();
			str = String.valueOf(phonenum);
			ch=str.charAt(0);
			if (str.length() != 10||(ch<54||ch>58)) 
			{
				System.out.println(red);
				System.out.println("Please enter a valid 10-digit mobile number.");
				System.out.println(def);
		}
		} while (str.length() != 10||(ch<54||ch>58));  // Continue loop until valid number is entered
		new phonenumber().setDetails(phonenum);
		int value;
		int otp;
		do 
		{
			value=((int)(Math.random()*9000)+1000);
			System.out.print(yellow);
			System.out.println("Your OTP: " + value);
			System.out.println("Enter your OTP:");
			System.out.print(def);
			otp = sc.nextInt();
			if (value != otp) 
			{
				System.out.println(red);
				System.out.println("Incorrect OTP.\nPlease try again.");
				System.out.println(def);
			}
		} while (value != otp); // Continue loop until the correct OTP is entered
		System.out.println("Login Successful ");
		System.out.println(blink);
		System.out.print(skblue);
		System.out.println("********************************************");
		System.out.println("============================================");
		System.out.print(def);
		System.out.println(red);
		System.out.println("============    ExploreSpace    ============");
		System.out.println(def);
		System.out.print(blink);
		System.out.print(skblue);
		System.out.println("============================================");
		System.out.println("********************************************");
		System.out.println(def);
        } 
}
abstract class Bank
{

	static Scanner sc=new Scanner(System.in);
	static int balance=(int)(Math.random()*5001)+5000;
	abstract void finalpayment(int amount);	
}
class Wallet extends Bank
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purple = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	int g=0;
	int c=1;
	void finalpayment(int amount)
	{
		if(c==1)
		{
			System.out.println(purple);
			System.out.println("***********Explorespace Wallet***********");
			System.out.print(def);
			c++;
		}
		System.out.println(purple);
		System.out.println("-> Add amount to the Wallet.");
		System.out.println("-> Enter the amount you want to add");
		System.out.print(def);
		int y=sc.nextInt();
		g=g+y;//amount added in the wallet.
		balance=balance-y;
		int l=(amount*30/100);
		int amount1=amount-l;
		if(amount1<=g)
		{
			g=g-amount1;
			double random=Math.random();
			System.out.println(blue);
			System.out.println(" -> you got the 30% off on your payment Rs"+l);
			System.out.print(def);
			System.out.print(purple);
			System.out.println(" -> you have to pay "+amount1+" Rs on your Booking");
			System.out.print(def);
			System.out.print(green);
			System.out.println("Sucessfully completed your booking");
			System.out.println(def);
			System.out.print(yellow);
			System.out.println("want to explore more about other places press y\nTo exit press n");
			System.out.print(def);
			char ch=sc.next().charAt(0);
			if(ch=='y')
			{
				new Explore().location();
			}
			else
			{
				System.out.println(skblue);
				System.out.println("****************************");
				System.out.print(def);
				System.out.print(red);
				System.out.println("    Thanks for visiting!  ");
				System.out.println("      Enjoy your trip!  ");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("****************************");
				System.out.println(def);
				System.exit(0);
			}
		}
		else
		{
			System.out.println(red);
			int g=amount-balance;
			System.out.println("You have Insufficent balance");
			System.out.println(" -> You need more "+g+" Rs to make payment");
			System.out.println(def);
			System.out.print(yellow);
			System.out.println("do you want to continue the payment process then then press 'y'");
			System.out.print(def);
			char c=sc.next().charAt(0);
			if(c=='y')
			{
				finalpayment(amount);
			}
			else
			{
				System.out.print(red);
				System.out.println("Your hotel Booking is failed!");
				System.out.print(def);
				new Explore().location();
			}
		}
	}
}
class Phonepay extends Bank
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purple = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";
	int c=1;
	int f=new Hotel().person;
	void finalpayment(int amount)
	{
		if(c==1)
		{
			System.out.print(purple);
			System.out.println("****************Phone Pay****************");
			System.out.print(def);
			c++;
		}
		if(amount<=balance)
		{
			balance=balance-amount;
			int value=(int)(Math.random()*101)+100;//(min value 100 and max value 200)
			balance=balance+value;
			System.out.println(purple);
			System.out.println("You have to pay "+amount+" Rs for the "+f+" number of persons on your booking.");
			System.out.print(def);
			System.out.print(blue);
			System.out.println("you got the cashback of "+value);
			System.out.print(def);
			System.out.print(green);
			System.out.println("Sucessfully completed your booking");
			System.out.println(def);
			System.out.print(yellow);
			System.out.println("want to explore more about other places press y\nTo exit press n");
			System.out.print(def);
			char ch=sc.next().charAt(0);
			if(ch=='y')
			{
				new Explore().location();
			}
			else 
			{
				System.out.println(skblue);
				System.out.println("****************************");
				System.out.print(def);
				System.out.print(red);
				System.out.println("    Thanks for visiting!  ");
				System.out.println("      Enjoy your trip!  ");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("****************************");
				System.out.println(def);
				System.exit(0);
			}

		}
		else
		{
			System.out.println(red);
			System.out.println("You have Insufficent balance");
			System.out.print(def);
			int g=amount-balance;
			System.out.println(purple);
			System.out.println(" -> You have to pay "+amount+" Rs for the "+f+" number of persons on your booking.");
			System.out.print(def);
			System.out.print(red);
			System.out.println(" -> You need more "+g+" Rs to make payment");
			System.out.print(def);
			System.out.println(yellow);
			System.out.println("do you want to continue the payment process then then press 'y'\nFor cancel the trip press 'N'");
			System.out.print(def);	
			char c=sc.next().charAt(0);
			if(c=='y')
			{
				System.out.println(purple);
				System.out.println(" -> Enter the amount you want to add to your balance");
				System.out.println(def);
				int s=sc.nextInt();
				balance =balance+s;
				System.out.print(green);
				System.out.println("Amount is added sucessfully");
				System.out.print(def);
				finalpayment(amount);
			}
			else
			{
				System.out.println(red);
				System.out.println("Your hotel Booking is failed!");
				System.out.print(def);
				new Explore().location();
			}
		}
	}
}
class Gpay extends Bank
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purple = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";
	int c=1;
	int f=new Hotel().person;
	void finalpayment(int amount)
	{
		if(c==1)
		{
			System.out.println(purple);
			System.out.println("*********************GPay*********************");
			System.out.print(def);		
			c++;
		}
		if(amount<=balance)
		{
			balance=balance-amount;
			int value=(int)(Math.random()*401)+100;//(min value 100 and max value 400)
			balance=balance+value;
			System.out.println(purple);
			System.out.println("You have to pay "+amount+" Rs for the "+f+" number of persons on your booking.");
			System.out.print(def);
			System.out.print(blue);
			System.out.println("you got the cashback of "+value);
			System.out.print(def);
			System.out.print(green);
			System.out.println("Sucessfully completed your booking");
			System.out.println(def);
			System.out.print(yellow);
			System.out.println("want to explore more about other places press y\nTo exit press n");
			System.out.print(def);
			char ch=sc.next().charAt(0);
			if(ch=='y')
			{
				new Explore().location();
			}
			else
			{
				System.out.println(skblue);
				System.out.println("****************************");
				System.out.print(def);
				System.out.print(red);
				System.out.println("    Thanks for visiting!  ");
				System.out.println("      Enjoy your trip!  ");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("****************************");
				System.out.println(def);
				System.exit(0);
			}

		}
		else
		{
			System.out.println(red);
			System.out.println("You have Insufficent balance");
			System.out.print(def);
			int g=amount-balance;
			System.out.print(purple);
			System.out.println(" -> You have to pay "+amount+" Rs for the "+f+" number of persons on your booking.");
			System.out.print(red);
			System.out.println(" -> You need more "+g+" Rs to make payment");
			System.out.println(def);
			System.out.print(yellow);
			System.out.println("do you want to continue the payment process then then press 'y'\nFor cancel the trip press 'N'");
			System.out.print(def);	
			char c=sc.next().charAt(0);
			if(c=='y')
			{
				System.out.print(purple);
				System.out.println(" -> Enter the amount you want to add to your balance");
				System.out.print(def);
				int s=sc.nextInt();
				balance =balance+s;
				System.out.print(green);
				System.out.println("Amount is added sucessfully");
				System.out.print(def);
				finalpayment(amount);
			}
			else
			{
				System.out.print(red);
				System.out.println("Your hotel Booking is failed!");
				System.out.print(def);
				new Explore().location();
			}
		}
	}
}
class Paytm extends Bank
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purple = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";
	int f=new Hotel().person;
	int c=1;
	void finalpayment(int amount)
	{
		if(c==1)
		{
			System.out.println(purple);
			System.out.println("*********************Paytm*********************");
			System.out.print(def);
			c++;
		}
		
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println(purple);
			System.out.println("You have to pay "+amount+" Rs for the "+f+" number of persons on your booking.");
			System.out.print(def);
			System.out.print(blue);
			System.out.println("you get Rs30-Rs200 off on your first Quick Shop order");
			System.out.print(def);
			System.out.println(green);
			System.out.println("Sucessfully completed your booking");
			System.out.print(def);
			System.out.println(yellow);
			System.out.println("want to explore more about other places press y\nTo exit press n");
			System.out.print(def);
			char ch=sc.next().charAt(0);
			if(ch=='y')
			{
				new Explore().location();
			}
			else
			{
				System.out.println(skblue);
				System.out.println("****************************");
				System.out.print(def);
				System.out.print(red);
				System.out.println("    Thanks for visiting!  ");
				System.out.println("      Enjoy your trip!  ");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("****************************");
				System.out.println(def);
				System.exit(0);
			}
		}
		else
		{
			System.out.println(red);
			System.out.println("You have Insufficent balance");
			System.out.print(def);
			int g=amount-balance;
			System.out.println(blue);
			System.out.println(" -> You have to pay "+amount+" Rs for the "+f+" number of persons on your booking.");
			System.out.print(def);
			System.out.print(red);
			System.out.println(" -> You need more "+g+" Rs to make payment");
			System.out.print(def);
			System.out.println(yellow);
			System.out.println("do you want to continue the payment process then then press 'y'\nFor cancel the trip press 'N'");
			System.out.print(def);	
			char c=sc.next().charAt(0);
			if(c=='y')
			{
				System.out.println(purple);
				System.out.println(" -> Enter the amount you want to add to your balance");
				System.out.print(def);
				int s=sc.nextInt();
				balance =balance+s;
				System.out.println(green);
				System.out.println("Amount is added sucessfully");
				System.out.print(def);
				finalpayment(amount);
			}
			else
			{
				System.out.print(red);
				System.out.println("Your hotel Booking is failed!");
				System.out.print(def);
				new Explore().location();
			}
		}
	}
}

interface amount
{
	void payment(int amount);
}
class Hotel implements amount
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purple = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	static Scanner sc=new Scanner(System.in);
	int amount1;
	
	static int person;
	void person(int persons)
	{
		this.person=persons;
	}
	boolean isValidDate(String dateStr, String dateFormat)
	{
        	SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        	sdf.setLenient(false);  // Ensures strict matching to the format
        	try 
		{
			
            		sdf.parse(dateStr);// Try to parse the date string. If parsing is successful, return true.
            		return true;
        	} 
		catch (ParseException e) 
		{
            		return false; // If parsing fails, return false.
        	}
    	}
	void date()
	{
		System.out.println(blue);
		System.out.println("Enter the booking date (yyyy-mm-dd):");
		System.out.print(def);
		String inputDate = new java.util.Scanner(System.in).nextLine();
		if(isValidDate(inputDate,"yyyy-MM-dd")==true)
		{		
			LocalDate bookingDate = LocalDate.parse(inputDate);
			if (bookingDate.isAfter(LocalDate.now())||bookingDate.equals(LocalDate.now()))
			{	
       			} 
			else 
			{
				System.out.print(red);
            			System.out.println("Booking date must be in the future.");
				System.out.print(def);
				date();
        		}
		}
		else
		{
			System.out.print(red);
			System.out.println("Enter correct format date");
			System.out.print(def);
			date();
		}

	}
	
	public void payment(int amount)
	{
		this.amount1=amount;
		System.out.println(skblue);
		System.out.println("1.To know about the offers to payment");
		System.out.println("2.To choose payment platform");
		System.out.print(def);
		int f=sc.nextInt();
		switch(f)
		{
			case 1:
			{
				offers();
				break;
			}
			case 2:
			{
				paymentmethod();
				break;
			}
			default:
			{
				System.out.println(red);
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				System.out.print(def);
				payment(amount);
			}
		}
	}
	void offers()
	{
		System.out.println(skblue);
		System.out.println("By using Wallet you get 30% off on the price");
		System.out.println("By using PhonePay you get cashBack between 100-200");
		System.out.println("By using GPay you get cashBack between 100-500");
		System.out.println("By using Paytm you get gift voucher");
		System.out.print(def);
		paymentmethod();
	}
	void paymentmethod()
	{
		System.out.println(yellow);
		System.out.println("Select one option for Payment.");
		System.out.print(def);
		System.out.print(blue);
		System.out.println("1.wallet");
		System.out.println("2.Phonepay");
		System.out.println("3.Gpay");
		System.out.println("4.Paytm");
		System.out.println(def);
		int h=sc.nextInt();
		paymenttype(h,amount1);
	}
	void paymenttype(int n,int f)
	{
		switch(n)
		{
			case 1:
			{
				Wallet obj=new Wallet();
				obj.finalpayment(f);
				break;
			}
			case 2:
			{
				Phonepay obj=new Phonepay();
				obj.finalpayment(f);
				break;
			}
			case 3:
			{
				Gpay obj=new Gpay();
				obj.finalpayment(f);
				break;
			}
			case 4:
			{
				Paytm obj=new Paytm();
				obj.finalpayment(f);
				break;
			}
			default:
			{
				System.out.print(red);
				System.out.println("you have entered wrong input\nrestart the process again");
				System.out.print(def);
				paymentmethod();
				break;
			}
		}
	}
	void Goahotel()
	{
		System.out.println(purple);
		System.out.println("List of Hotels you can visit in Goa.");	
		System.out.print(def);
		System.out.println(skblue);
		System.out.println("1.The grand Leoney Resort");
		System.out.println("2.Hilton Goa Resort");
		System.out.println("3.Jolly Resort");
		System.out.println("4.Garden Resort");
		System.out.println("5.Back");
		System.out.print(def);
		int k=sc.nextInt();
		switch(k)
		{
			case 1:
			{
				System.out.println(purple);
				System.out.println("Welcome to The grand Leoney Resort");
				System.out.print(def);
				date();
				System.out.print(skblue);
				System.out.println("Each person costs 2000/- Rs per day");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("Enter no of persons are going to visit.");
				System.out.print(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm The grand Leoney Resort booking in Goa. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.print(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2000;
							payment(amount);
							break;
						}
						case 2:
						{
							Goahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Goahotel();
				}
				break;

			}
			case 2:
			{
				System.out.println(purple);
				System.out.println("Welcome to The Hilton Goa Resort");
				System.out.print(def);
				date();
				System.out.print(skblue);
				System.out.println("Each person costs 1500/- Rs per day.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.print(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Hilton Goa Resort booking in Goa. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.print(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1500;
							payment(amount);
							break;
						}
						case 2:
						{
							Goahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Goahotel();
				}
				break;

			}
			case 3:
			{
				System.out.println(purple);
				System.out.println("Welcome to The Jolly Resort");
				System.out.print(def);
				date();
				System.out.print(skblue);
				System.out.println("Each person costs 3000/- Rs per day.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.print(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Jolly Resort booking in Goa. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*3000;
							payment(amount);
							break;
						}
						case 2:
						{
							Goahotel();
							break;
						}
					}
					
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Goahotel();
				}
				break;

			}
			case 4:
			{
				System.out.println(purple);
				System.out.println("Welcome to The Garden Resort");
				System.out.print(def);
				date();
				System.out.print(skblue);
				System.out.println("Each person costs 2500/- Rs per day.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.print(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Garden Resort booking in Goa. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.print(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2500;
							payment(amount);
							break;
						}
						case 2:
						{
							Goahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Goahotel();
				}
				break;
			}
			case 5:
			{
				new Place().Goa();
			}

		}
	}
	void Arakuhotel()
	{
		System.out.print(purple);
		System.out.println("List of Hotels you can visit in Araku.");
		System.out.print(def);
		System.out.println(skblue);
		System.out.println("1.Vana Resort");
		System.out.println("2.Ushodaya Resort");
		System.out.println("3.Prakruthi Resort");
		System.out.println("4.Vihara Resort");
		System.out.println("5.Back");
		System.out.println(def);
		int k=sc.nextInt();
		switch(k)
		{
			case 1:
			{
				System.out.println(purple);
				System.out.println("Welcome to The Vana Resort");
				System.out.print(def);
				date();
				System.out.print(skblue);
				System.out.println("Each person costs 1000/- Rs per day.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Vana Resort booking in Araku. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1000;
							payment(amount);
							break;
						}
						case 2:
						{
							Arakuhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Arakuhotel();
				}
				break;

			}
			case 2:
			{
				System.out.print(purple);
				System.out.println("Welcome to The Ushodaya Resort");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 500/- Rs per day.");
				System.out.print(def);
				System.out.println(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Ushodaya Resort booking in Araku. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*500;
							payment(amount);
							break;
						}
						case 2:
						{
							Arakuhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Arakuhotel();
				}
				break;

			}
			case 3:
			{
				System.out.print(purple);
				System.out.println("Welcome to The Prakruthi Resort");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 500/- Rs per day.");
				System.out.print(def);
				System.out.println(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Prakruthi Resort booking in Araku. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*500;
							payment(amount);
							break;
						}
						case 2:
						{
							Arakuhotel();
							break;
						}
					}
					
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Arakuhotel();
				}
				break;

			}
			case 4:
			{
				System.out.print(purple);
				System.out.println("Welcome to The Vihara Resort");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 800/- Rs per day.");
				System.out.println(def);
				System.out.print(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Vihara Resort booking in Araku. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*800;
							payment(amount);
							break;
						}
						case 2:
						{
							Arakuhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Arakuhotel();
				}
				break;
			}
			case 5:
			{
				new Place().Araku();
			}

		}

	}
	void Keralahotel()
	{
		System.out.print(purple);
		System.out.println("List of Hotels you can visit in Kerala.");
		System.out.print(def);
		System.out.println(skblue);
		System.out.println("1.Taj Malabar Resort");
		System.out.println("2.Marari Beach Resort");
		System.out.println("3.Taj Green Cove Resort ");
		System.out.println("4.Rainforest Resort");
		System.out.println("5.Back");
		System.out.println(def);
		int k=sc.nextInt();
		switch(k)
		{
			case 1:
			{
				System.out.print(purple);
				System.out.println("Welcome to The Taj Malabar Resort");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 3000/- Rs per day.");
				System.out.print(def);
				System.out.println(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Taj Malabar Resort booking in Kerala. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*3000;
							payment(amount);
							break;
						}
						case 2:
						{
							Keralahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Keralahotel();
				}
				break;

			}
			case 2:
			{
				System.out.print(purple);
				System.out.println("Welcome to The Marari Beach Resort");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 2500/- Rs per day.");
				System.out.print(def);
				System.out.println(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Marari Beach Resort booking in Kerala. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2500;
							payment(amount);
							break;
						}
						case 2:
						{
							Keralahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Keralahotel();
				}
				break;

			}
			case 3:
			{
				System.out.print(purple);
				System.out.println("Welcome to The Taj Green Cove Resort");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 2000/- Rs per day.");
				System.out.print(def);
				System.out.println(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Taj Green Cove Resort booking in Kerala. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2000;
							payment(amount);
							break;
						}
						case 2:
						{
							Keralahotel();
							break;
						}
					}
					
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Arakuhotel();
				}
				break;

			}
			case 4:
			{
				System.out.print(purple);
				System.out.println("Welcome to The Rainforest Resort");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 1000/- Rs per day.");
				System.out.println(def);
				System.out.println(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Rainforest Resort booking in Kerala. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1000;
							payment(amount);
							break;
						}
						case 2:
						{
							Keralahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Keralahotel();
				}
				break;
			}
			case 5:
			{
				new Place().Kerala();
			}

		}

	}
	void Hyderabadhotel()
	{
		System.out.print(purple);
		System.out.println("List of Hotels you can visit in Hyderabad.");
		System.out.print(def);
		System.out.println(skblue);
		System.out.println("1.Novotel Hyderabad");
		System.out.println("2.Hotel Park Continental");
		System.out.println("3.Taj Green Hotel ");
		System.out.println("4.Plaza Hotel ");
		System.out.println("5.Back");
		System.out.println(def);
		int k=sc.nextInt();
		switch(k)
		{
			case 1:
			{
				System.out.println(purple);
				System.out.println("Welcome to the Novotel Hyderabad");
				System.out.print(def);
				date();							
				System.out.print(skblue);
				System.out.println("Each person costs 3000/- Rs per day.");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Novotel Hyderabad Convention Centre booking in Hyderabad. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*3000;
							payment(amount);
							break;
						}
						case 2:
						{
							Hyderabadhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Hyderabadhotel();
				}
				break;

			}
			case 2:
			{
				System.out.print(purple);
				System.out.println("Welcome to the Taj Green Hotel");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 2000/- Rs per day.");
				System.out.print(def);
				System.out.println(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Hotel Park Continental booking in Hyderabad. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2000;
							payment(amount);
							break;
						}
						case 2:
						{
							Hyderabadhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Hyderabadhotel();
				}
				break;

			}
			case 3:
			{
				System.out.print(purple);
				System.out.println("Welcome to the Hotel Park Continental");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 1000/- Rs per day.");
				System.out.println(def);
				System.out.println(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Taj Green Hotel booking in Hyderabad. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1000;
							payment(amount);
							break;
						}
						case 2:
						{
							Hyderabadhotel();
							break;
						}
					}
					
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Hyderabadhotel();
				}
				break;

			}
			case 4:
			{
				System.out.print(purple);
				System.out.println("Welcome to the Plaza Hotel");
				System.out.print(def);
				date();
				System.out.println(skblue);
				System.out.println("Each person costs 1500/- Rs per day.");
				System.out.println(def);
				System.out.println(yellow);
				System.out.println("Enter no of persons are going to visit");
				System.out.println(def);
				int f=sc.nextInt();
				person(f);
				System.out.println(green);
				System.out.println("To confirm Plaza Hotel booking in Hyderabad. \nEnter 1 to continue payment method\nEnter 2 for go back");
				System.out.println(def);
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1500;
							payment(amount);
							break;
						}
						case 2:
						{
							Hyderabadhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println(red);
					System.out.println("you have entered wrong input\nrestart the process again");
					System.out.println(def);
					Hyderabadhotel();
				}
				break;
			}
			case 5:
			{
				new Place().Hyderabad();
			}

		}

	}
	
}
class Place
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purple = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	static Scanner sc=new Scanner(System.in);
	void Goa()
	{
		System.out.println(purple);
		System.out.println("Detail discription about Goa.");
		System.out.print(def);
		System.out.print(skblue);
		System.out.println("1.possible ways");
		System.out.println("2.places to explore");
		System.out.println("3.hotels to stay");
		System.out.println("4.Back");
		System.out.print(def);
		System.out.println(yellow);
		System.out.println("Choose an option 1-for possible ways 2-for places to explore 3-for hotels to stay 4-Back.");
		System.out.println(def);
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.print(skblue);
				System.out.println("Different ways of transportation to visit Goa.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("1. By air");
				System.out.print(def);
				System.out.print(green);
				System.out.println("   *Goa’s Main Airport");
				System.out.println("   *Mopa Airport (New Goa Airport)");
				System.out.println("   *Post-Flight Transport");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("2. By Train");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("   *From Mumbai:Konkan Kanya Express, Mandovi Express");
				System.out.println("   *From Delhi:Goa Sampark Kranti Express and Rajdhani Express.");
				System.out.println("   *From Bangalore: The Vasco da Gama Express and Goa Express run between Bangalore and Goa.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("3. By Road");
				System.out.print(def);
				System.out.print(red);
				System.out.println("   *Government and Private Buses: Buses operated by KSRTC, MSRTC, and private operators like VRL, SRS, and Neeta Travels provide regular services to Goa from nearby states.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("4. By sea");
				System.out.print(def);
				System.out.print(blue);
				System.out.println("   *Mumbai to Goa Cruise:Companies like Cordelia Cruises operate luxury cruises from Mumbai to Goa.");
				System.out.print(def);
				System.out.println(yellow);
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				System.out.println(def);
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Goa();
						break;
					}
					case 2:
					{
						new Hotel().Goahotel();
						break;
					}
					default:
					{
						System.out.println(red);
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						System.out.println(def);
						new Explore().location();
					}
				}
				break;
			
			}
			case 2:
			{
				System.out.println(skblue);
				System.out.println("List of places you can explore in Goa.");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("1.Baga Beach");
				System.out.print(def);
				System.out.print(green);
				System.out.println("     One of Goa's most popular beaches, known for water sports like parasailing, jet skiing, and banana boat rides.");
				System.out.println("     Lively nightlife with beach shacks, bars, and clubs like Tito’s and Mambo’s.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("2.Dudhsagar Waterfalls");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("     One of India’s tallest waterfalls, located on the Goa-Karnataka border.");
				System.out.println("     The name Dudhsagar means Sea of Milk, referring to the waterfall's white, milky appearance.");
				System.out.println("     Trekking through lush forests or taking a jeep safari to the falls.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("3.Chapora Fort");
				System.out.print(def);
				System.out.print(red);
				System.out.println("     Known for its panoramic views over Vagator Beach, Chapora Fort is a historic site that gained fame from the movie Dil Chahta Hai.");
				System.out.println("     Visit for sunset, but also explore the fort's history—it was once a defense outpost for the Portuguese against Maratha invasions.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("4.Palolem Beach");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("     A crescent-shaped beach in South Goa, known for its tranquil atmosphere and palm-lined shores.");
				System.out.println("     Famous for its Silent Noise Parties, where party-goers wear headphones.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("5.Basilica of Bom Jesus (UNESCO World Heritage Site)");
				System.out.print(def);
				System.out.print(blue);
				System.out.println("     A historic church that holds the mortal remains of St. Francis Xavier.");
				System.out.println("     Known for its baroque architecture and religious significance.");
				System.out.println("     The church is over 400 years old and is one of the most important pilgrimage sites for Christians.");
				System.out.print(def);
				System.out.println(yellow);
				System.out.println("To Know more about this place.\nEnter 1.Back to the options\nEnter 2.To Book the hotels");
				System.out.print(def);
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Goa();
						break;
					}
					case 2:
					{
						new Hotel().Goahotel();
						break;
					}
					default:
					{
						System.out.print(red);
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						System.out.print(def);
						new Explore().location();
					}
				}
				break;
			}
			case 3:
			{
				new Hotel().Goahotel();
				break;
			}
			case 4:
			{
				new Explore().location();
				break;
			}
			default:
			{
				System.out.println(red);
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				System.out.println(def);
				Goa();
			}
		}
	}
	void Araku()
	{
		System.out.print(purple);
		System.out.println("Detail discription about Araku.");
		System.out.print(def);
		System.out.print(skblue);
		System.out.println("1.possible ways");
		System.out.println("2.places to explore");
		System.out.println("3.hotels to stay");
		System.out.println("4.Back");
		System.out.print(def);
		System.out.print(yellow);
		System.out.println("Choose an option 1-for possible ways 2-for places to explore 3-for hotels to stay 4-Back.");
		System.out.print(def);
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.print(skblue);
				System.out.println("Different ways of transportation to visit Araku.");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("1. By Train");
				System.out.print(def);
				System.out.print(green);
				System.out.println("   *Kirandul Passenger (Train No: 58501) with a special Vistadome coach.");
				System.out.println("   *Visakhapatnam – Kirandul Express (Train No: 18514)");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("2. By Road");
				System.out.print(def);
				System.out.print(red);
				System.out.println("   *Route: NH16 and Araku Road.");
				System.out.println("   *By bus APSRTC (Andhra Pradesh State Road Transport Corporation) and private bus");
				System.out.println(def);
				System.out.print(purple);
				System.out.println("3. By Air");
				System.out.print(def);
				System.out.print(blue);
				System.out.println("   * Visakhapatnam Airport (VTZ)");
				System.out.println(def);
				System.out.println();
				System.out.print(yellow);
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels.");
				System.out.print(def);
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Araku();
						break;
					}
					case 2:
					{
						new Hotel().Arakuhotel();
						break;
					}
					default:
					{
						System.out.println(red);
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						System.out.println(def);
						new Explore().location();
					}
				}
				break;
			
			}
			case 2:
			{
				System.out.print(skblue);
				System.out.println("List of places you can explore in Araku.");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("1.Borra Caves");
				System.out.print(def);
				System.out.print(green);
				System.out.println("     Ancient limestone caves, believed to be over a million years old.");
				System.out.println("     Unique stalactites and stalagmites formations.");
				System.out.println("     The natural Shivling inside the cave, making it a pilgrimage site.");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("2.Araku Tribal Museum");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("     A museum showcasing the culture, lifestyle, handicrafts of the tribal communities of the region.");
				System.out.println("     Displays of tribal artifacts, traditional jewelry, tools, and art.");
				System.out.println("     The museum also has a small shopping area for souvenirs.");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("3.Katiki Waterfalls");
				System.out.print(def);
				System.out.print(red);
				System.out.println("     A stunning waterfall located about 4 km from Borra Caves.");
				System.out.println("     Requires a short trek through scenic landscapes.");
				System.out.println("     The 50-foot-high falls are fed by the Gosthani River.");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("4.Ananthagiri Hills");
				System.out.print(def);
				System.out.print(yellow);
				System.out.println("     A lush green hill station located en route to Araku.");
				System.out.println("     Known for its beautiful landscapes, waterfalls, and coffee plantations.");
				System.out.println("     The Musi River originates from this region.");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("5.Coffee Plantations");
				System.out.print(def);
				System.out.print(blue);
				System.out.println("     Araku is famous for its coffee, especially the organic coffee grown by tribal farmers.");
				System.out.println("     You can visit the plantations, learn about coffee cultivation.");
				System.out.println("     Coffee Museum, which showcases the history of coffee and offers coffee tasting.");
				System.out.println(def);
				System.out.println();
				System.out.print(yellow);
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels.");
				System.out.print(def);
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Araku();
						break;
					}
					case 2:
					{
						new Hotel().Arakuhotel();
						break;
					}
					default:
					{
						System.out.print(red);
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						System.out.print(def);
						new Explore().location();
					}
				}
				break;
			}
			case 3:
			{
				new Hotel().Arakuhotel();
				break;
			}
			case 4:
			{
				new Explore().location();
				break;
			}
			default:
			{
				System.out.print(red);
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				System.out.print(def);
				Araku();
			}
		}

	}
	void Kerala()
	{
		System.out.print(purple);
		System.out.println("Detail discription about Kerala.");
		System.out.print(def);
		System.out.print(skblue);
		System.out.println("1.possible ways");
		System.out.println("2.places to explore");
		System.out.println("3.hotels to stay");
		System.out.println("4.Back");
		System.out.print(def);
		System.out.print(yellow);
		System.out.println("Choose an option 1-for possible ways 2-for places to explore 3-for hotels to stay 4-Back.");
		System.out.print(def);
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.print(skblue);
				System.out.println("Different ways of transportation to visit Kerala.");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("1. By air");
				System.out.print(def);
				System.out.print(green);
				System.out.println("   Kerala has four international airports.");
				System.out.println("   * Cochin International Airport (COK) in Kochi.");
				System.out.println("   * Trivandrum International Airport (TRV) in Thiruvananthapuram.");
				System.out.println("   * Calicut International Airport (CCJ) in Kozhikode.");
				System.out.println("   * Kannur International Airport (KIAL) in Kannur.");
				System.out.println(def);
				System.out.print(purple);
				System.out.println("2.By train");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("   Major railway stations in Kerala include:");
				System.out.println("   * Thiruvananthapuram Central");
				System.out.println("   * Ernakulam Junction (Kochi)");
				System.out.println("   * Kozhikode");
				System.out.println("   * Alappuzha");
				System.out.println(def);
				System.out.print(purple);
				System.out.println("3.By road");
				System.out.print(def);
				System.out.print(red);
				System.out.println("   Kerala using national highways like NH66, NH544, and NH183.");
				System.out.println("   * Kerala State Road Transport Corporation (KSRTC)");
				System.out.println(def);
				System.out.print(purple);
				System.out.println("4.By Water");
				System.out.print(def);
				System.out.print(blue);
				System.out.println("   Kerala has different sea bodies.");
				System.out.println("   * Kerala State Road Transport Corporation (KSRTC)");
				System.out.println(def);
				System.out.println(yellow);
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				System.out.print(def);
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Kerala();
						break;
					}
					case 2:
					{
						new Hotel().Keralahotel();
						break;
					}
					default:
					{
						System.out.print(red);
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						System.out.print(def);
						new Explore().location();
					}
				}
				break;
			
			}
			case 2:
			{
				System.out.print(skblue);
				System.out.println("List of places you can explore in Kerala.");
				System.out.println(def);
				System.out.print(purple);
				System.out.println("1.Histoical places");
				System.out.print(def);
				System.out.print(green);
				System.out.println("  ->Kochi (Cochin)");
				System.out.println("    Fort Kochi (colonial architecture, Chinese fishing nets)");
				System.out.println("    Mattancherry Palace");
				System.out.println("    Kerala Kathakali Centre (traditional dance performances)");
				System.out.println("  ->Thiruvananthapuram (Trivandrum)");
				System.out.println("    Sree Padmanabhaswamy Temple (richest temple in the world)");
				System.out.println("    Kovalam Beach (nearby)");
				System.out.println("    Napier Museum");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("2.Backwaters");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("  ->Kumarakom");
				System.out.println("    Houseboats on Vembanad Lake");
				System.out.println("    Aruvikkuzhi Waterfall");
				System.out.println("  ->Alleppey (Alappuzha)");
				System.out.println("    Alappuzha Beach");
				System.out.println("    Vembanad Lake");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("3.Hill stations");
				System.out.print(def);
				System.out.print(red);
				System.out.println("  ->Munnar");
				System.out.println("    Attukal Waterfalls");
				System.out.println("    Anamudi Peak (highest in South India)");
				System.out.println("  ->Wayanad");
				System.out.println("    Edakkal Caves (prehistoric carvings)");
				System.out.println("    Banasura Sagar Dam");
				System.out.print(def);
				System.out.print(purple);
				System.out.println("4.Beach town");
				System.out.print(def);
				System.out.print(blue);
				System.out.println("  ->Varkala");
				System.out.println("    Varkala Beach (Papanasam Beach)");
				System.out.println("    Sivagiri Mutt (spiritual site)");
				System.out.println("  ->Kovalam");
				System.out.println("    Lighthouse Beach");
				System.out.println("    Hawah Beach");
				System.out.println(def);
				System.out.println();
				System.out.print(yellow);
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				System.out.print(def);
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Kerala();
						break;
					}
					case 2:
					{
						new Hotel().Keralahotel();
						break;
					}
					default:
					{
						System.out.print(red);
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						System.out.print(def);
						new Explore().location();
					}
				}
				break;
			}
			case 3:
			{
				new Hotel().Keralahotel();
				break;
			}
			case 4:
			{
				new Explore().location();
				break;
			}
			default:
			{
				System.out.print(red);
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				System.out.print(def);
				Kerala();
			}
		}
	}
	void Hyderabad()
	{
		System.out.print(purple);
		System.out.println("Detail discription about Hyderabad.");
		System.out.println(def);
		System.out.print(skblue);
		System.out.println("1.possible ways");
		System.out.println("2.places to explore");
		System.out.println("3.hotels to stay");
		System.out.println("4.Back");
		System.out.print(def);
		System.out.println(yellow);
		System.out.println("Choose an option 1-for possible ways 2-for places to explore 3-for hotels to stay 4-Back.");
		System.out.print(def);
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.print(skblue);
				System.out.println("Different ways of transportation to visit Hyderabad.");
				System.out.println(def);
				System.out.print(purple);
				System.out.println("1.By air");
				System.out.print(def);
				System.out.print(blue);
				System.out.println("   Hyderabad has one international airports.");
				System.out.println("   * Rajiv Gandhi International Airport (HYD), Shamshabad.");
				System.out.println(def);
				System.out.print(purple);
				System.out.println("2.By train");
				System.out.print(def);
				System.out.print(green);
				System.out.println("   Major railway stations in Hyderabad:");
				System.out.println("   * Secunderabad Junction");
				System.out.println("   * Lingampalli Railway Station");
				System.out.println(def);
				System.out.print(purple);
				System.out.println("3.By road");
				System.out.print(def);
				System.out.print(red);
				System.out.println("   Hyderabad using national highways like NH44, NH65, and NH163.");
				System.out.println("   * Telagana State Road Transport Corporation (TSRTC)");
				System.out.println(def);
				System.out.println(yellow);
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				System.out.print(def);
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Hyderabad();
						break;
					}
					case 2:
					{
						new Hotel().Hyderabadhotel();
						break;
					}
					default:
					{
						System.out.print(red);
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						System.out.print(def);
						new Explore().location();
					}
				}
				break;
			
			}
			case 2:
			{
				System.out.println(skblue);
				System.out.println("List of places you can explore in Hyderabad.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("1.Histoical places");
				System.out.print(def);
				System.out.print(green);
				System.out.println("  ->Charminar");
				System.out.println("    The iconic symbol of Hyderabad is CharminarAn iconic symbol of Hyderabad.");
				System.out.println("    This 16th-century mosque features four grand arches and is surrounded by bustling markets..");
				System.out.println("  ->Golconda Fort");
				System.out.println("    A magnificent fort known for its impressive architecture and acoustics.");
				System.out.println("    A spectacular Sound and Light Show narrates the history of the fort.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("2.Parks");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("  ->Lumbini Park");
				System.out.println("    A serene park near Hussain Sagar Lake,known for its beautiful landscapes and boating facilities..");
				System.out.println("  ->Nehru Zoological Park");
				System.out.println("    A vast zoo that is home to a wide variety of animals, perfect for a family outing..");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("3.Modern Attractions");
				System.out.print(def);
				System.out.print(red);
				System.out.println("  ->Ramoji Film City");
				System.out.println("    One of the largest film cities in the world, offering guided tours, film sets, and various entertainment options.");
				System.out.println("  ->Shilparamam");
				System.out.println("    An arts and crafts village that showcases traditional Indian handicrafts and hosts cultural events.");
				System.out.print(def);
				System.out.println(purple);
				System.out.println("4.Temples");
				System.out.print(def);
				System.out.print(blue);

				System.out.println("  ->Birla Mandir");
				System.out.println("    This marble temple dedicated to Lord Venkateswara is a peaceful place of worship offering stunning views of the city.");
				System.out.println("  ->Iskon Temple");
				System.out.println("    Sri Radha Madanmohan Mandir, is a beautiful temple dedicated to Lord Krishna");
				System.out.print(def);
				System.out.println(yellow);
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				System.out.print(def);
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Hyderabad();
						break;
					}
					case 2:
					{
						new Hotel().Hyderabadhotel();
						break;
					}
					default:
					{
						System.out.print(red);
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						System.out.print(def);
						new Explore().location();
					}
				}
				break;
			}
			case 3:
			{
				new Hotel().Hyderabadhotel();
				break;
			}
			case 4:
			{
				new Explore().location();
				break;
			}
			default:
			{
				System.out.print(red);
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				System.out.print(def);
				Hyderabad();
			}
		}

	}
}
class Explore extends Login
{
    static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purple = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	static Login obj=new Login();
	static Place obj2=new Place();
	void place(int a)
	{
		switch(a)
		{
			case 1:
			{
				obj2.Goa();
				break;
			}
			case 2:
			{
				obj2.Araku();
				break;
			}
			case 3:
			{
				obj2.Kerala();
				break;
			}
			case 4:
			{
				obj2.Hyderabad();
				break;
			}
			case 5:
			{
				placeorhotel();
				break;

			}
			case 6:
			{
				return;
			}
			default:
			{
				System.out.print(red);
				System.out.println("you have entered wrong input\nplease select correct input");
				System.out.print(def);
				location();
			}
		}
	}
	void location()
	{
		System.out.println(blue);
		System.out.println("Places to explore in India.");
		System.out.print(def);
		System.out.println(purple);
		System.out.println("1.Goa");
	   	System.out.println("2.Araku");
	    	System.out.println("3.Kerala");
	    	System.out.println("4.Hyderabad");
		System.out.println("5.Back");
		System.out.println("6.Exit");
		System.out.print(yellow);
		System.out.println("Choose an Option.");
		System.out.print(def);
		int c=sc.nextInt();
		place(c);
	}
	void hotelplace()
	{
		System.out.println(blue);
		System.out.println(" List of hotels from different places in India.");
		System.out.print(def);
		System.out.println(green);
		System.out.println("1.Goa Hotels");
		System.out.println("2.Araku Hotels");
		System.out.println("3.Kerala Hotels");
		System.out.println("4.Hyderabad");
		System.out.println("5.Back");
		System.out.print(def);
		System.out.println(yellow);
		System.out.println("choose an option to visit hotels from different locations.");
		System.out.print(def);
		int s=sc.nextInt();
		System.out.println();
		switch(s)
		{
			case 1:
			{
				new Hotel().Goahotel();
				break;
			}
			case 2:
			{
				new Hotel().Arakuhotel();
				break;
			}
			case 3:
			{
				new Hotel().Keralahotel();
				break;
			}
			case 4:
			{
				new Hotel().Hyderabadhotel();
				break;
			}
			case 5:
			{
				placeorhotel();
				break;
			}
			default:
			{
				System.out.print(red);
				System.out.println("you have entered wrong input.\nplease select correct input");
				System.out.print(def);
				hotelplace();
				break;
			}
		}
	}
	void placeorhotel()
	{
		System.out.print(green);
		System.out.println("1.To explore the places.");
		System.out.println("2.To Explore the Hotels.");
		System.out.print(def);
		System.out.print(yellow);
		System.out.println("Enter your option.");
		System.out.print(def);
		int s=sc.nextInt();
		switch(s)
		{
			case 1:
			{
				location();
				break;	
			}
			case 2:
			{
				hotelplace();
				break;
			}
			default:
			{
				System.out.print(red);
				System.out.println("You have Entered wrong input.\nplease select correct input");
				System.out.print(def);
				placeorhotel();
			}
		}
	}
	public static void main(String[] args)
	{
        	Scanner sc=new Scanner(System.in);
        	Explore obj=new Explore();
		obj.start();
		obj.placeorhotel();		
	}
}
