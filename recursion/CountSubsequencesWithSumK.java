class CountSubsequencesWithSumK{
   static int printS(int index, int sum,int target, int []arr, int n){
        if(index == n){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }
        sum+=arr[index];
        int l = printS(index+1, sum, target, arr, n);
        sum-=arr[index];
        int r = printS(index+1, sum, target, arr, n);

        return l+r;
   }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int n = 3;
        int target = 2;
        System.out.println(printS(0,0,target,arr,n));;
    }
}