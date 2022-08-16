class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 정답을 담을 배열 생성
        int[] answer = new int[2];
        int[] answer2 = new int[2];
        
        for(int i=0; i<nums.length; i++){ // i=0부터 nums의 길이만큼 반복
            for(int j=i+1; j<nums.length; j++){ // j=i+1부터 nums의 길이만큼 반복
                if(nums[i] + nums[j] == target){
                    answer[0] = i; // nums[i]와 nums[j]의 합이 target과 같을 때 i와 j를 배열에 저장
                    answer[1] = j; // nums[i]와 nums[j]의 합이 target과 같을 때 i와 j를 배열에 저장
                    
        
                    return answer;
                }
            }
        }
        return answer2;
    }
}