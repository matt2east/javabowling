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
        Boolean round10strike = false;
        Boolean round10spare = false;
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (turn == 1) {
                gotSpare = false;
                gotStrike = false;
                got2Strikes = false;
                System.out.println("first bowl in round " + round);

                String bowl = myObj.nextLine();

                if (bowl.matches(strike)) {
                    System.out.println("you got a strike");
                    score = score + 10;
                    gotStrike = true;
                    if (round == 10) {
                        round10strike = true;
                    }
                }
                if (bowl.matches(miss)) {
                    System.out.println("you missed");
                    score = score + 0;
                }
                if (bowl.matches(val1)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val2)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val3)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val4)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val5)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val6)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val7)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val8)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val9)) {
                    score = score + Integer.parseInt(bowl);
                }
                System.out.println("your score is " + score);
                if (round == 10 && round10strike == true) {
                    turn = 4;
                } else {
                    turn++;
                }

            }

            // no strike or double strike
            if (turn == 2 && gotSpare == false && gotStrike == false && got2Strikes == false) {
                System.out.println("second bowl in round " + round);
                String bowl = myObj.nextLine();
                if (bowl.matches(strike)) {
                    System.out.println("you got a strike");
                    score = score + 10;
                    gotStrike = true;
                    turn = 2;
                    System.out.println("turn is " + turn);
                }
                if (bowl.matches(spare)) {
                    System.out.println("you got a spare");
                    score = score + 10;
                    gotSpare = true;
                    System.out.println("turn is " + turn);
                    turn = 2;
                    if (round == 10){
                        round10spare = true;
                    }
                }
                if (bowl.matches(miss)) {
                    System.out.println("you missed");
                    score = score + 0;
                    turn = 1;
                    round = round + 1;
                }
                if (bowl.matches(val1)) {
                    score = score + Integer.parseInt(bowl);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl.matches(val2)) {
                    score = score + Integer.parseInt(bowl);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl.matches(val3)) {
                    score = score + Integer.parseInt(bowl);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl.matches(val4)) {
                    score = score + Integer.parseInt(bowl);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl.matches(val5)) {
                    score = score + Integer.parseInt(bowl);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl.matches(val6)) {
                    score = score + Integer.parseInt(bowl);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl.matches(val7)) {
                    score = score + Integer.parseInt(bowl);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl.matches(val8)) {
                    score = score + Integer.parseInt(bowl);
                    round = round + 1;
                    turn = 1;
                }
                if (bowl.matches(val9)) {
                    score = score + Integer.parseInt(bowl);
                    round = round + 1;
                    turn = 1;
                }
            }

            // got a spare
            if (turn == 2 && gotSpare == true) {
                System.out.println("third bowl in round " + round + " after spare");
                String bowl = myObj.nextLine();
                if (bowl.matches(strike)) {
                    System.out.println("you got a strike");
                    score = score + 10;
                }
                if (bowl.matches(miss)) {
                    System.out.println("you missed");
                    score = score + 0;
                }
                if (bowl.matches(val1)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val2)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val3)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val4)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val5)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val6)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val7)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val8)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val9)) {
                    score = score + Integer.parseInt(bowl);
                }
                round = round + 1;
                turn = 1;
                gotSpare = false;
            }
            // got a strike
            if (turn == 2 && gotStrike == true) {
                System.out.println("second bowl in round " + round + " after strike");
                String bowl = myObj.nextLine();
                if (bowl.matches(strike)) {
                    System.out.println("you got a strike");
                    score = score + 10;
                }
                if (bowl.matches(miss)) {
                    System.out.println("you missed");
                    score = score + 0;
                }
                if (bowl.matches(val1)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val2)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val3)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val4)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val5)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val6)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val7)) {
                    score = score + Integer.parseInt(bowl);

                }
                if (bowl.matches(val8)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val9)) {
                    score = score + Integer.parseInt(bowl);
                }
                turn = 3;
            }
            //third bowl after a strike
            if (turn == 3) {
                System.out.println("third bowl in round " + round + " after strike");
                String bowl = myObj.nextLine();
                if (bowl.matches(strike)) {
                    System.out.println("you got a strike");
                    score = score + 10;
                }
                if (bowl.matches(miss)) {
                    System.out.println("you missed");
                    score = score + 0;
                }
                if (bowl.matches(val1)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val2)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val3)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val4)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val5)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val6)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val7)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val8)) {
                    score = score + Integer.parseInt(bowl);
                }
                if (bowl.matches(val9)) {
                    score = score + Integer.parseInt(bowl);
                }
                round = round + 1;
                turn = 1;
            }
            //last round
            if (round == 10) {
                System.out.println("this is the last round");
                if (round10strike == true) {
//bowl twice more in last round after strike
                    for (int j = 1; j < 5; j++) {
                        System.out.println(j + " bonus bowl in round " + round);
                        System.out.println(turn + " bonus turns left");
                        String bowl = myObj.nextLine();
                        if (bowl.matches(strike)) {
                            System.out.println("you got a strike");
                            score = score + 10;
                        }
                        if (bowl.matches(spare)) {
                            System.out.println("you got a spare");
                            score = score + 10;
                        }
                        if (bowl.matches(miss)) {
                            System.out.println("you missed");
                            score = score + 0;
                        }
                        if (bowl.matches(val1)) {
                            score = score + Integer.parseInt(bowl);
                        }
                        if (bowl.matches(val2)) {
                            score = score + Integer.parseInt(bowl);
                        }
                        if (bowl.matches(val3)) {
                            score = score + Integer.parseInt(bowl);
                        }
                        if (bowl.matches(val4)) {
                            score = score + Integer.parseInt(bowl);
                        }
                        if (bowl.matches(val5)) {
                            score = score + Integer.parseInt(bowl);
                        }
                        if (bowl.matches(val6)) {
                            score = score + Integer.parseInt(bowl);
                        }
                        if (bowl.matches(val7)) {
                            score = score + Integer.parseInt(bowl);
                        }
                        if (bowl.matches(val8)) {
                            score = score + Integer.parseInt(bowl);
                        }
                        if (bowl.matches(val9)) {
                            score = score + Integer.parseInt(bowl);
                        }
                        turn = turn - 1;
                        if (turn == 1) {
                            round = 11;
                        }
                    }
                }
                //round 10 spare bonus
                if (round10spare = true){
                    System.out.println("bonus spare");
                }
            }
        }

        if (round > 10) {
            System.out.println("the game is over");
            System.out.println("Your final score is: " + score);
        }

    }

}
