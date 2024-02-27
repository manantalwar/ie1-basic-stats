public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};

    int min = nums[0];
    int max = nums[0];

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < min) {
            min = nums[i];
        }
        if (nums[i] > max) {
            max = nums[i];
        }
    }

    System.out.println("Minimum number is: " + min);
    System.out.println("Maximum number is: " + max);
}