package javaNewFeatures;

import java.util.Scanner;

import javaNewFeatures.interfaces.NameInterface;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        //Using Java 8 Lambda expression
        NameInterface nameInterface = () -> {
            return "This is a call from lambda expression";
        };
        System.out.println(nameInterface.sayName());
        Runnable runnable = () -> {
            System.out.println("This is the runnable thread using lambda");
        };
        runnable.run();
	}


}
