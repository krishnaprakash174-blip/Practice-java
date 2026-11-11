public class className {
 public static void main(String[] args) {
      int[] arr = {65, 85, 15, 48, 59, 68, 73, 57, 468, 115};

      int max = arr[0];
      int smax= arr[0];
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] > max) {
              smax = max;
              max = arr[i];
          }
          if (arr[i] > smax && arr[i] != max) {
              smax = arr[i];
          }
      }

      System.out.println("Maximum value: " + max);
      System.out.println("Second maximum value: " + smax);
 }
}
