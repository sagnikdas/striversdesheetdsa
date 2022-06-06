import java.sql.SQLOutput;

public class Sort012Array {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;

        int temp;
        System.out.println("Original array");
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
        while(mid <= hi){

            switch(nums[mid]){
                case 0: {
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:{
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }

            }
        }
        System.out.println("After segregation");
        for(int i: nums){
            System.out.print(i+" ");
        }
    }
}
