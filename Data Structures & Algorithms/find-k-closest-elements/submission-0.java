class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {


// As array is sorted binary searc 
// two pointers as window can be shrinked form bith sides 
// get all elemnts in this wondow 
// always remember window size is j-i=1;

    int i=0;
    int j=arr.length -1;


     while(j-i+1 > k){


        if(Math.abs(arr[i] - x) > Math.abs(arr[j] - x) ){


            i++;
        }
        else{
            j--;
        }

     }
            List<Integer> result=new ArrayList<>();
             
             for(int p=i; p<= j;p++){

                result.add(arr[p]);
             }

             return result;


        
    }
}