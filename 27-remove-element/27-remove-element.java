class Solution {
    public int removeElement(int[] nums, int val) {
        
        // 1. 갯수를 저장할 변수 num = 0 선언
        int num = 0;
        // 2. i=0부터 nums의 길이만큼 1씩 증가
        for(int i=0; i<nums.length; i++){
             // 2-1. nums의 요소값이 val과 같지않다면
            if(nums[i] != val){
                // 2-1-1. nums[num]에 nums[i] 값 대입
                nums[num] = nums[i];
                // 2-1-2. num++;
                num++;
            }
        }
        
        //  3. return num;
        return num;
    }
}