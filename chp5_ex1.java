import java.util.Scanner;

public class chp5_ex1 {
    public static void main(String[] args){
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);
        System.out.println(" what is"+ number1 + "*" + number2 + "?");
        Scanner input= new Scanner(System.in);
        int answer= input.nextByte();
        while (number1*number2 == answer){
            System.out.println(" right answer. Try again what is" + number1 + "*" + number2 + "?");
        }
        answer=input.nextInt();

        System.out.println("you got it");

    }
}
