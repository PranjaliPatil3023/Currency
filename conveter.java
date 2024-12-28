import java.util.Scanner;
public class conveter {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*******Currency Convertor******");
		System.out.println("KNOW YOUR CURRENCY RATE ");
		System.out.println();
		
		System.out.println("Currency - 1.USD 2.EUR 3.KWD 4.GBP 5.MNT 6.AUD 7.MXN 8.PKR");
		System.out.println("Enter the amount in INR: ");
		float inr=sc.nextFloat();
		
		System.out.println("Enter the currency: ");
		String curr=sc.next().toUpperCase();
		
		switch(curr){
			case "USD":
				   float usd =inr/83.8152f;
			       System.out.println("INR : " + inr + "INR = USD :" + usd + "USD");
				break;
			
			case "EUR":
				   float eur =inr/93.6494f;
			       System.out.println("INR : " + inr + "INR = EUR :" + eur + "EUR");
				   break;
			
			case "KWD":
				   float kwd =inr/273.548f;
			       System.out.println("INR : " + inr + "INR = KWD :" + kwd + "KWD");
				   break;
			
			case "GBP":
				  float gbp =inr/110.771f;
			      System.out.println("INR : " + inr + "INR = GBP :" + gbp + "GBP");
				  break;
			
			case "MNT":
				   float mnt=inr/93.9422f;
			       System.out.println("INR :" + inr + "INR = MNT :" + mnt + "MNT");
			       break;
				   
		    case "AUD":
				   float aud=inr/56.9375f;
			       System.out.println("INR: " + inr + "INR =AUD :" + aud + "AUD");
				   break;
				   
		    case "MXN":
				    float mxn=inr/4.38605f;
			        System.out.println("INR: "+ inr + "INR = MXN :" + mxn + "MXN");
					
		    case "PRK":
				    float prk=inr/0.300832f;
			        System.out.println("INR: "+ inr + "INR = PRK :" + prk + "PRK");
					
			default:
				    System.out.println("Wrong Currency Entered");
		}
				
	}
}


