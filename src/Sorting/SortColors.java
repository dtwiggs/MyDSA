package Sorting;
public class SortColors {
    public void sortColors(int[] nums) {
        int[] total = new int[] {0, 0, 0};

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                total[0]++;
            } else if(nums[i] == 1){
                total[1]++;
            } else {
                total[2]++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < total[0]; j++){
                nums[i] = 0;
                i++;
            }
            for(int j = 0; j < total[1]; j++){
                nums[i] = 1;
                i++;
            }
            for(int j = 0; j < total[2]; j++){
                nums[i] = 2;
                i++;
            }
        }
    }
}
