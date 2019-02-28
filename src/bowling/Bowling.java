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
        Boolean gotStrike = false;
        Boolean gotSpare = false;
        Boolean got2Strikes = false;
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (turn == 1) {
                gotSpare = false;
                gotStrike = false;
                got2Strikes = false;
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
                }
                if (bowl1.matches(val2)) {
                    score = score + Integer.parseInt(bowl1);
                }
                if (bowl1.matches(val3)) {
                    score = score + Integer.parseInt(bowl1);
                }
                if (bowl1.matches(val4)) {
                    score = score + Integer.parseInt(bowl1);
                }
                if (bowl1.matches(val5)) {
                    score = score + Integer.parseInt(bowl1);
                }
                if (bowl1.matches(val6)) {
                    score = score + Integer.parseInt(bowl1);
                }
                if (bowl1.matches(val7)) {
                    score = score + Integer.parseInt(bowl1);
                }
                if (bowl1.matches(val8)) {
                    score = score + Integer.parseInt(bowl1);
                }
                if (bowl1.matches(val9)) {
                    score = score + Integer.parseInt(bowl1);
                }
                System.out.println("your score is " + score);
                turn = turn + 1;
            }

            // no strike or double strike
            if (turn == 2 && gotSpare == false && gotStrike == false && got2Strikes == false) {
                System.out.println("second bowl in round " + round);
                String bowl2 = myObj.nextLine();
                if (bowl2.matches(strike)) {
                    System.out.println("you got a strike");
                    score = score + 10;
                    gotStrike = true;
                    turn = 3;
                    System.out.println("turn is " + turn);
                    System.out.println("gotStrike is " + gotStrike);
                }
                if (bowl2.matches(spare)) {
                    System.out.println("you got a spare");
                    score = score + 10;
                    gotSpare = true;
                    turn = 2;
                    System.out.println("turn is " + turn);
                    System.out.println("gotSpare is " + gotSpare);
                }
                if (bowl2.matches(miss)) {
                    System.out.println("you missed");
                    score = score + 0;
                    turn = 1;
                    round = round + 1;
                }
                if (bowl2.matches(val1)) {
                    score = score + Integer.parseInt(bowl2);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl2.matches(val2)) {
                    score = score + Integer.parseInt(bowl2);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl2.matches(val3)) {
                    score = score + Integer.parseInt(bowl2);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl2.matches(val4)) {
                    score = score + Integer.parseInt(bowl2);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl2.matches(val5)) {
                    score = score + Integer.parseInt(bowl2);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl2.matches(val6)) {
                    score = score + Integer.parseInt(bowl2);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl2.matches(val7)) {
                    score = score + Integer.parseInt(bowl2);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl2.matches(val8)) {
                    score = score + Integer.parseInt(bowl2);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl2.matches(val9)) {
                    score = score + Integer.parseInt(bowl2);
                    round = round + 1;
                    turn = 1;
                }
                System.out.println("your score is " + score);
                System.out.println("round is " + round);
                System.out.println("next is " + round);
            }

            // got a spare
            if (turn == 2 && gotSpare == true) {
                System.out.println("third bowl in round " + round);
                String bowl2 = myObj.nextLine();
                if (bowl2.matches(strike)) {
                    System.out.println("you got a strike");
                    score = score + 10;
                }
                if (bowl2.matches(miss)) {
                    System.out.println("you missed");
                    score = score + 0;
                }
                if (bowl2.matches(val1)) {
                    score = score + Integer.parseInt(bowl2);
                }
                if (bowl2.matches(val2)) {
                    score = score + Integer.parseInt(bowl2);
                }
                if (bowl2.matches(val3)) {
                    score = score + Integer.parseInt(bowl2);
                }
                if (bowl2.matches(val4)) {
                    score = score + Integer.parseInt(bowl2);
                }
                if (bowl2.matches(val5)) {
                    score = score + Integer.parseInt(bowl2);
                }
                if (bowl2.matches(val6)) {
                    score = score + Integer.parseInt(bowl2);
                }
                if (bowl2.matches(val7)) {
                    score = score + Integer.parseInt(bowl2);
                }
                if (bowl2.matches(val8)) {
                    score = score + Integer.parseInt(bowl2);
                }
                if (bowl2.matches(val9)) {
                    score = score + Integer.parseInt(bowl2);
                }

                System.out.println("/your score is " + score);
                System.out.println("/round is " + round);
                round = round + 1;
                turn = 1;
                gotSpare = false;
                System.out.println("/next round is " + round);
            }
        }
        // got a strike
        if (turn == 2 && gotStrike == true) {
            System.out.println("second bowl in round " + round + "after strike");
            System.out.println("gotStrike is " + gotStrike);
            String bowl3 = myObj.nextLine();
            if (bowl3.matches(strike)) {
                System.out.println("you got a strike");
                score = score + 10;
                System.out.println("gotStrike is now " + gotStrike);
            }
            if (bowl3.matches(miss)) {
                System.out.println("you missed");
                score = score + 0;
            }
            if (bowl3.matches(val1)) {
                score = score + Integer.parseInt(bowl3);
            }
            if (bowl3.matches(val2)) {
                score = score + Integer.parseInt(bowl3);
            }
            if (bowl3.matches(val3)) {
                score = score + Integer.parseInt(bowl3);
            }
            if (bowl3.matches(val4)) {
                score = score + Integer.parseInt(bowl3);
            }
            if (bowl3.matches(val5)) {
                score = score + Integer.parseInt(bowl3);
            }
            if (bowl3.matches(val6)) {
                score = score + Integer.parseInt(bowl3);
            }
            if (bowl3.matches(val7)) {
                score = score + Integer.parseInt(bowl3);

            }
            if (bowl3.matches(val8)) {
                score = score + Integer.parseInt(bowl3);
            }
            if (bowl3.matches(val9)) {
                score = score + Integer.parseInt(bowl3);
            }

            System.out.println("Xyour score is " + score);
            System.out.println("Xround is " + round);
            System.out.println("Xnext round is " + round);
            turn = 3;
        }
        //third roll after a strike
        if (turn == 3) {
            System.out.println("third bowl in round " + round + "after strike");
            String bowl2 = myObj.nextLine();
            if (bowl2.matches(strike)) {
                System.out.println("you got a strike");
                score = score + 10;
            }
            if (bowl2.matches(miss)) {
                System.out.println("you missed");
                score = score + 0;
            }
            if (bowl2.matches(val1)) {
                score = score + Integer.parseInt(bowl2);
            }
            if (bowl2.matches(val2)) {
                score = score + Integer.parseInt(bowl2);
            }
            if (bowl2.matches(val3)) {
                score = score + Integer.parseInt(bowl2);
            }
            if (bowl2.matches(val4)) {
                score = score + Integer.parseInt(bowl2);
            }
            if (bowl2.matches(val5)) {
                score = score + Integer.parseInt(bowl2);
            }
            if (bowl2.matches(val6)) {
                score = score + Integer.parseInt(bowl2);
            }
            if (bowl2.matches(val7)) {
                score = score + Integer.parseInt(bowl2);
            }
            if (bowl2.matches(val8)) {
                score = score + Integer.parseInt(bowl2);
            }
            if (bowl2.matches(val9)) {
                score = score + Integer.parseInt(bowl2);
            }

            System.out.println("X_your score is " + score);
            System.out.println("X_round is " + round);
            round = round + 1;
            turn = 1;
           
            System.out.println("X_next round is " + round);
            System.out.println("X_next turn is " + turn);
        }

        if (round > 3) {
            System.out.println("the game is over");
            System.out.println("Your final score is: " + score);
        }

    }

}
