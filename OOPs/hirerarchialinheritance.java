//Hierarchial Inheritance 
//Hierarchial Inheritance mens one base class and multiple derived(child) classes.
class Subject  // Subject + Total + Display + MultiLevelInheritance            Base class
{              //Parent   + Big Child + Child  + Public Class                      |
                                                        //                        / \
    int mr1,mr2;                                        //                   child   child
}                                                      //                              |
class Total extends Subject                               //                          / \
{     String Subject;                                       //                  child     child
    void add()                //Total class Inherited Subject class
    {
        System.out.println((mr1+mr2));
    }
}
class Display extends Total
{
    void Print() //Display class Inherited Total class
    {
        System.out.print(Subject);
    }
    
}
public class HirerarchialInheritance
{
    public static void main(String args[])
    {
        Total call = new Total();
        Display call2 =new Display();
        call.mr1=10;
        call.mr2=20;
        call2.Subject="JAVA Total Marks : ";
        call2.Print();
        call.add();
    }
}