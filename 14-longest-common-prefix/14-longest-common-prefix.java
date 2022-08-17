class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // 첫번째 배열을 따로 빼낸다 (변수 result에 저장)
        String result = strs[0];
        
        // 배열의 인덱스 i=1부터 배열의 끝까지 반복한다
        for(int i=1; i<strs.length; i++){
        // 배열의 인덱스 i번째부터 result로 시작하는지 반복 비교한다
            while(!strs[i].startsWith(result)){
                result = result.substring(0, result.length()-1);
            }
        }
        // result로 시작하지 않으면 result의 끝부터 문자 하나씩 짜른다
        return result;
        // result를 반환한다
    }
}