package CCC_Competitions.Year_2013;

import java.util.Scanner;

public class Problem_S1_From_1987_2013 {
    public static void main(String[] args) {
        Problem_S1_From_1987_2013 year1 = new Problem_S1_From_1987_2013();
        System.out.println(year1.findDistinctYear(year1.getYear()));
    }

    public int findDistinctYear(String year) {
        int yearInt = Integer.parseInt(year);
        boolean foundDistinctYear = false;
        while(!foundDistinctYear) {
            foundDistinctYear = true;
            for (int i = 0; i < year.length()-1; i++) {
                for (int k = i+1; k < (year.length()); k++) {
                    if (year.charAt(i) == year.charAt(k)) {
                        yearInt += 1;
                        year = Integer.toString(yearInt);
                        foundDistinctYear = false;
                    }
                }
            }
        }

        return yearInt;
    }
    public String getYear() {
        Scanner input = new Scanner(System.in);
        return Integer.toString(input.nextInt() + 1);
    }

}
