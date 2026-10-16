import java.util.Scanner;

class j1{
public static void m1(){
	System.out.println("I am Akash");
}

public static int m2(){
	return 25;
}

/*
public static int m3(int b,String a){
	String a = "babdu";
	return b;
} */

//Method calling with one parameters
public static void x(String name){
	System.out.println("Hello,My name is: " + name);
}

public static void y(int age){
	System.out.println("I am " + age + " years old");
	//return age;
}
public static void c(String Dept,int year){
	System.out.println("I am currently in " + year + " year of " + Dept + " Department");
}

public static void main(String[] args){
	m1();
	System.out.println(m2());
	//System.out.println(m3(29));
	x("Akash");
	y(21);
	c("Computer",2);
	
}
}

