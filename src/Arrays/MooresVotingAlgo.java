package Arrays;
// bayer-Moore majority voting algo
// we find the element which is coming more than n/2 times
public class MooresVotingAlgo {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,1};
        System.out.println(majority(arr));
    }
    static int majority(int[] arr){
        int sum = 0;
        int target = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[target]){
                sum++;
            }else{
                if(sum==1){
                    target = i;
                }else{
                    sum--;
                }
            }
        }
        sum = 0;
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==arr[target]){
                sum++;
            }
        }
        return (arr.length/2<sum)?arr[target]:-1;

    }
}
