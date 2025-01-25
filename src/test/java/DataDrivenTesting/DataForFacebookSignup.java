package DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class DataForFacebookSignup {
	
	@DataProvider  // we use to give @where we use to store data in method
	public Object[][] data() {
		
		Object obj[][] = new Object [2][9];
		obj[0][0]="sai";
		obj[0][1]="pallavi";
		obj[0][2]="SaiPallavi@gmail.com";
		obj[0][3]="sai@12313";
		obj[0][4]="9";
		obj[0][5]="Sep";
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
//		for (int i = 0; i < obj.length; i++) {
//			System.out.println(obj[i]);	
//		}
		return obj;
	}
}
