//If any class wnat to take a propertis of any another class they can take there propertis using Inheritance 
//Inheritance have three type i)single Level ii)Multiple Level iii)Hybrid iv)Hierarchial
class Shape{
    String color;
}
class Triangle extends Shape{
    
}
public class Inheritans{
    public static void main(String args[])
    {
        Triangle call = new Triangle();
        call.color="Red";
        System.out.print(call.color);
    }
}