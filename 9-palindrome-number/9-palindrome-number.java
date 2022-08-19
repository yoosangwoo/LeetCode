class Solution {
    public boolean isPalindrome(int x) {
        
        int answer = 0;// 저장할 변수 선언
        
        if(x==0){ // x가 0이면 true
            return true;   
        } else if(x<0 || x%10==0 ){ // x가 음수거나 0으로 끝나면 false
            return false;
        }        
        
        
        // x가 양수일때 반복
        while( x > answer) {
            answer = (answer*10) + x%10;
            x = x/10;
            // x를 10으로 나눈 나머지를 변수에 더하기
            // 변수 곱하기 10 + 나머지 변수

        }
        
        // x와 변수값 비교해서 같거나 또는 answer에 저장한 변수의 10으로 나눈 값과 같다면 true, 아니면 false
        if(x == answer || x == answer/10){
            return true;
        } else {
            return false;
        }
    }
}



