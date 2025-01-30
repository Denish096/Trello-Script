package test;

public class conditional_oprators {
public static void main(String[] args) {
	int a= 500   , b=  2  , c=8000   , d=4  ;
	int e= a>b ? a:b;//2
	int f= c>d ? c:d;//4
	int max= e>f ? e:f;
	System.out.println(max);
	//////////////////////////////
	int h=8 ,  i=500 ,  j=30;
	int k= h>i?i:h;//5
	int min= k>j?j:k;
	System.out.println(min);
}
}
