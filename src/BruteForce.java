public class BruteForce {

    public int solve(int[] A) {
        int lo = 0;
        int hi = A.length-1;
        int sum, max;
        max = A[1];
        for (int i = lo; i <= hi; i++) {
            sum = 0;
            for (int j = i; j <= hi; j++) {
                sum += A[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }
}
