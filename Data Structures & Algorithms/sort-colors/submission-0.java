class Solution {
    public void sortColors(int[] nums) {
   // Step 1: Count frequencies
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;

    for (int num : nums) {
        if (num == 0) {
            count0++;
        } else if (num == 1) {
            count1++;
        } else {
            count2++;
        }
    }

    // Step 2: Rebuild array
    int i = 0;

    // Fill 0s
    while (count0 > 0) {
        nums[i] = 0;
        i++;
        count0--;
    }

    // Fill 1s
    while (count1 > 0) {
        nums[i] = 1;
        i++;
        count1--;
    }

    // Fill 2s
    while (count2 > 0) {
        nums[i] = 2;
        i++;
        count2--;
    }
        
        
    }
}