package test;

public class happy_no {
public static void main(String[] args) {
	int n=100;
for(int i=1;i<=n;i++) {
	boolean c=squareofdigit(i);
	if(c==true) {
	System.out.println(i+"no is happy");}}}
	public static boolean squareofdigit(int n) {
	
	while(n>9) {
	 n=singledigit(n);}
		return n==1||n==7;
}
private static int singledigit(int n) {
	int sum=0;
	while (n>0) {
		int d=n%10;
		sum=sum+d*d;
		n=n/10;
	}

	return sum;

}}
