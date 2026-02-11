import java.util.*;
public class Game{
    public static void guessingNumbeGrame(){
        Scanner sc=new Scanner(System.in);
        int number=1*(int)(100* Math.random());
        int k=5;
        System.out.println("A number is between 1 to 100");
        System.out.println("you have "+k+"attempets is guss the cottect number ");
        for(int i=0;i<k;i++){
            System.out.println("enter the guess number :");
            int guess=sc.nextInt();
            if(guess ==number){
                System.out.println("congratulations! you guess the correct number ");
                sc.close();
                return;
            }else if(guess < number){
                System.out.println("the number is greater then" +guess);
            }else{
                System.out.println("the number is less then "+guess);
            }
        }System.out.println("you exhausted all attempt. the correct answer is "+number);
        sc.close();
    }
    public static void main(String[] args){
        guessingNumbeGrame();
    }
}