/**
 * @ProjectName: Algorithm_Study
 * @Package: PACKAGE_NAME
 * @ClassName: AverageValue
 * @Date: 2023/5/29 11:09
 */
public class AverageValue {
    public static void main(String[] args) {

    }
    public int averageValue(int[] nums) {
        int counts = 0;
        int sum = 0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i]%2==0){
                counts++;
                sum += nums[i];
            }
        }
        return (sum/counts);
    }
}
