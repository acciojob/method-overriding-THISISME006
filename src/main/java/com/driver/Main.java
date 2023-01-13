package com.driver;

public class Main {
  B objB = new B();
  System.out.print(objB.meth());
}
class A{
    public static String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    public static String meth(){
        return "Method is overridden in Extendend class B";
    }
}