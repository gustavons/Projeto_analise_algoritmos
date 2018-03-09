
import java.util.Arrays;
import java.util.Random;

public class MaximumSubArrayDP {

    //bottom up approach
    public int solve(int [] a){
        int [] solution = new int[a.length+1];
        solution[0] = 0;

        for (int j = 1; j <solution.length ; j++) {
            solution[j] = Math.max(solution[j-1]+a[j-1],a[j-1]);
        }
        //this will print the solution matrix
        // System.out.println(Arrays.toString(solution));
        //now return the maximum in the solution array
        int result = solution[0];
        for (int j = 1; j <solution.length ; j++) {
            if(result<solution[j])
                result = solution[j];
        }

        return result;
    }


}