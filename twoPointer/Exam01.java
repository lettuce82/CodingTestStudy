package twoPointer;
//다음의 배열에서 원소들의 합이 x인 연속 부분배열의 개수를 구하라.

public class Exam01 {
    public static int countSubArrSumOfX(int[] arr, int x) {
        int count = 0;
        int sum = 0;
        int left = 0;
        int right = 0;
        
        while (right <= arr.length) {
            if (sum == x) {
                count++;
                sum -= arr[left];
                left++;
            } else if (sum < x) {
                if (right < arr.length) {
                    sum += arr[right];
                }
                right++;
            } else if (sum > x) {
                sum -= arr[left];
                left++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 5, 2, 7, 9};
        int x = 9;
        System.out.println(countSubArrSumOfX(arr, x));
    }
}
