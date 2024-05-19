
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainClass {
    
    /*
    //No exception handling is done
    public static void main(String[] args) {
        int a,b,i; float c;
        int[] arr = {11,22,33,44,55};
        Scanner s = new Scanner(System.in);
     
        System.out.print("Enter arr index to view: "); 
        i = s.nextInt();
        System.out.println("arr["+i+"]="+arr[i]);
        System.out.println("Array element is accessed successfully");
        System.out.println();
            
        System.out.print("Enter a: "); a = s.nextInt();
        System.out.print("Enter b: "); b = s.nextInt();
        c = (float)a/b;
        System.out.println("a="+a+", b="+b+", c="+c);
        System.out.println("Good bye...");
        
        System.out.println("Exiting from the program.");
    }
    */
    
    /*
    //Exception handled with try-catch
    public static void main(String[] args) {
        int a,b,i; float c;
        int[] arr = {11,22,33,44,55};
        Scanner s = new Scanner(System.in);
        
        try{
            System.out.print("Enter arr index to view: "); 
            i = s.nextInt();
            System.out.println("arr["+i+"]="+arr[i]);
            System.out.println("Array element is accessed successfully");
            System.out.println();
            
            System.out.print("Enter a: "); a = s.nextInt();
            System.out.print("Enter b: "); b = s.nextInt();
            c = (float)a/b;
            System.out.println("a="+a+", b="+b+", c="+c);
            System.out.println("Good bye...");
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            //customized handler code
            System.out.println(e.toString());
            System.out.println("Oops! Invalid array index!");
        }
        catch(ArithmeticException e){
            //customized handler code
            System.out.println("An arithmetic exception happened.");
            System.out.println(e);
        }       
        catch(Exception e){
            //generalized catch block
            System.out.println(e);  //describe exception
            //create some log entry
        }
        finally{
            
            
            
            System.out.println("Doing some final work before exiting...");
        }
        
        System.out.println("Exiting from the program."); 
    }
    */
    
    
    //Exception handled with NESTED try-catch
    public static void main(String[] args) {
        int a,b,i; float c;
        int[] arr = {11,22,33,44,55};
        Scanner s = new Scanner(System.in);
        
        try{
            try{
                System.out.print("Enter arr index to view: "); 
                i = s.nextInt();
                System.out.println("arr["+i+"]="+arr[i]);
                System.out.println("Array element is accessed successfully");
                System.out.println();
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Oops! Invalid array index!");
            }
            catch(Exception e){System.out.println(e);}
            
            System.out.print("Enter a: "); a = s.nextInt();
            System.out.print("Enter b: "); b = s.nextInt();
            c = (float)a/b;
            System.out.println("a="+a+", b="+b+", c="+c);
            System.out.println("Good bye...");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Exiting from the program.");
    }    
    
    public void openAFile(String fileName){
        
        FileInputStream fis;
        ObjectInputStream ois;
        System.out.println("HW");
        int x=12;
        if(x <100){
            System.out.println("Hi");
            try {
                fis = new FileInputStream(fileName);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("By");
        }

        
    }
          
            
            
            
            
            
    
}
