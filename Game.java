import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your choice\n1:Rock\n2:Paper\n3:Scissor");
        int n=sc.nextInt();
        Random ran=new Random();
        int r=ran.nextInt(4);
        if(n==r) { 
            if(r==1) System.out.println("Hurray you got a right choice Rock");
            else if (r==2) System.out.println("Hurray you got a right choice Paper");
            else if (r==3) System.out.println("Hurray you got a right choice Scissor");
        }
        else if(n<=3){
        if(r==1) System.out.println("you lose mine is Rock");
        else if (r==2) System.out.println("you lose mine is Paper");
        else if (r==3) System.out.println("you lose mine is Scissor");
        }
        else if (r==0) System.out.println("I give nothing");
        else  System.out.println("Please enter in a given range");
        sc.close();
}
}

