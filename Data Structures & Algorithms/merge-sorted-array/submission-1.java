class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //remeber that we dont want zero but we can start from end so that replace happens from there 
      //  for i  valid elements is m so last is m-1;
      //  for j valid elemnt is n so last is n-1;
      //  for k we make that its total size last part m+n-1;


        int i=m-1;
        int j=n-1;
        int k=n+m-1;

        while(j>= 0){

             if(i>= 0 && nums1[i] > nums2[j]){
                 nums1[k]=nums1[i];
                 i--;
             }
             else{
                nums1[k]=nums2[j];
                j--;

             }
             k--;
             
        }





        




        
    }
}