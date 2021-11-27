import java.util.Scanner;
public class numofdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            System.out.println("enter your  number here");
            int a=sc.nextInt();
             int count=0;
             
            while(a>0){
                a=a/10;
                count++;

            }
            System.out.println("Digit of number is: "+count);
            System.out.println("dp you want to continue: if so, then type y/Y ");
            ch=sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');

    }
    
}
