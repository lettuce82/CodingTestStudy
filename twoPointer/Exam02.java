package twoPointer;
//다음의 정렬된 배열에서 두개의 원소의 합이 x와 같은지를 확인하고, 그렇다면 각 원소의 인덱스를 반환하라.

public class Exam02 {
    public static int[] findTwoElementsWithSum(int[] arr, int x) {
        int[] answer = new int[2];
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == x) {
                answer[0] = left;
                answer[1] = right;
                return answer;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 11, 15};
        int x = 15;
        int[] result = findTwoElementsWithSum(arr, x);
        System.out.println(result[0] + ", " + result[1]);
    }
}
