//Switch case example
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Enter a value : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        switch(n){
//            case 1 -> System.out.println("number value is - 1");
//            case 2 -> System.out.println("number value is - 2");
//            case 3 -> System.out.println("number value is - 3");
//        };
//    }
//}

//***************************************************************************

//Switch case alternate way
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Enter a value : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String result = switch (n) {
//            case 1 -> "number value is - 1";
//            case 2 -> "number value is - 2";
//            case 3 -> "number value is - 3";
//            default -> "Invalid input";
//        };
//        System.out.println(result);
//    }
//}
//we can use colon instead of arrow in case statement, but we have to use "yield" keyword there
//e.g. case 1 : yield "number value is - 1";

//***************************************************************************

//Ternary operator
//import java.util.Scanner;
//public class Main {
//    public static void main(String [] args){
//        System.out.println("Enter a value : ");
//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        String result = (n>0) ? "Number is positive" : "Number is negative";//we used ternary operator here instead of if else
//        System.out.println(result);
//    }
//}

//***************************************************************************


//Object/ instance creation
//class Calculator{
//    public int add(int a, int b){
//        return a+b;
//    }
//}
//public class Main{
//    public static void main (String [] args){
//        Calculator c = new Calculator();//here we are creating an object.
//        int result = c.add(2,3);
//        System.out.println(result);
//    }
//}

//***************************************************************************


//Method overloading-----> same method name but different type of parameters or different number of parameters
//class Calculator{
//    public int add(int a, int b){
//        return a+b;
//    }
//    public int add(int a, int b, int c){
//        return a+b+c;
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        Calculator c = new Calculator();
//        int result1 =  c.add(3,5);
//        int result2 =  c.add(3,5,7);
//System.out.println(result1+" and "+result2);
//    }
//}

//***************************************************************************


//Creating multidimensional array
//class Main{
//    public static void main(String[]args){
//        int[][] num = new int[3][4];
//
//        for(int i=0; i<3; i++){
//            for(int j=0; j<4; j++){
//                num[i][j] = (int)(Math.random()*10);
//            }
//        }
//        for(int i=0; i<3; i++){
//            for(int j=0; j<4; j++){
//                System.out.print(num[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//***************************************************************************

// Advanced for loop/ forEach loop
//class Main{
//    public static void main(String[]args){
//        int[] array = {3,4,2,6,5,8,7,5};
//        for(int n : array){
//            System.out.println(n);
//        }
//    }
//}

//***************************************************************************

//non-static variable
//non-static variable can not be called inside static methods.
//class Mobile{
//    String name = "iphone";//non static variable
//}
//public class Main{
//    public static void main(String[]args){
//        Mobile m = new Mobile();//here we created an object of class
//        System.out.println( m.name);
//    }
//}
//Static variable
//If variable declared as static we don't need to create object of a class.
//static variable can be called with class name instead
//static variable can be called inside non-static methods.
//class Mobile{
//   static String name = "iphone";//static variable
//}
//public class Main{
//    public static void main(String[]args){
//        System.out.println(Mobile.name);
//    }
//}

//***************************************************************************

//non-static method
//class Animal{
//    public void Dog(){
//        System.out.println("Dog inside non-static method");
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        Animal a = new Animal();
//        a.Dog();
//    }
//}

//static method
//class Animal{
//    public static void Dog(){
//        System.out.println("Dog inside static method");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Animal.Dog();
//    }
//}

//main method is always static because we can access it without creating an object of its class.
//main method is a start of execution so we can not create an object of its class, so we make it static.
//static block can be called only once. static block called always first, even before constructor.

//***************************************************************************

//Encapsulation
//in encapsulation we make data variables private so that they can be accessible in that class only.
//If we want to access those in different class, we have to create method with implementation of those variables
// and then we can call those methods in different class.

//class Person{
//    private String name = "Ram";//private variable
//
//    public String getName(){//getter
//        return name;
//    }
//    public void setName(String nam){//setter
//        this.name=name;        //this keyword represents variable of current class.
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        Person p = new Person();
//        System.out.println( p.getName());//calling method from another class
//    }
//}

//***************************************************************************

//Constructor
//it's a special method with same name as that of its class.
//it is called while object creation.
//It can be without parameters or with parameters.
//every time we create an object, default constructor will be created/called even if we don't create constructor.

//class Person{
//    private int age;
//    private String name;
//
//    public Person(){//default constructor
//        age = 25;
//        name = "Ram";
//    }
//    public Person(int age, String name){//parameterised constructor
//        this.age=age;
//        this.name=name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public String getName(){
//        return name;
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        Person p1 = new Person();//calling default constructor//creating object
//        Person p2 = new Person(30, "Shyam");//calling parameterised constructor
//        System.out.println(p1.getAge()+" : "+p1.getName());
//        System.out.println(p2.getAge()+" : "+p2.getName());
//    }
//}

//***************************************************************************

//Anonymous object
//an object which does not have any name called anonymous object.

//class Person{
//    public Person(){
//        System.out.println("inside constructor");
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        new Person();//this object don't have any reference/name, so it's anonymous.
//        // calling default constructor and will print - "inside constructor"
//    }
//}

//***************************************************************************

//Inheritance
//if one class uses properties of another class/parent class. it is called inheritance.
//(Child class/Sub class/Derived class) uses properties of (Parent class/Super class/Base class)

//class Person{
//   int age = 25;
//   String name = "Ram";
//}
//class Man extends Person{// here Man class uses properties of parent class Person.
//    String color = "Fair";
//    public void features(){
//        System.out.println(age+" : "+name+" : "+color);
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        Man m = new Man();
//        m.features();
//    }
//}
//
//Multiple inheritance is not possible in Java.
//one class can not extend two classes.(class c extends A,B)
//if class A and class B have same method, and if we want to class that method in class c then,
// there will be confusion that from which class c will take that method. This is called ambiguity.

//***************************************************************************

//Super
//class A {
//    public A() {
//        System.out.println("in constructor A");
//    }
//    public A(int n){
//        System.out.println("in parameterised constructor of A");
//    }
//}
//class B extends A {
//  public B(){
//      System.out.println("in default constructor of B");
//  }
//    public B(int n) {
//      //this();//here this will call default constructor of same class.
//        super(n); // this super will call constructor from parent class A.
//        //if we do not pass 'n' parameter to super method, it will call default constructor from super/parent class.
//        System.out.println("in parameterised constructor of B");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        B b = new B(5);//parametrised constructor from classB will be called here.
//    }
//}

//***************************************************************************

//Method overriding
//same method name with same parameters.
//class A{
//    public void show(){
//        System.out.println("in show method of class A");
//    }
//}
//class B extends A{
//    @Override
//    public void show(){//this show method overrides sho method from parent class.
//        System.out.println("in show method of class B");
//    }
//}
//public class Main{
//    public static void main(String[]ars){
//        B b = new B();
//        b.show();
//    }
//}

//***************************************************************************

//Access modifiers
//Public -->> Can be accessed anywhere, outside package, class.
//Private -->> Can be accessed in same class only.
//Protected -->> Can be accessed in same package. Can be accessed in different package using subclass.
//Default -->> Can be accessed in same package.

//***************************************************************************

//Polymorphism
//Same method name but different implementation.
//Compile time polymorphism(Early binding)--Overloading--same method name, different parameters.
//Run time polymorphism(Late binding)--Overriding--Same method name, same parameters.

//Dynamic method dispatch.//run time polymorphism.
//class A{
//    public void show(){
//        System.out.println("inside class A");
//    }
//}
//class B extends A{
//    public void show(){
//        System.out.println("inside class B");
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        A obj = new A();//creating object of parent class.
//        obj.show();//output--inside class A
//
//        obj = new B();//(A obj = new B();//creating object of child class with reference to parent class.
//        obj.show();//output--inside class B
//    }
//}

//***************************************************************************

//Final keyword
//Final - variable --->> Variable declared with final keyword, value of it can not be changed.
//final int n = 8;

//final - method --->> final method can not be overriden.
//public final void show(); -->this method can not be overriden.

//final - class ---> no class can extends to final class.
//final class A -- this class can not be inherited/extended by other class.

//***************************************************************************

//Upcasting and Downcasting
//class A{
//    public void show(){
//        System.out.println("inside class A");
//    }
//}
//class B extends A{
//    public void show(){
//        System.out.println("inside class B");
//    }
//}
//public class Main{
//    public static void main(String[]args){
////        A obj = new A();
////        obj.show();//inside class A
////        B obj = new B();
////        obj.show();//inside class B
////        A obj = new B();//Upcasting--//creating object of child class with reference to parent class.
////        obj.show();//output--inside class B
//
//        A obj1 = new B();
//        B obj2 = (B) obj1;//downcasting
//        obj2.show();//inside class B
//    }
//}

//***************************************************************************

//Wrapper classes
//int -->Integer
//char -->Character
//double -->Double
//boxing --> converting premative values into its respective object--eg--int to Integer
//unboxing --> object type to premative type

//public class Main{
//    public static void main(String[]args){
//        int n1 = 5;
//        Integer i = n1;//autoboxing
//        int n2 = i.intValue();//unboxing
//        int n3 = i;//auto-unboxing
//        System.out.println(i);
//        System.out.println(n2);
//    }
//}

//***************************************************************************

//abstract keyword
//abstract method --> a method which has only a declaration and no implementation.
//abstract method can only be declared inside abstract class.
//we can not create object of abstract class.
//abstract method must be implemented in child class.
//abstract method must be declared inside abstract class,
// but not necessary that abstract class should have abstract method.
//abstract class can have non-abstract as well as abstract methods.

//abstract class Car{//abstract class
//    public abstract void drive();//abstract method--no implementation--no body
//    public void playMusic(){
//        System.out.println("Playing music..");
//    }
//}
//class Tata extends Car{//concrete class
//    public void drive(){//implementing abstract method here from parent class.
//        System.out.println("Driving car..");
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        //Car c = new Car();//can not create this object
//        Car c = new Tata();
//        c.drive();//will call drive method from class Tata
//        c.playMusic();//will call playMusic method from class Car
//    }
//}

//***************************************************************************

//inner class --> a class inside a class.

//class A{
//    public void show(){
//        System.out.println("inside class A");
//    }
//    class B{//inner class
//        public void innerShow(){
//            System.out.println("inside inner class B");
//        }
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        A obj1 = new A();//normal method to create an object
//        obj1.show();//inside class A
//
//        A.B obj2 = obj1.new B();//creating object for inner class
//        //A.B obj2 = new A.B();//if we make inner clas static--(static class B)
//        obj2.innerShow();//inside inner class
//    }
//}

// anonymous inner class---> an inner class without name
//class A{
//    public void show(){
//        System.out.println("inside class A");
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        A obj1 = new A()
//        {//this block is an inner class inside Main class without name--anonymous inner class
//          public void show(){//this method will override show method in class A.
//              System.out.println("inside Main class");
//          }
//        };
//        obj1.show();
//    }
//}

//If we want to call abstract method from abstract class, we can directly call by creating anonymous class
//as shown in above example.

//***************************************************************************

//Interfaces
//interface will have only abstract methods.
//in interface all methods will be "public abstract" by-default.
//all variables inside interface are by-default "final and static".
//So if there is a case where we have all methods abstract in abstract class, we can use interface.
//interfaces are basically abstract classes with all methods as abstract.
//instead of "extends" keyword, we have "implements" in interfaces.

//interface A{//abstract class A
//    void show();//by default public abstract--pubic abstract void show();
//    void play();
//}
//class B implements A{//class B extends A
//    @Override
//    public void show() {
//        System.out.println("show inside class B");
//    }
//    @Override
//    public void play() {
//        System.out.println("show inside class B");
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        B obj = new B();
//        obj.show();
//        obj.play();
//    }
//}

//multiple inheritance is possible with interfaces

//interface A{
//    void show();
//}
//interface B{
//    void play();
//}
//
//class C implements A,B{
//    @Override
//    public void show() {
//        System.out.println("show in class C");
//    }
//
//    @Override
//    public void play() {
//        System.out.println("play in class C");
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        C obj = new C();
//        obj.show();
//        obj.play();
//    }
//}

//interface can be inherite with interfaces//
//interface A
//interface B extends A

//class - class --->extends
//class - interface --->implements
//interface - interface --->extends

//***************************************************************************

//Enum in Java
//to use named constants we can use enum.

//enum Status{
//    Started, Running, Failed, Pending, Success;
//}
//public class Main{
//    public static void main(String[]args){
//        Status s = Status.Running;
//        System.out.println(s);//Running
//
//        Status s1 = Status.Failed;
//        System.out.println(s1);//Failed
//        System.out.println(s1.ordinal());//2---it will print index
//
//        Status [] s2 = Status.values();
//        for (Status items : s2){
//            System.out.println(items);//will print all enum values.
//        }
//    }
//}

//***************************************************************************

//Java 8 features
//Functional interface
//Lambda expression
//Stream API
//Method references
//Default methods

//Functional interface - an interface which has only one method and that s also abstract.
//@FunctionalInterface
//interface A{//this interface will have only one method. otherwise it will throw an error.
//    void show();
//}
//class B implements A{
//    public void show(){
//        System.out.println("show in class B");
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        A obj = new B();
//        obj.show();
//    }
//}

//Lambda expression -> it will only work with functional interfaces.
//in below example we will use lambda expression with anonymous class instead of class B.
//@FunctionalInterface
//interface A{
//    void show();
//}
//public class Main{
//    public static void main(String[]args){
////        A obj = new A(){
////            public void show(){
////                System.out.println("in main method");
////            }
////        };
////        A obj = () -> {
////            System.out.println("in main method");
////        };
//        A obj = () -> System.out.println("in main method");
//        obj.show();
//    }
//}

//Lambda expression with return
//@FunctionalInterface
//interface A{
//    int add(int i, int j);
//}
//public class Main{
//    public static void main(String[]args){
////       A obj = new A(){
////           public int add(int i, int j){
////               return i+j;
////           };
////       };
//        A obj = (i,j) -> i+j;//if it's a single return statement, return keyword can not be written.
//        System.out.println(obj.add(3,4));
//    }
//}

//***************************************************************************

//Types of interfaces
//Normal interface -- > An interface which has two or more abstract methods.
//Functional interface(SAM- Single Abstract Method) --> An interface with only one method(abstract).
//Marker interface --> Interface which has no methods.

//***************************************************************************

//Exception in Java

//public class Main{
//    public static void main(String[]args){
//        int i = 0;
//        int j = 0;
//        try{
//            j = 8/i;//if we don't handle this arithmetic exception, program will not execute after this step.
//        }
//        catch(Exception e){//this block will execute only in case of exception/error in try block
//            System.out.println("Something went wrong");
//        }
//        System.out.println(j);
//        System.out.println("outside try-catch");
//    }
//}

//Exception with many catch blocks
//public class Main{
//    public static void main(String[]args){
//        int i = 2;//if we make i=0, arithmetic exception block will execute.
//        int j = 0;
//        int array [] = new int[5];
//        try{//this block checks statements statement by statement.
//            j = 8/i;
//            System.out.println(array[6]);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Can not divide by zero");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("trying to fetch array element beyond limit");
//        }
//        catch(Exception e){//this parent exception should be at bottom, otherwise other catch bocks will not execute.
//            System.out.println("Something went wrong..");
//        }
//        System.out.println("bye..");
//    }
//}

//Exception hierarchy
//object-->Throwable-->(Error or Exception)
//Exception-->RuntimeException(unchecked exception)-->(Arithmetic/ArrayIndexOutOfBound/NullPoint exception)

//throw keyword -->used to throw exception, written with try block.

//Custom exception
//class RamException extends Exception{
//    public RamException(String str){
//        super(str);
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        int i = 20;
//        int j = 0;
//
//        try{
//            j = 18/i;//it will print 0
//            if (j==0)
//                throw new RamException("I dont want to print zero");
//        }
//        catch(RamException e){
//            j = 18/1;
//            System.out.println("this is required output " +e);
//        }
//    }
//}

//throws keyword -- suppose there are two methods d() and e() in which there may be an exception.
//instead of handling exception in those particular methods, we will handle it in another method c().
//we can implement try catch in method c(). But we have to write d() throws Exception and e() throws Exception.

//class A{
//    public void show()throws ClassNotFoundException{
//        Class.forName("Test");//it will search for class with name "Test". if not found will throw
//        //an exception - ClassNotFound Exception. to handle this we wrote throws statement.
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        A obj = new A();
//       try{//to handle exception thrown in class A, we have to write try catch block here.
//           obj.show();
//       } catch (ClassNotFoundException e) {
//           e.printStackTrace();
//       }
//    }
//}

//finally keyword -- irrespective of try block throws exception or not, finally block always executed.

//public class Main{
//    public static void main(String[]ags){
//        int i = 0;
//        int j = 0;
//
//        try{
//            j = 18/i;
//        }
//        catch(Exception e){
//            System.out.println("Something went wrong");
//        }
//        finally{//this block always execute even if there is exception or not.
//            System.out.println("bye...");
//        }
//    }
//}

//try with resources --- object declared with try--try(object declaration){exception code}

//***************************************************************************

//User input using Scanner

//import java.util.Scanner;
//public class Main{
//    public static void main(String[]args){
//
//        System.out.println("Enter a number : ");
//        Scanner sc = new Scanner(System.in);
//        int n  = sc.nextInt();
//
//        System.out.println("Enter a name : ");
//        Scanner sc1 = new Scanner(System.in);
//        String name = sc1.nextLine();
//
//        System.out.println(n+ " : "+name);
//    }
//}

//***************************************************************************

//Threads
//dividing a code into small blocks/threads running at same time.

//class A extends Thread{
//    public void run(){//this method name should be run() so that from main method start will call it.
//        for (int i = 1; i<=10; i++){
//            System.out.println("inside class A");
//        }
//    }
//}
//class B extends Thread{
//    public void run(){//this method name should be run() so that from main method start will call it.
//        for (int i = 1; i<=10; i++){
//            System.out.println("inside class B");
//        }
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        A obj1 = new A();
//        B obj2 = new B();
//
//        obj1.start();//these start methods call run() method from classes, and run parallely.
//        obj2.start();
//    }
//}

//Thread priority
//how to print alternate output for different threads--

//class A extends Thread{
//    public void run(){
//        for (int i = 1; i<=10; i++){
//            System.out.println("inside class A");
//            try{
//                Thread.sleep(10);//this will stop this thread to execute for 10ms.
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class B extends Thread{
//    public void run(){
//        for (int i = 1; i<=10; i++){
//            System.out.println("inside class B");
//            try{
//                Thread.sleep(10);//this will stop this thread to execute for 10ms.
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        A obj1 = new A();
//        B obj2 = new B();
//
//        obj1.start();//these start methods call run() method from classes, and run parallely.
//        obj2.start();
//    }
//}

//Runnable vs Thread
//Thread is a class which implements interface Runnable in which there is a run() method.
//In above example we can implement Runnable instead of extending Thread.
//class A implements Runnable{
//    public void run(){
//        for (int i = 1; i<=10; i++){
//            System.out.println("inside class A");
//            try{
//                Thread.sleep(10);//this will stop this thread to execute for 10ms.
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class B implements Runnable{
//    public void run(){
//        for (int i = 1; i<=10; i++){
//            System.out.println("inside class B");
//            try{
//                Thread.sleep(10);//this will stop this thread to execute for 10ms.
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        Runnable obj1 = new A();
//        Runnable obj2 = new B();
//
//        Thread t1 = new Thread(obj1);//Runnable interface does not have start method so we have to create Thread objects
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();
//    }
//}

//synchronized
//If we have a method implemented with number of threads, and if we declare a method without synchronized, it will be
//called parellelly and different threads will try to mutate same method at same time(race condition), this will result
//in unexpected result. If we want to access the method with different threads, we should make it synchronized.

//public synchronized void methodName(){};

//Thread states
//new, Runnable, Running, waiting, dead..

//***************************************************************************

//Collection API
//Collection -- interfaces
//Collections -- Classes

//ArrayList***
//List can support duplicate values.

//import java.util.ArrayList;
//import java.util.List;
//
//public class Main{
//    public static void main(String[]args){
//        List<Integer> al = new ArrayList<Integer>();//collection works with objects.we should mention object type.
//        al.add(6);
//        al.add(2);
//        al.add(9);
//        al.add(6);
//        System.out.println(al);//printing list elements.//[6,2,9,6]
//        System.out.println(al.get(1));//we are getting number at index 2.
//    }
//}

//Set in Java***
//Set supports unique values only.

//import java.util.Iterator;
//import java.util.Set;
//import java.util.HashSet;
//public class Main{
//    public static void main(String[]args){
//        Set <Integer> s = new HashSet<Integer>();
//        s.add(6);
//        s.add(4);
//        s.add(2);
//        s.add(9);
//        s.add(9);
//        s.add(6);
//        System.out.println(s);//printing unique values.//[2,4,6,9];
//        //if we want to print sorted values, we can use TreeSet instead of HashSet.
//        Iterator<Integer> values = s.iterator();//we can use Iterator interface to print values.
//        while (values.hasNext()){
//            System.out.println(values.next());
//        }
////        for (Integer integer : s) {//enhanced for loop--alternate
////            System.out.println(integer);
////        }
//    }
//}


//Map in Java***
//Map do not extend to Collection interface
//In list or set, we work with indexes, but in Map we can have actual names for indexes.
//Map works with "key : value" concept.
//Map is collection of key and value pairs.
//Map itself is an interface. //public interface Map<K,V>{}

//import java.util.Map;
//public class Main{
//    public static void main(String[]args){
//        Map <String,Integer> students= new HashMap<>();
//        students.put("Ram", 86);
//        students.put("Siya", 97);
//        students.put("Luv", 65);
//        students.put("Kush", 78);
//        //students.put("Luv", 81);//this will replace previous value for Luv. and not get added as duplicate.
//        System.out.println(students);//{Siya=97, Luv=65, Kush=78, Ram=86}
//        System.out.println(students.get("Siya"));//97
//
//        for (String name : students.keySet()){
//            System.out.println(name+" : "+students.get(name));
//        }
//
//    }
//}

//sorting list
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.ArrayList;
//public class Main{
//    public static void main(String[]args){
////        List<Integer> numbers = new ArrayList<>();
////        numbers.add(63);
////        numbers.add(36);
////        numbers.add(84);
////        numbers.add(41);
////        Collections.sort(numbers);
////        System.out.println(numbers);//[36, 41, 63, 84]
//
//        //sorting based on last digit in numbers
//        Comparator <Integer> c  = new Comparator<Integer>() {
//            public int compare(Integer i, Integer j) {
//                if(i%10 > j%10)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(63);
//        numbers.add(36);
//        numbers.add(84);
//        numbers.add(41);
//        Collections.sort(numbers,c);
//        System.out.println(numbers);//[41, 63, 84, 36]
//    }
//}

//Sort a String list using Comparator based on string length.

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Main{
//    public static void main(String[]args){
//        List<String> fruits = new ArrayList<>();
//
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("kiwi");
//        fruits.add("grapefruit");
//        fruits.add("fig");
//
//        System.out.println(fruits);//[apple, banana, kiwi, grapefruit, fig]
//
//        Comparator<String> c = new Comparator<String>() {
//            public int compare(String s1, String s2) {
//                return Integer.compare(s1.length(), s2.length());
//            }
//        };
//        Collections.sort(fruits,c);
//        System.out.println(fruits);//[fig, kiwi, apple, banana, grapefruit]
//        for (String f : fruits){
//            System.out.print(f+",");//fig,kiwi,apple,banana,grapefruit,
//        }
//    }
//}


//Comparable ---> uses compareTo() method.
//example :
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//class Student implements Comparable<Student>{
//    int age;
//    String name;
//
//    public Student(int age, String name){
//        this.age = age;
//        this.name = name;
//    }
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//    @Override
//    public int compareTo(Student newStud) {
//        if(this.age>newStud.age)
//            return 1;
//        else
//            return -1;
//    }
//}
//public class Main{
//    public static void main(String[]args){
//        List<Student> sList = new ArrayList<>();
//        sList.add(new Student(32,"Ram"));
//        sList.add(new Student(26,"Siya"));
//        sList.add(new Student(7,"Luv"));
//        sList.add(new Student(15,"Kush"));
//
//        Collections.sort(sList);
//        System.out.println(sList);//[Student{age=7, name='Luv'}, Student{age=15, name='Kush'}, Student{age=26, name='Siya'}, Student{age=32, name='Ram'}]
//    }
//}

//***************************************************************************

//Stream API
//it will not affect original list.
//It can be used only once.
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(4, 2, 8, 3, 5, 9, 7); // alternate way to add list items.
//        List<Integer> result = numbers.stream()
//                .filter(n -> n % 2 == 0) // filter even numbers
//                .map(n -> n * 2)        // double the even numbers
//                .collect(Collectors.toList()); // collect results into a list
//        System.out.println(result); // [8, 4, 16]
//    }
//}

//***************************************************************************