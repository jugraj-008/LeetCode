class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        int i = arr.length-1;
        int j = arr.length+zeros-1;

        while(i >= 0){
            if(j < arr.length){
                arr[j] = arr[i];
            }
            j--;
            if(arr[i] == 0){
                if(j < arr.length){
                    arr[j] = 0;
                }
            j--;
            }
            i--;
        }
        
    }
}