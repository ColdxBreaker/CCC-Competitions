package CCC_Competitions.Year_2016;

import CCC_Competitions.Year_2015.Problem_J2_Happy_or_Sad;

import java.util.Scanner;

public class Problem_J1_Tournament_Selection {
    private String winLoss = "";
    private int wins;

    public static void main(String[] args) {
        Problem_J1_Tournament_Selection player1 = new Problem_J1_Tournament_Selection();
        Problem_J2_Happy_or_Sad player1Emotion = new Problem_J2_Happy_or_Sad();
        System.out.println(player1Emotion.findEmotion(player1Emotion.getEmotion()));
        System.out.println("Group " + player1.findGroup(player1.getWinLossRecords()));

    }

    public int findGroup(String winLossRecords) {

        for (int i = 0; i < winLossRecords.length(); i++) {
            if (winLossRecords.charAt(i) == 'W')
                wins += 1;
        }
        if (wins >= 5) {
            return 1;
        } else if (wins >= 3 && wins <= 4) {
            return 2;
        } else if (wins >= 1 && wins <= 2) {
            return 3;
        } else {
            return -1;
        }
    }

    public String getWinLossRecords() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            winLoss += input.next();
        }
        input.close();
        return winLoss;
    }
}
