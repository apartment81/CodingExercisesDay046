package ro.mirodone;

public class EqualSidesArray {

    public int findEvenIndex(int[] arr) {
        int result = -1;  // if not match found

        for (int i = 0; i < arr.length; i++) {
            int sum1 = 0;
            int sum2 = 0;

            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }

            for (int k = arr.length - 1; k > i; k--) {
                sum2 += arr[k];
            }

            if (sum1 == sum2) {
                result = i;
                break;
            }
        }
        return result;
    }


}
