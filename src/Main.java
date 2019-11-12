import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{6, 3, 2, 7, 23, 5, 7};

        int sum = sum(array);
        System.out.println("Sum: " + sum);

        double avg = calculateAvg(array);
        System.out.println("Avg: " + avg);

        int max = CalculateMax(array);
        System.out.println("Max: " + max);

        int mode = FindMode(array);
        System.out.println("mode: " + mode);

        System.out.println(mediana(array));

//        int min = CalculateMin(array);
//        System.out.println("Min: " + min);
    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int el : array) {
            sum += el;
        }
        return sum;
    }

    public static double calculateAvg(int[] array) {
        if (array.length == 0) {
            System.err.println("Can't count average for empty array");
            return 0;
        }

        double sum = sum(array);
        int count = array.length;

        return sum / count;
    }

    public static int CalculateMax(int[] array) {
        /*int max = array [0];
        *
        * for (int = 1; i < array.length; i++) {
        * int iEl= array[i];
        * if (max < iEl){
        * int max = iEl;
        * }
        * }*/
        int max = Integer.MIN_VALUE;
        for (int el : array) {
            if (max < el) {
                max = el;
            }

        }
        return max;
    }
    public static int FindMode(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int el :array) {
            if(map.containsKey(el)) {
                int existing = map.get(el);
                map.replace(el, existing + 1);
            } else {
                map.put(el, 1);
            }
        }

        int max = 0;
        Integer mode = 0;
        for(Integer key : map.keySet()) {
            Integer value = map.get(key);
            if(value > max) {
                max = value;
                mode = key;
            }
        }
        System.out.println(map);
        return mode;
    }
    public static double mediana(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        if (array.length % 2 == 1) {
            return array[array.length / 2];
        } else {
            int num1 = array.length / 2;
            int num2 = num1 - 1;
            int sum = array[num1] + array[num2];
            return sum / 2.0;
        }

    }
}


