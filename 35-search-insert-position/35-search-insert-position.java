class Solution {
    public int searchInsert(int[] nums, int target) {

        int i;
    // 1. int i=0 부터 배열의 길이만큼 1씩 증가하며 반복
        for(i=0; i<nums.length; i++) {
    //     1-1. 만약 배열의 i번째 값이 target보다 크거나 같으면
            if(nums[i] >= target) {
    //         1-1-1. return i
                break;
            }
        }
        return i;
    }
}

    
// 1. 배열 nums 를 리스트 nums로 변환시켜준다 
// 2. 리스트 nums 에 target을 추가한다
// 3. 