package store;

import java.util.*;
class InvalidPasswordException extends Exception{
	
}
class InvalidChoiceException extends ArithmeticException{
	
}
interface gro{
	public double enterQuantity() ;
	 public double totalPrice();
	
}
interface reg{
	
	public void contact();
	int a=0 ;

	 
}
class Grocery implements gro {
	 String Name;
	 double Price;
	 double Quantity;
	 
	

	public Grocery( String name,double price, double quantity) {
		//super();
		Price = price;
		Quantity = quantity;
		Name = name;
	}
	@Override
	public String toString() {
		return "Product: " + Name + "\nPrice: " + Price + "\nTotal Price: " + totalPrice();
	
	}
	
	
    public double enterQuantity() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter quantity(in kg): ");
		        return scanner.nextDouble();
		 }
		 
		 public double totalPrice()
		 {
			 double total=Price*enterQuantity();
			 return total;
		 }
		
		 
		
}
class Payment {
	private long cardnumber;
    private long UPIno;
	public void creditcard() {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter your CreditCard Number");
		  long cardnumber=sc.nextLong();
		  if(cardnumber>99999999999l) {
			  System.out.println("Payment Succesfull");
		  }
		  else {
			  System.out.println("Enter valid number!!");
			  creditcard();
		  }
	  }
	  public void upi() {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter UPI Number");
		  long UPIno=sc.nextLong();
		  if(UPIno<9999999999l) {
			  System.out.println("Payment Succesfull");
		  }
		  else {
			  System.out.println("Enter valid number!!");
			  upi();
		  }
	  }
	 
	 
}

 class Registration implements reg {
	

	String fname;
	String lname;
	long phonenumber;
	String address;
	String Password; 
	
	public void signup()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first Name");
		fname=sc.nextLine();
		System.out.println("Enter your Lastname");
		lname=sc.nextLine();
		System.out.println("Enter your Address");
		address=sc.nextLine();
		contact();
		Pass();}
		public void Pass() {
		System.out.println("Enter your Password");
		Scanner sc=new Scanner(System.in);
		Password=sc.nextLine();
		try {
		if(Password.length() > 6)  
	    {
		  System.out.println("continue");
	    }
	    else {
		   throw new InvalidPasswordException();		 }
	 
}

	 
	 catch( Exception ae)
	 {
       System.out.println("invalid");
       Pass();
	 }
		
	}
	public void contact() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your phone number");
		long phonenumber= sc.nextLong();
		if (phonenumber > 999999999l && phonenumber <10000000000l) {
			this.phonenumber=phonenumber;
		}
		else {
			System.out.println("enter 10 digits Number");
			contact();
		}
	}

	
		public void login()
		{
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter first name:");
			String name=sc.next();
			System.out.println("Enter Password");
			String Pass=sc.next();
			if(name.equals(this.fname) )
			{
				if(Pass.equals(this.Password))
					System.out.println("Login Successful");
					 
					 }
			else {
				System.out.println("Enter valid Name and Password");
				login();
			}
			}	
		
		}

		
	

	 class RiceProducts extends Grocery{
          
		RiceProducts( String Name,double Price, double Quantity) {
			super( Name,Price, Quantity);
		}
		public void rice(){
		    String Brand;
			System.out.println("SElect Brand\n1.Kohinoor\n2.Daawat\n3.Fortune\n4.India Gate");

			Scanner sc=new Scanner(System.in);
			int rice=sc.nextInt();
			switch(rice)
			{case 1:
			 System.out.println("You have selected Kohinoor Rice ");
			 break;
			case 2:
				 System.out.println("You have selected Daawat Rice ");
				 break;
			case 3:
				 System.out.println("You have selected Fortune Rice ");
				 break;
			case 4:
				 System.out.println("You have selected India Gate Rice ");
				 break;
			 
			}
			

	       
			
		}

	     }
			
class Wheat extends Grocery{

		Wheat( String Name,double Price, double Quantity) {
			super( Name,Price,Quantity);
		}

	 }
			
       class Pulses extends Grocery{

		Pulses( String Name, double Price,double Quantity) {
			super( Name,Price,Quantity);
		}

       }
			
  class Flour extends Grocery{

		Flour(String Name, double Price,double Quantity) {
		super( Name,Price,Quantity);}
		

	
	}
    
  class Species extends Grocery{

		Species(String Name, double Price,double Quantity) {
		super( Name,Price,Quantity);}
		@Override
		 public double enterQuantity() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter quantity(in unit): ");
		        return scanner.nextDouble();
		 
		}
	
	
  }
  class Beverages extends Grocery{

		Beverages(String Name, double Price,double Quantity) {
		super( Name,Price,Quantity);
		}
		@Override
		 public double enterQuantity() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter quantity(in litres): ");
		        return scanner.nextDouble();
		}
		
  }
  class EdibleOils extends Grocery{

		EdibleOils(String Name, double Price,double Quantity) {
		super( Name,Price,Quantity);
		}
		@Override
		 public double enterQuantity() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter quantity(in litres): ");
		        return scanner.nextDouble();}
		
  }
 class DairyProducts extends Grocery{

		DairyProducts(String Name, double Price,double Quantity) {
		super( Name,Price,Quantity);
		}
		
}
  
public  class P1 {

    public static void main(String[] args) {
    	 
    	System.out.println("Welcome to RMart");
        Scanner sc = new Scanner(System.in);
//        System.out.println("\n1.Register\n2.Login");
//         int options = sc.nextInt();
//        switch(options)
//        {
//        case 1: 
//        Registration r = new Registration();
//        r.signup();
//        System.out.println("You are Registered succesfully!!"); 
//        System.out.println("Now Login");
//        r.login();
//        
//        break;
//       
//        case 2:
//        	Registration r2=new Registration();
//        	r2.login();
//        	 
//        	
//           
//		 break;
        
       // default: System.out.println("invalid Input");
        //}    
                 
        System.out.println("\nSelect your choice :\n1.RiceProducts\n2.Wheat \n3.Pulses\n4.Flour\n5.Species\n6.Beverages\n7.EdibleOils\n8.DairyProducts\n");
        
		 
		 try {
		      
		       int choose= sc.nextInt();
		       if(choose>=1 && choose<=8)
		       {
		    	  
		       }
		       else {
		    	   throw new InvalidChoiceException();
		       }
     switch (choose)	{
	case 1: 
	List<RiceProducts> groceries = new ArrayList<>();
    groceries.add(new RiceProducts("Basmati Rice", 50, 0));
    groceries.add(new RiceProducts("Jasmine Rice", 40, 0));
    groceries.add(new RiceProducts("Short Grain Rice", 40, 0));
    groceries.add(new RiceProducts("Black Rice", 40, 0));
    groceries.add(new RiceProducts("Kolam Rice", 40, 0));
    groceries.add(new RiceProducts("Poha", 40, 0));
    System.out.println("===================================================");
    System.out.println("Choose a category:");
    System.out.println("\n0.BasmatiRice\n1.JasminRice \n2.ShortGrainRice\n3.BlackRice\n4.Kolam Rice\n5.Poha(Flattend rice)");
        int choice = sc.nextInt();
        if (choice >= 0 && choice < groceries.size()) {
            Grocery selectedRice = groceries.get(choice);
            RiceProducts r=new RiceProducts("abc",0,0);
            r.rice();
            System.out.println(selectedRice);
            System.out.println("===================================================");
            System.out.println("Choose Payment Option\n1.CreditCardNumber\n2.UPI Payment");
            int select =sc.nextInt();
            if(select==1) {
            	Payment p1 =new Payment();
            	p1.creditcard();
            }
            else {
            	Payment p2 =new Payment();
            	p2.upi();
            }
         
            }
        else {
            System.out.println("Invalid choice.");
             }
        System.out.println("===================================================");   
	System.out.println("Thank you for shopping at RMart!");
      
	break;
		case 2:
    	List<Grocery> wheatList = new ArrayList<>();
    	wheatList.add(new Wheat("Khapali Wheat", 55, 0));
    	wheatList.add(new Wheat("Lokvan Gujrat Wheat", 35, 0));
    	wheatList.add(new Wheat("Lokvan MP Wheat", 45, 0));
    	wheatList.add(new Wheat("MP Sure Wheat", 80, 0));
    	System.out.println("===================================================");
    	System.out.println("Choose a wheat type:");
System.out.println("\n0.Khapali Wheat\n1.Lokvan Gujrat Wheat \n2.Lokvan MP\n3.Mp Sure Wheat");
    int choice1 = sc.nextInt();
    if (choice1 >= 0 && choice1 < wheatList.size()) {
        Grocery selectedWheat = wheatList.get(choice1);
        System.out.println(selectedWheat);
        System.out.println("===================================================");
        System.out.println("Choose Payment OPtion\n1.CreditCardNumber\n2.UPI Payment");
        int select =sc.nextInt();
        if(select==1) {
        	Payment p1 =new Payment();
        	p1.creditcard();
        }
        else {
        	Payment p2 =new Payment();
        	p2.upi();
        }
     
        }
        
    else {
        System.out.println("Invalid choice.");
    }
    System.out.println("===================================================");
    System.out.println("Thank you for shopping at RMart!");
    break;
		case 3:
			List<Grocery> PulsesList = new ArrayList<>();
	    	PulsesList.add(new Pulses("Tur Dal", 55, 0));
	    	PulsesList.add(new Pulses("Moong Dal", 35, 0));
	    	PulsesList.add(new Pulses("Masoor Dal", 45, 0));
	    	PulsesList.add(new Pulses("Urad Dal", 80, 0));
	    	System.out.println("===================================================");
	    	System.out.println("Choose a Dal type:");
	System.out.println("\n0.Tur Dal\n1.moong Dal \n2.Masoor Dal\n3.Urad Dal");
	    int choice2 = sc.nextInt();
	    if (choice2 >= 0 && choice2 < PulsesList.size()) {
	        Grocery selectedPulses = PulsesList.get(choice2);
	        System.out.println(selectedPulses);
	        System.out.println("===================================================");
	        System.out.println("Choose Payment OPtion\n1.CreditCardNumber\n2.UPI Payment");
	        int select =sc.nextInt();
	        if(select==1) {
	        	Payment p1 =new Payment();
	        	p1.creditcard();
	        }
	        else {
	        	Payment p2 =new Payment();
	        	p2.upi();
	        }
	        }
	    else {
	        System.out.println("Invalid choice.");
	    }
	    System.out.println("===================================================");
	    System.out.println("Thank you for shopping at RMart!");
	   break;
		case 4:
		List<Grocery> FlourList = new ArrayList<>();
    	FlourList.add(new Flour("Wheat Flour", 55, 0));
    	FlourList.add(new Flour("Rice Flour", 35, 0));
    	FlourList.add(new Flour("white Flour(Maida)", 45, 0));
    	FlourList.add(new Flour("Gram flour(Besan)", 80, 0));
    	System.out.println("Choose a Flour type:");
      System.out.println("\n0.wheat Flour\n1.RiceFlour \n2.white Flour(Maida)\n3.Gram Flour(Besan)");
    int choice3 = sc.nextInt();
    if (choice3 >= 0 && choice3 < FlourList.size()) {
        Grocery selectedFlour = FlourList.get(choice3);
        System.out.println(selectedFlour);
        System.out.println("===================================================");
        System.out.println("Choose Payment OPtion\n1.CreditCardNumber\n2.UPI Payment");
        int select =sc.nextInt();
        if(select==1) {
        	Payment p1 =new Payment();
        	p1.creditcard();
        }
        else {
        	Payment p2 =new Payment();
        	p2.upi();
        }
        }
    else {
        System.out.println("Invalid choice.");
    }
    System.out.println("Thank you for shopping at RMart!");
   break;
		case 5:
			List<Grocery> SpeciesList = new ArrayList<>();
	    	SpeciesList.add(new Species("Turmeric",5, 0));
	    	SpeciesList.add(new Species("Red Chilli Powder", 10, 0));
	    	SpeciesList.add(new Species("Salt", 10, 0));
	    	SpeciesList.add(new Species("Coriander Powder", 20, 0));
	    	SpeciesList.add(new Species("jeera", 10, 0));
	    	SpeciesList.add(new Species("Mustard", 10, 0));
	    	SpeciesList.add(new Species("Garam Masala", 20, 0));
	    	System.out.println("Choose a Species type:");
	      System.out.println("\n0.Turmeric\n1.Rice Chilli Powder \n2.Salt\n3.Coriander Powder\n4.jeera\n5.Mustard\n6.Garam masala");
	    int choice4 = sc.nextInt();
	    if (choice4 >= 0 && choice4 < SpeciesList.size()) {
	        Grocery selectedSpecies = SpeciesList.get(choice4);
	        System.out.println(selectedSpecies);
	        System.out.println("===================================================");
	        System.out.println("Choose Payment OPtion\n1.CreditCardNumber\n2.UPI Payment");
	        int select =sc.nextInt();
	        if(select==1) {
	        	Payment p1 =new Payment();
	        	p1.creditcard();
	        }
	        else {
	        	Payment p2 =new Payment();
	        	p2.upi();
	        }
	        }
	    else {
	        System.out.println("Invalid choice.");
	    }
	    System.out.println("Thank you for shopping at RMart!");
	   break;
		case 6:
			List<Grocery> BeveragesList = new ArrayList<>();
			BeveragesList.add(new Beverages("Mazza",35, 0));
			BeveragesList.add(new Beverages("Sting", 10, 0));
			BeveragesList.add(new Beverages("Fizz", 10, 0));
			BeveragesList.add(new Beverages("slice", 20, 0));
			BeveragesList.add(new Beverages("Smoodh", 10, 0));
			BeveragesList.add(new Beverages("thumbs up", 10, 0));
			BeveragesList.add(new Beverages("Coca Cola", 20, 0));
	    	System.out.println("Choose a Soft drink type:");
	      System.out.println("\n0.Mazza\n1.Sting \n2.Fizz\n3.Slice\n4.Smoodh\n5.Thumbsup\n6.Coca Cola");
	    int choice5 = sc.nextInt();
	    if (choice5 >= 0 && choice5 < BeveragesList.size()) {
	        Grocery selectedBeverages = BeveragesList.get(choice5);
	        System.out.println(selectedBeverages);
	        System.out.println("===================================================");
	        System.out.println("Choose Payment OPtion\n1.CreditCardNumber\n2.UPI Payment");
	        int select =sc.nextInt();
	        if(select==1) {
	        	Payment p1 =new Payment();
	        	p1.creditcard();
	        }
	        else {
	        	Payment p2 =new Payment();
	        	p2.upi();
	        }
	       }
	    else {
	        System.out.println("Invalid choice.");
	    }
	    System.out.println("Thank you for shopping at RMart!");
	   break;
		case 7:
			List<Grocery> oilList = new ArrayList<>();
			oilList.add(new EdibleOils("SunFloweroil",35, 0));
			oilList.add(new EdibleOils("GroundNutOil", 20, 0));
			oilList.add(new EdibleOils("CoconutOil", 38.6, 0));
			oilList.add(new EdibleOils("OliveOil", 20.8, 0));
			oilList.add(new EdibleOils("Soyabean Oil", 10, 0));
			oilList.add(new EdibleOils("MustardOil", 10, 0));
			oilList.add(new EdibleOils("Rice Bran Oil", 20, 0));
			oilList.add(new EdibleOils("Ghee", 20, 0));
			System.out.println("Choose a EdibleOil type:");
	      System.out.println("\n0.SunFlowerOil\n1.GroundNutoil \n2.CoconutOil\n3.OliveOil\n4.Soyabean Oil\n5.Mustard oil\n6.Rice Bran Oil\n7.ghee");
	    int choice6 = sc.nextInt();
	    if (choice6 >= 0 && choice6 < oilList.size()) {
	        Grocery selectedoils = oilList.get(choice6);
	        System.out.println(selectedoils);
	        System.out.println("===================================================");
	        System.out.println("Choose Payment OPtion\n1.CreditCardNumber\n2.UPI Payment");
	        int select =sc.nextInt();
	        if(select==1) {
	        	Payment p1 =new Payment();
	        	p1.creditcard();
	        }
	        else {
	        	Payment p2 =new Payment();
	        	p2.upi();
	        }
	        }
	    else {
	        System.out.println("Invalid choice.");
	    }
	    System.out.println("Thank you for shopping at RMart!");
	   break;
		case 8:
	   List<DairyProducts> dairy = new ArrayList<>();
       dairy.add(new DairyProducts("Milk", 27, 1));
       dairy.add(new DairyProducts("Curd",10, 0));
       dairy.add(new DairyProducts("Paneer", 40, 0));
       dairy.add(new DairyProducts("cheese", 40, 0));
       dairy.add(new DairyProducts("buttermilk", 15, 0));
       dairy.add(new DairyProducts("Shrikhand", 35, 0));
       
       System.out.println("Choose a category:");
       System.out.println("\n0.Milk\n1.Curd \n2.Paneer\n3.Cheese\n4.ButterMilk\n5.Shrikhand");
       

       int choice7 = sc.nextInt();
       if (choice7 >= 0 && choice7 < dairy.size()) {
           Grocery selectedDairy = dairy.get(choice7);
           System.out.println(selectedDairy);
           System.out.println("===================================================");
           System.out.println("Choose Payment OPtion\n1.CreditCardNumber\n2.UPI Payment");
           int select =sc.nextInt();
           if(select==1) {
           	Payment p1 =new Payment();
           	p1.creditcard();
           }
           else {
           	Payment p2 =new Payment();
           	p2.upi();
           }
          }
       else {
           System.out.println("Invalid choice.");
           
       }
	System.out.println("Thank you for shopping at RMart!");
     
	break;
		
			}
	   }
		 catch (Exception ie) {
			 System.out.println("Enter Only Options Given");
			 
	 }
		 finally {
			 System.out.println("ThankYou For Visiting RMart!!");
		 }

	

     }
}



     

     



