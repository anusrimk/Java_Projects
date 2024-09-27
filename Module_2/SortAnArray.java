// Question 26
package Module_2;

public class SortAnArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3, 7, 6, 4, 10};

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
