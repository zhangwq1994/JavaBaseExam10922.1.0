package com.hand;

public class App 
{
    public static void main( String[] args ){
    	int n[] = new int[100];
    	for(int i=0;i<=99;i++)
    		n[i] = i+101;
    	test(n);
    }

	private static void test(int[] b) {
	    String s = "";
		int count = 0;
		int sum = 0;
		for(int i=0;i<b.length;i++){
			for(int j=1;j<=b[i];j++){
				if(b[i]%j==0){
					count++;
				}
			}
			if(count==2){
				s +=b[i]+",";
				sum++;
			}
				count = 0;
		}
		System.out.println("101-200 间总共有"+sum+"个素数，分别是：");
		System.out.println(s);
	}
}