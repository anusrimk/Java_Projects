public class adding_arrays {
    public static void main(String[] args) {
            // Create arrays P and Q
            int[] P = {1, 2, 3, 4, 5, 6};
            int[] Q = {7, 8, 9, 10};
    
            int sizeR = P.length + Q.length;
            int[] R = new int[sizeR];
            for (int i = 0; i < P.length; i++) {
                R[i] = P[i];
            }
            for (int i = 0; i < Q.length; i++) {
                R[P.length + i] = Q[i];
            }
            System.out.print("Resultant array R: ");
            for (int i = 0; i < R.length; i++) {
                System.out.print(R[i] + " ");
            }
        }
}