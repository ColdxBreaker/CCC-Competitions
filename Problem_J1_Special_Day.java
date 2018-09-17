package CCC_Competitions.Year_2015;

import java.util.Scanner;

public class Problem_J1_Special_Day {
    private static final int COMPETITION_DATE = 218;
    private String inputDay = "";
    public static void main(String []args){
        Problem_J1_Special_Day SpecialDay = new Problem_J1_Special_Day();
        System.out.println(SpecialDay.findOccurence(SpecialDay.getInput()));

    }
    public int getInput(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<2; i++){
            inputDay += input.next();
        }
        return Integer.parseInt(inputDay);
    }
    public String findOccurence(int inputDay){
        if(inputDay > COMPETITION_DATE){
            return "After";
        }else if(inputDay < COMPETITION_DATE){
            return "Before";
        }
        return "Special Day";
    }
}
