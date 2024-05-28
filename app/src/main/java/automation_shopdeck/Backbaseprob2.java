package automation_shopdeck;

public class Backbaseprob2 {

    public static void function(int[] arr) {

        int sum = 0;
        int noofsteps = 0;

        while (sum < arr.length) {

            if (arr[sum] == 0) {
                break;
            }

            sum += arr[sum];
            noofsteps++;

            if (sum >= arr.length) {
                break;
            }
        }

        System.out.println(sum);
        System.out.println(noofsteps);

    }
}
