import java.util.Arrays;
import java.util.Comparator;

public class Assignment1 {
    public static void sortByColumn(int a[][], int c){
        Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] firstentry, int[] secondentry){
                if(firstentry[c] > secondentry[c]){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
    }
    public static void main(String[] args) {
        int[][] arr = {{2, 3}, {12, 30}, {40, 50}, {1, 1}, {12, 10}, {3, 4}};
        System.out.println("Array before sorting: \n");
        System.out.println("A\t\tB");
        System.out.println("--\t\t--");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }

        int col1 = 0, col2 = 1;
        sortByColumn(arr, col1);
        sortByColumn(arr, col2);

        System.out.println("\n\nArray After sorting: \n");
        System.out.println("A\t\tB");
        System.out.println("--\t\t--");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
