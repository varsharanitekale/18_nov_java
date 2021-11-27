import java.util.Scanner;
public class ternary_operator {
    
        
    
    public static void main(String[] args){
        char ch;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  first number");
        int a =sc.nextInt();
        System.out.println("enter secound number");
        int b=sc.nextInt();
        String result=a>b?"a is greater than b":b>a?"b is greater than a":"both are equal";
        System.out.println("Result: "+result);
        System.out.println("Do you want to continue:if so, then type y/Y");
        ch=sc.next().charAt(0);




    }while(ch=='y'||ch=='Y');
        
        
    
        
    

        

        
        

    }
    
}
