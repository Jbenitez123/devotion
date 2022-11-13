/**
* Name: Jervin Benitez
* Section: IT Dept - Devotion
* Year: 4th Year
*/

package benitez;
import java.util.Scanner;

public class Main{

  public static void main(String[]args) {
  
  Scanner ibutang = new Scanner(System.in);
  
  
  String orderCart = "Ang Imong Gipang Order kay: \n";
  int respondToOrder, orderCategory;
  float totalPayment = 0, customerCash;
 
  System.out.println("========DAYON KAMO SA TINDAHAN NI ONDONG! ======");
  System.out.println("|          MO PALIT KA? [1-YES, 2-NO]          |");
  System.out.println("|==============================================|");
  System.out.print  ("Choice:");
  respondToOrder = ibutang.nextInt(); 
  
  do {

  if (respondToOrder == 1) {
  
	  System.out.println("===========DAYON KAMO SA TINDAHAN NI ONDONG! =========");
	  System.out.println("|UNSA IMONG ORDERON? [1-PAGKAON, 2-ILIMNUN, 3-SNACKS]|");
	  System.out.println("|            ISUWAT KUNG UNSA IMONG PALITON          |");
	  System.out.println("|====================================================|");
	  System.out.print  ("Choice:");
	  orderCategory = ibutang.nextInt();
	  
	  if(orderCategory == 1) {
	    System.out.println("==========DAYON KAMO SA TINDAHAN NI ONDONG! ==========");
	    System.out.println("|****************AVAILABLE SA PAGKAON ***************|");
	    System.out.println("| [1] Unli-Chicken Wings + Unli-Rice : P399.00       |");
	    System.out.println("| [2] Unli-Pork Fat + Sisig          : P250.00       |");
	    System.out.println("| [3] Bangus Sisig + Unli-Rice       : P499.00       |");
	    System.out.println("|      I ENTER KUNG UNSAY IMONG PALITON    |");
	    System.out.println("======================================================");
	    System.out.print  ("Choice:");
	    float unliChicken = 399 , unliPork = 250, bangusSisig = 499;
	    int orderChoice = ibutang.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Unli-Chicken Wings + Unli-Rice: P399.00 added to cart");
		  totalPayment+=unliChicken;
		  String order1 = "Unli-Chicken Wings + Unli-Rice: P399.00 \n";
		  orderCart+=order1;
		  
		break;
		
		case 2: 
		  System.out.println("Unli-Pork Fat + Sisig P 250   : P250.00  added to cart");
		  totalPayment+=unliPork;
		  String order2 = "Unli-Pork Fat + Sisig          : P250.00  \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Bangus Sisig + Unli-Rice      : P499.00 added to cart");
		  totalPayment+=bangusSisig;
		  String order3 = "Bangus Sisig + Unli-Rice      : P499.00 \n";
		  orderCart+=order3;
		  
		break;
	      
	       default:
		 System.out.println("Ibutang lang ang naa sa choices sa babaw!");
		 
	       break;  
	      
	      }
	    

	  } else if(orderCategory == 2) {
	    System.out.println("========DAYON KAMO SA TINDAHAN NI ONDONG! ========");
	    System.out.println("|*************AVAILABLE SA ILUMNON****************|");
	    System.out.println("| [1] 1-Bucket of Red Horse Stallion : P500.00    |");
	    System.out.println("| [2] 1-Tower of Beer na Beer Pilsen : P350.00    |");
	    System.out.println("| [3] Kulafu Special for Cult Members: P150.00    |");
	    System.out.println("|         I ENTER KUNG UNSAY IMONG PALITON        |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float redhorse = 500 , bnbp = 350, kulafu = 150;
	    int orderChoice = ibutang.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("1-Bucket of Red Horse Stallion : P500.00 added to cart");
		  totalPayment+=redhorse;
		  String order1 = "1-Bucket of Red Horse Stallion : P500.00 \n";
		  orderCart+=order1;
		  
		  
		  
		  
		break;
		
		case 2: 
		  System.out.println("1-Tower of Beer na Beer Pilsen : P350.00 added to cart");
		  totalPayment+=bnbp;
		  String order2 = "1-Tower of Beer na Beer Pilsen : P350.00 \n";
		  orderCart+=order2;
		  
		  
		  
		break;
		
		case 3: 
		  System.out.println("Kulafu Special for Cult Members: P150.00  added to cart");
		  totalPayment+=kulafu;
		  String order3 = "Kulafu Special for Cult Members: P150.00 \n";
		  orderCart+=order3;
		  
		  
		break;
	      
	       default:
		 System.out.println("Ibutang lang ang naa sa choices sa babaw!");
	       break;  
	      
	      }
	    
	    
	    }
	    
	    else if(orderCategory == 3) {
	    System.out.println("========DAYON KAMO SA TINDAHAN NI ONDONG! =======");
	    System.out.println("|*********AVAILABLE SA SNACKS / PULUTAN**********|");
	    System.out.println("| [1] Chicken Skin in a plate       : P199.00    |");
	    System.out.println("| [2] Kropek Dragon Skin            : P220.00    |");
	    System.out.println("| [3] Kropek Vegatarian Special     : P179.00    |");
	    System.out.println("|         I ENTER KUNG UNSAY IMONG PALITON       |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float chickenSkin = 199 , kropekDragon = 220, kropekVeg = 179;
	    int orderChoice = ibutang.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Chicken Skin in a plate       : P199.00 added to cart");
		  totalPayment+=chickenSkin;
		  String order1 = "Chicken Skin in a plate       : P199.00 \n";
		  orderCart+=order1;
		break;
		
		case 2: 
		  System.out.println("Kropek Dragon Skin            : P220.00 added to cart");
		  totalPayment+=kropekDragon;
		  String order2 = "Kropek Dragon Skin            : P220.00 \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Kropek Vegatarian Special     : P179.00  added to cart");
		  totalPayment+=kropekVeg;
		   String order3 = "Kropek Vegatarian Special     : P179.00 \n";
		   orderCart+=order3;
		  
		  
		break;
	      
	       default:
		 System.out.println("Ibutang lang ang naa sa choices sa babaw!");
		 
	       break;  
	      
	      }
	    
	    }
   }
   
   else {
   
   System.out.println("Salamat ug Balik-balik kanunay!~ ??");
   System.exit(0);
   
   
   }
   
   
   
   
   System.out.println("MO ORDER PAKAG BALIK?");
   System.out.println("[1] - Yes");
   System.out.println("[2] - No");
   respondToOrder = ibutang.nextInt();
   
    
  } while(respondToOrder == 1);
  
    System.out.println("Imong Bayranan: "+totalPayment);
    System.out.print("Pila imong Ibayad: ");
    customerCash = ibutang.nextFloat();
  
    System.out.println("==========R E C E I P T ========");
    System.out.println(orderCart);
     System.out.printf("Tanan: %.2f\n",totalPayment);
    System.out.println("Sukli: " + (customerCash - totalPayment));
    System.out.println("================================");
     System.out.println("Salamat ug Balik-balik kanunay!");
  
  
  
  
  

  }


}