
//WAP to find a sum of even number into 1D array


public class Que1 {
    public static void main(String[] args) {
        int [] array = {2,4,1,5,6,7,3,12,43,22};
        int sum = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }

}
