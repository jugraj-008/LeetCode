class Solution {
    //Greedy principle -> When a choice is valid and taking it cannot hurt future choices, take it immediately.
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int n1 = flowerbed.length;
        if(n ==0 ) return true;
        for(int i=0 ; i<n1 ; i++){
        if( flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == n1-1 || flowerbed[i+ 1] == 0) ){
            flowerbed[i] = 1;
            n--;
        }
        if(n==0) return true;

    }
    
    return false;

    }
}