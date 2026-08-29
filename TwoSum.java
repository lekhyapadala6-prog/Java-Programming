import java.util.Scanner;
public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter Target:");
        int target=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("Indices:"+i+","+j);
                }
            }
        }
    }
}