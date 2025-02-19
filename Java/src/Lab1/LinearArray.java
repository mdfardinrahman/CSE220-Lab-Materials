package Lab1;

public class LinearArray {
    public static void main(String[] args){
        int[] array_1 = {1, 3, 5, 6};
        int[] array_2 = {2, 3, 4, 7, 8, 10};

        int[] array_merge = new int[array_1.length + array_2.length];

        int i=0, j=0, merge = 0;

        while (i < array_1.length && j < array_2.length){
            if (array_1[i] < array_2[j]){
                    array_merge[merge] = array_1[i];
                    i++;
                    merge++;
            }
            else {
                array_merge[merge] = array_2[j];
                j++;
                merge++;
            }
        }

        while (i < array_1.length) {
            array_merge[merge] = array_1[i];
            i++;
            merge++;
        }
        while (j < array_2.length) {
            array_merge[merge] = array_2[j];
            j++;
            merge++;
        }

        for (int num : array_merge) {
            System.out.println(num);
        }


    }
}
