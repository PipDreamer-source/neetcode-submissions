class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left=1;
        int right= 0;


        for(int pile:piles){

             right = Math.max(pile,right);
        }

        while(left < right){


           int mid= left + (right - left)/2;

            if(canEat(piles,h,mid)){

                right=mid;
            }
            else {
                left= mid+1;
            }

        }
        return right;


        
    }


    public boolean canEat(int[] piles, int h,int avgSpeed){

        // d= speed * time 
        // so time == distance/speed where distance is pile and speed is mid point 

        int kokoSpeed=0;
        int time =0;

        for(int pile:piles){

         if(pile%avgSpeed == 0){
             time +=pile/avgSpeed;
         }
         else{
            time += pile/avgSpeed + 1;
         }




        }
        return time <= h;



    }
}





