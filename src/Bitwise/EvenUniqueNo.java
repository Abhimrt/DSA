package Bitwise;
// in this program we will find the number whose occurrence is one
// other number is even in number
public class UniqueNo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,3,2,1};
        System.out.println(occ(arr));
    }
    static int occ(int[] arr){
        int ans = 0;
        for(int i:arr){
            ans ^=i;
        }
        return ans;
    }
}
