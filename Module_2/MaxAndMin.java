// Question 25
package Module_2;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
        int max = array[0];
        int min = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Max and min : "+max+ " & "+min);
    }
}
