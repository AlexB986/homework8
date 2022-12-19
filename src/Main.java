import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arraysInt = new int[]{1, 2, 3};
        float[] arraysFloat = {1.57f, 7.654f, 9.986f};

        int[] newArrays = new int[3];
        newArrays[0] = 55;
        newArrays[1] = 66;
        newArrays[2] = 00;
        System.out.println(newArrays[0]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arraysInt = new int[]{1, 2, 3};

        for (int i = 0; i < arraysInt.length; i++) {
            if (i == arraysInt.length -1 ) {
                System.out.println(arraysInt[i]);
                break;
            }
        System.out.print(arraysInt[i] +", ");
    }

        float[] arraysFloat = {1.57f, 7.654f, 9.986f};

        for (int i = 0; i < arraysFloat.length; i++) {
           if(i ==arraysFloat.length-1){
               System.out.println(arraysFloat[i]);
               break;
           }
            System.out.print(arraysFloat[i]+", ");
        }

        int[] newArrays = new int[3];
        newArrays[0] = 55;
        newArrays[1] = 66;
        newArrays[2] = 00;

        for (int i = 0; i < arraysFloat.length; i++) {
            if (i ==  arraysFloat.length-1){
                System.out.println(newArrays[i]);
                break;
            }
            System.out.print(arraysFloat[i]+", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arraysInt = new int[]{1, 2, 3};

        for (int i = arraysInt.length-1; i >= 0; i--) {
            if (i == 0){
                System.out.println(arraysInt[i]);
                break;
            }
            System.out.print(arraysInt[i]+",");
        }

        float[] arraysFloat = {1.57f, 7.654f, 9.986f};
        for(int i = arraysFloat.length-1; i>=0; i--){
            if (i == 0){
                System.out.println(arraysFloat[i]);
                break;
            }
            System.out.print(arraysFloat[i]+",");
        }

        int[] newArrays = new int[3];
        newArrays[0] = 55;
        newArrays[1] = 66;
        newArrays[2] = 00;

        for(int i = newArrays.length-1; i>=0; i--){
            if (i == 0){
                System.out.println(newArrays[i]);
                break;
            }
            System.out.print(newArrays[i]+",");
        }

    }
    public static void task4() {
        System.out.println("Задача 4");
        int [] arr = {1,2,3};
        for ( int i = 0 ; i < arr.length;i++){
            if (arr[i] % 2 !=0){
                arr[i] = arr[i]+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}