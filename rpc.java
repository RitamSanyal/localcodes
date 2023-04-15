import java.util.Scanner;
import  java.util.Random;
public class rpc {
    public static void main(String[] args) {
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        String str,hit;
        int count=0,count2=0;
        System.out.print("Enter  START to start the game or EXIT to exit game: ");
        str=sc.next();
        str=str.trim();
        if (str.equalsIgnoreCase("START")){
            for (int i=1;i<=5;i++){
                System.out.print("Enter (R)ROCK (P)PAPER (S)SCISSOR : ");
                hit= sc.next();
                hit=hit.toUpperCase();
                int n=ran.nextInt(3);
                switch (hit) {
                    case "R" -> {
                        if (n == 0) {
                            System.out.println("Computer says  ROCK \t its a TIE");
                        } else if (n == 1) {
                            System.out.println("Computer says  PAPER \t YOU LOOSE");
                            count++;
                        } else {
                            System.out.println("Computer says SCISSOR \t YOU WIN");
                            count2++;
                        }
                    }
                    case "P" -> {
                        if (n == 0) {
                            System.out.println("Computer says  ROCK \t YOU WIN");
                            count2++;
                        } else if (n == 1) {
                            System.out.println("Computer says  PAPER \t its a TIE");
                        } else {
                            System.out.println("Computer says SCISSOR \t YOU LOOSE");
                            count++;
                        }
                    }
                    case "S" -> {
                        if (n == 0) {
                            System.out.println("Computer says  ROCK \t YOU LOOSE");
                            count++;
                        } else if (n == 1) {
                            System.out.println("Computer says  PAPER \t YOU WIN");
                            count2++;
                        } else {
                            System.out.println("Computer says SCISSOR \t its a tie");
                        }
                    }
                    default -> System.out.println("Invalid INPUT");
                }
            }
            if (count2>count){
                System.out.println("YOU WIN \n YOUR SCORE - "+count2+"\n COMPUTER SCORE - "+count);
            } else if (count>count2) {
                System.out.println("YOU LOOSE \n YOUR SCORE - "+count2+"\n COMPUTER SCORE - "+count);
            }
            else {
                System.out.println("It's a TIE \n YOUR SCORE - "+count2+"\n COMPUTER SCORE - "+count);
            }
        } else if (str.equalsIgnoreCase("EXIT")) {
            System.out.println("Code terminated on user command");
        }
        sc.close();
    }
}