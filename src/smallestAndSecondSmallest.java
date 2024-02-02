import java.util.ArrayList;

public class smallestAndSecondSmallest {

    public static ArrayList<Integer> findSmallestAndSecondSmallest(int[] numbers) {
        //20, 7, 2, 10, 8
        int smallest = numbers[0]; //20
        int secondSmallest = numbers[1]; //7

        for (int i = 2; i < numbers.length; i++) {
            if(secondSmallest < smallest) {
                int tempSmallest = smallest;
                smallest = secondSmallest;
                secondSmallest = tempSmallest;
            }
            if (numbers[i] < smallest) {
                int tempSmallest = smallest;
                smallest = numbers[i];
                secondSmallest = tempSmallest;

            } else if (numbers[i] < secondSmallest) {
                secondSmallest = numbers[i];
            }
        }

        ArrayList<Integer> SmallestAndSecondSmallest = new ArrayList<Integer>();
        SmallestAndSecondSmallest.add(smallest);
        SmallestAndSecondSmallest.add(secondSmallest);
        return SmallestAndSecondSmallest;
    }



}
