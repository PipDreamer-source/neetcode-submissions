class Solution {
    public int maxArea(int[] heights) {



        // area index difference * length if two billars of same height or may be one is more than 

        int left=0;
        int right=heights.length -1;
        int maxArea=Integer.MIN_VALUE ;

        while(left < right){


            int width= Math.abs(right - left);
            int height= Math.min(heights[left],heights[right]);


           int currentArea= width * height;

           maxArea= Math.max(currentArea,maxArea);

           if(heights[left] > heights[right]){
              right--;
           }
           else{
            left++;
           }










        }
        return maxArea;
        
    }
}
