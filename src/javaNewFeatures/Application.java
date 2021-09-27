package javaNewFeatures;

import java.util.Scanner;

import javaNewFeatures.interfaces.NameInterface;
import javaNewFeatures.model.Call;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        //class extends an interface sayName Method() implemented without lamda Java8
        Call call  = new Call();
        System.out.println(call.sayName("George"));
        //Using Java 8 Lambda expression
        NameInterface nameInterface = ("George") -> {
        	return "George";
        	};
        System.out.println(nameInterface.sayName("George"));
        
	}

}
