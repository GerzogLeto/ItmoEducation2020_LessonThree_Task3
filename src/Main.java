import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int countNegative = 0;
        int countZero = 0;
        int countPozitive = 0;
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            double temp = Math.random();
            if(temp < 0.3) arr[i] = -1;
            else if(temp > 0.7) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            if(i == -1) countNegative++;
            else if(i == 0) countZero++;
            else countPozitive++;
        }
        if(countNegative == countZero ||
                countNegative == countPozitive || countZero == countPozitive) return;
        else{
            int[] temparr = new int[] {countNegative, countZero, countPozitive};
            Arrays.sort(temparr);
            System.out.println(temparr[temparr.length - 1]);
        }
    }
}
