class Solution {
    public int lengthOfLastWord(String s) {

        

//     1. i를 문자열s의 길이-1 로 선언
        int i = s.length()-1;
//     2. 마지막 i를 저장할 index와 결과를 저장할 res 변수 선언
        int index, res;
//     3. i가 0보다 크고 i번째 문자가 ' '공백이면 반복한다
        while( i >= 0 && s.charAt(i) == ' ' ) {
//         3-1. i를 1씩 감소
            i--;
        }
//     4. 마지막 i를 변수 index에 저장
        index = i;
//     5. i가 0보다 크고 i번째 문자가 ' '공백이 아니면 반복한다
        while( i >= 0 && s.charAt(i) != ' ' ) {
//         5-1. i를 1씩 감소
            i--;
        }
//     6. return res = index - i;
        return res = index - i;


    }
}
