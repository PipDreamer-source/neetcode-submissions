class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] newArray=new int[nums.length];
        int n=nums.length;

        for(int i=0;i<n;i++){

            newArray[i]=nums[i]*nums[i];

        }

        Arrays.sort(newArray);
        System.out.println(newArray);
        return newArray;
        
    }
}