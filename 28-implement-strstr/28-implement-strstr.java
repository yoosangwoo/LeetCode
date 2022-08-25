class Solution {
    public int strStr(String haystack, String needle) {

        
//      1. needle 이 비어있으면 0을 반환합니다
        if(needle == null){
            return 0;
        }
        
//      2. 시작하는 번째 start 선언
        int start;
        
//      3. 끝나는 번째 last = needle.length() 선언
        int last = needle.length();
        
//      4. start 부터 haystack 의 길이만큼 i는 1씩 증가하며 반복
        for(start = 0; start < haystack.length(); start++) {
//          4-1. needle 의 길이가 haystack 의 길이보다 크면      
            if(needle.length() > haystack.length()) {
//              4-1-1. return -1
                return -1;
            }
//          4-2. haystack 의 start부터 last 까지 문자열을 추출한게 needle 문자열과 동일한지 비교한다
            if(haystack.substring(start, last).equals(needle)) {
//              4-2-1. 동일하다면 return start
                return start;
//          4-3. substring 의 끝자리 last가 haystack의 길이에 벗어나지않으면 
            } else if (last < haystack.length()) {
//              4-3-1. last에 1 증가
                last++;
//          4-4. 그 외면
            } else {
//              4-4-1. return -1
                return -1;
            }
        }
        
        return -1;
        
    }
}


// 1. needle 이 비어있으면 0을 반환합니다
// 2. 문자열 needle 이 haytstack 에 포함되어 있지않으면 -1 을 반환한다
// 3. 시작하는 번째 start = 0 선언
// 4. 끝나는 번째 last = haystack.length() 선언
// 5. start 부터 haystack 의 길이만큼 i는 1씩 증가하며 반복
//     5-1. haystack 의 start부터 last 까지 문자열을 추출한게 needle 문자열과 동일한지 비교한다
//         5-1-1. 동일하다면 return start
    