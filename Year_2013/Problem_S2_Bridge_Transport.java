package CCC_Competitions.Year_2013;

import java.util.ArrayList;
import java.util.Scanner;

//Who wrote it, date, name, what machine is it

public class Problem_S2_Bridge_Transport {
    private int maxWeight = 0;
    private int numberOfRailwayCars = 0;
    private ArrayList<Integer> railwayCars = new ArrayList<Integer>();

    public static void main(String[] args) {
        Problem_S2_Bridge_Transport train = new Problem_S2_Bridge_Transport();
        train.getRailwayCars();
        System.out.println(train.calculateCarsCrossed());
    }

    public int calculateCarsCrossed() {
        int railwayCarsCrossed = 0;
        int railwayCarsPotentiallyCross;
        int weightOfCars;
        for (int i = 0; i <= railwayCars.size()- 4; i++) {
            railwayCarsPotentiallyCross = i;
            weightOfCars = 0;
            for (int k = i; k < i+4; k++) {
                weightOfCars += railwayCars.get(k);
                railwayCarsPotentiallyCross += 1;
            }
            if(weightOfCars > maxWeight){
                return railwayCarsCrossed;
            }else{
                railwayCarsCrossed = railwayCarsPotentiallyCross;
            }
        }
        return railwayCarsCrossed;
    }

    public void getRailwayCars() {
        Scanner input = new Scanner(System.in);
        maxWeight = input.nextInt();
        numberOfRailwayCars = input.nextInt();
        for (int i = 0; i < numberOfRailwayCars; i++) {
            railwayCars.add(input.nextInt());
        }
        input.close();
    }
}
