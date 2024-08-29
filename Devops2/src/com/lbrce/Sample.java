package com.lbrce;

public class Sample {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void subtract(int a,int b) {
		System.out.println(a-b);
	}
	public static void main(String args[]) {
		int a=10;
		int b=20;
		Sample s=new Sample();
		s.add(a, b);
		s.subtract(a, b);
	}

}
 class Sample2 {
	public void multiplication(int a,int b) {
		System.out.println(a*b);
	}
	public void subtract(int a,int b) {
		System.out.println(a-b);
	}
	public static void main(String args[]) {
		int a=100;
		int b=20;
		Sample2 s=new Sample2();
		s.multiplication(a, b);
		s.subtract(a, b);
	}

}
