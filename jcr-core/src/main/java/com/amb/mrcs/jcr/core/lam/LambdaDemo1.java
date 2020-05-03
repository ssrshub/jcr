package com.amb.mrcs.jcr.core.lam;

public class LambdaDemo1 {

	public static void main(String[] args) {
			
		MyNumber myNum;
		myNum = () -> 123.45;
		System.out.println("hashCode : " + myNum.hashCode() + ", value: " + myNum.getValue());
		
		myNum = () -> Math.random() * 100;
		System.out.println("hashCode : " + myNum.hashCode() + ", Random value: " + myNum.getValue());
		System.out.println("hashCode : " + myNum.hashCode() + ", Another random value: " + myNum.getValue());
		
		//myNum = () -> "123.12";
		
	}

}
