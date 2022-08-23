class Solution {
    public int removeDuplicates(int[] nums) {
        
        
// 1. 갯수를 셀 변수 i = 0 선언
        int i = 0;
// 2. j = 1부터 nums의 길이만큼 1씩 증가하며 반복
        for(int j=1; j<nums.length; j++){
//     2-1. nums[i]가 nums[j]와 같지않으면
            if( nums[i] != nums[j] ){
//         2-1-1. 개수를 셀 i에 1 증가하고
                i++;                
//         2-1-2. nums[i]에 nums[j]값을 대입
                nums[i] = nums[j];
            }
        }
        
// 3. return i+1;
        return i+1;
    }
}

