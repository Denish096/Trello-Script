package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoreAndUseDataInsideSameClass {
	@Test(dataProvider ="DataForFacebook")
	
	public void FacebookSignUp(String Firstname, String Surname , String email ,String password, String Day, String Month,String Year,String Gender ,String URL ) {
		System.out.println("My name is :"+ Firstname);
		System.out.println("My Surname is :"+ Surname);
		System.out.println("My email is :"+ email);
		System.out.println("My password is :"+password);
		System.out.println("My DOB is :"+ Day + "-"+Month+"-"+Year);
		System.out.println("My gender is :"+ Gender);
		System.out.println("facebook URL :"+ URL);
	}
//	we are creating 2d array to store Data. 
//	and return type of array should be 2D array.
@DataProvider
	public Object[][] DataForFacebook(){
			Object obj[][] = new Object[2][9];
			obj[0][0]="sai";
			obj[0][1]="pallavi";
			obj[0][2]="SaiPallavi@gmail.com";
			obj[0][3]="sai@12313";
			obj[0][4]="12";
			obj[0][5]="May";
			obj[0][6]="1992";
			obj[0][7]="Female";
			obj[0][8]="https://www.facebook.com/signup";
			
			obj[1][0]="Vikram";
			obj[1][1]="Batra";
			obj[1][2]="KargilHero@gmail.com";
			obj[1][3]="TigerHillConquerer@1";
			obj[1][4]="9";
			obj[1][5]="Sep";
			obj[1][6]="1974";
			obj[1][7]="Male";
			obj[1][8]="https://www.facebook.com/signup";
			return obj;
	}
}
