import java.util.Scanner;
public class Resturant {
  
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            String foodItems="";
            double totalBill=0;	
            
            
            
            System.out.println("         **********WELCOME*********        ");
            System.out.println("                    JAVA KA DHABA          ");
            System.out.println();
            System.out.println();
            
            //infinite loop for main menu
            for( ; ;)
            {
                System.out.println("MENU 1.VEG 2.NON-VEG 3.CHECKOUT 4.LOGOUT");
                System.out.println("Enter your option: ");
                int option=sc.nextInt();
                System.out.println();
                
                
                //this else if blocks for veg menu
                if(option==1)
                {
                    System.out.println("     ****VEG MENU*****    ");
                    
                    for(; ;){
                        System.out.println("1.PANNER TIKKA 2.KAJU CURRY 3.VEG-BIRYANI 4.VEG-KOFTA 5.MAIN MENU");
                        System.out.println();
                        System.out.println("Enter your Option: ");
                        int option1=sc.nextInt();
                        
                        if(option1==1)
                        {
                            foodItems+="Panner Tikka :250";
                            totalBill+=250;
                            System.out.println("Your order has been added to cart");
                        }
                        else if(option1==2)
                        {
                            foodItems+="Kaju Curry :280";
                            totalBill+=280;
                            System.out.println("Your order has been added to cart");
                        }
                        else if(option1==3)
                        {
                            foodItems+="Veg-Biryani :200";
                            totalBill+=200;
                            System.out.println("Your order has been added to cart");
                        }
                        else if(option1==4)
                        {
                            foodItems+="Veg Kofta :210";
                            totalBill+=210;
                            System.out.println("Your order has been added to cart");
                        }
                        else if(option1==5)
                        {
                            break;
                        }
                    }
                }
                
                
                
                else if(option==2){
                        
                    System.out.println("     ****VEG MENU*****    ");
                    
                    for(; ;){
                        System.out.println("1.BUTTER CHICKRN 2.CHICKEN MASALA 3.CHICKEN BIRYANI 4.FISH 5.MAIN MENU");
                        System.out.println();
                        System.out.println("Enter your Option: ");
                        int option1=sc.nextInt();
                        
                        if(option1==1)
                        {
                            foodItems+="BUTTER CHICKEN :250";
                            totalBill+=250;
                            System.out.println("Your order has been added to cart");
                        }
                        else if(option1==2)
                        {
                            foodItems+="CHICKEN MASALA :210";
                            totalBill+=210;
                            System.out.println("Your order has been added to cart");
                        }
                        else if(option1==3)
                        {
                            foodItems+="CHICKEN-BIRYANI :200";
                            totalBill+=200;
                            System.out.println("Your order has been added to cart");
                        }
                        else if(option1==4)
                        {
                            foodItems+="FISH :350";
                            totalBill+=210;
                            System.out.println("Your order has been added to cart");
                        }
                        else if(option1==5)
                        {
                            break;
                        }
                    }
                }		
                
            
              else if(option==3){
                  System.out.println("      ******* YOUR TOTAL BILL******   ");
                  System.out.println();
                  System.out.println("Your Purchase Items Below :");
                  System.out.println(foodItems);
                  System.out.println("Total Bill: " + totalBill+ "rs.");
                  
                  if(totalBill>=2000){
                      System.out.println("You got as discount 20%");
                      System.out.println("Total bill is:" + (totalBill-((totalBill/100)*20)));
                  }
                  else if(totalBill>=1000){
                       System.out.println("You got as discount 10%");
                       System.out.println("Total bill is:" + (totalBill-((totalBill/100)*10)));
                  }
                  else if(totalBill>=500){
                       System.out.println("You got as discount 5%");
                       System.out.println("Total bill is:" + (totalBill-((totalBill/100)*5)));
                  }
    
              }
              else if(option==4){
                  System.out.println("THANK YOU VISIT AGAIN");
                  break;
              }
    
        }
    }
    }
    

