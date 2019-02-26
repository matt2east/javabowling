/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

import java.util.Scanner;

/**
 *
 * @author matthew
 */
public class Bowling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;
        int round = 1;
        int turn = 1;
        String strike = "X";
        String spare = "/";
        String miss = "-";
        String val1 = "1";
        String val2 = "2";
        String val3 = "3";
        String val4 = "4";
        String val5 = "5";
        String val6 = "6";
        String val7 = "7";
        String val8 = "8";
        String val9 = "9";
        String val10 = "10";
        Boolean gotStrike = false;
        Boolean gotSpare = false;
        Scanner myObj = new Scanner(System.in);
        if (round < 10) {

            if (turn == 1) {
                System.out.println("first bowl in round " + round);

                String bowl1 = myObj.nextLine();

                if (bowl1.matches(strike)) {
                    System.out.println("you got a strike");
                    score = score + 10;
                    gotStrike = true;
                }
                if (bowl1.matches(miss)) {
                    System.out.println("you missed");
                    score = score + 0;
                }
                if (bowl1.matches(val1)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                if (bowl1.matches(val2)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                if (bowl1.matches(val3)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                if (bowl1.matches(val4)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                if (bowl1.matches(val5)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                if (bowl1.matches(val6)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                if (bowl1.matches(val7)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                if (bowl1.matches(val8)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                if (bowl1.matches(val9)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                if (bowl1.matches(val10)) {
                    score = score + Integer.parseInt(bowl1);
                    System.out.println("your val score is " + score);
                }
                System.out.println("bowl1 is " + bowl1);
                System.out.println("your score is " + score);
                turn = turn + 1;
            }
            if (turn == 2) {
                System.out.println("second bowl in round " + round);
                String bowl2 = myObj.nextLine();
                if (bowl2.matches(strike)) {
                    System.out.println("you got a strike");
                    score = score + 10;
                    gotStrike = true;
                }
                if (bowl2.matches(spare)) {
                    System.out.println("you got a spare");
                    score = score + 10;
                    gotSpare = true;
                }
                if (bowl2.matches(miss)) {
                    System.out.println("you missed");
                    score = score + 0;
                }
              if (bowl2.matches(val1)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                if (bowl2.matches(val2)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                if (bowl2.matches(val3)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                if (bowl2.matches(val4)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                if (bowl2.matches(val5)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                if (bowl2.matches(val6)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                if (bowl2.matches(val7)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                if (bowl2.matches(val8)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                if (bowl2.matches(val9)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                if (bowl2.matches(val10)) {
                    score = score + Integer.parseInt(bowl2);
                    System.out.println("your val score is " + score);
                }
                System.out.println("bowl2 is " + bowl2);
                System.out.println("your score is " + score);
                turn = turn - 1;
                round = round + 1;
            }
        }
        if (round == 10) {
            System.out.println("the game is over");
            System.out.println("your final score is " + score);
        }

//        for (int i = 0; i < 10; i += 1) {
//            score += input.nextInt();
//        }
//        System.out.println("Your bowling score is: " + score);
//    }
    }
}
