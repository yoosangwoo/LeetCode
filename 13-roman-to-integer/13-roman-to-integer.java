class Solution {
    public int romanToInt(String s) {
        
        // 답을 담을 int형 변수(answer) 선언
        int answer = 0;
        
        // i=0부터 s의 길이만큼 반복한다
        for(int i=0; i<s.length(); i++){
        // 만약 s의 i번째 단어가 'I'면 변수(answer)에 +1 더하기
            if(s.charAt(i) == 'I'){
                answer += 1;
            } else 
                // 아니면 s의 i번째 단어가 'V'이면 변수(answer)에 +5 더하기
                // 근데 i-1번째 단어가 'I'면 변수(answer)에 -2 빼기
                if(s.charAt(i) == 'V'){
                answer += 5;
                if(i!=0){
                    if(s.charAt(i-1) == 'I'){
                        answer -= 2;
                    }
                }
            } else 
                // 아니면 s의 i번째 단어가 'X'이면 변수(answer)에 +10 더하기
                // 근데 i-1번째 단어가 'I'면 변수(answer)에 -2 빼기
                if(s.charAt(i) == 'X'){
                answer += 10;
                if(i!=0){
                    if(s.charAt(i-1) == 'I'){
                        answer -= 2;
                    }
                }
            } else
                // 아니면 s의 i번째 단어가 'L'이면 변수(answer)에 +50 더하기
                // 근데 i-1번째 단어가 'X'면 변수(answer)에 -20 빼기
                if(s.charAt(i) == 'L'){
                answer += 50;
                if(i!=0){
                    if(s.charAt(i-1) == 'X'){
                        answer -= 20;
                    }
                }
            } else 
                // 아니면 s의 i번째 단어가 'C'이면 변수(answer)에 +100 더하기
                // 근데 i-1번째 단어가 'X'면 변수(answer)에 -20 빼기
                if(s.charAt(i) == 'C'){
                answer += 100;
                if(i!=0){
                    if(s.charAt(i-1) == 'X'){
                        answer -= 20;
                    }
                }
            } else 
                // 아니면 s의 i번째 단어가 'D'이면 변수(answer)에 +500 더하기
                // 근데 i-1번째 단어가 'C'면 변수(answer)에 -200 빼기
                if(s.charAt(i) == 'D'){
                answer += 500;
                if(i!=0){
                    if(s.charAt(i-1) == 'C'){
                        answer -= 200;
                    }
                }
            } else 
                // 아니면 s의 i번째 단어가 'M'이면 변수(answer)에 +1000 더하기
                // 근데 i-1번째 단어가 'C'면 변수(answer)에 -200 빼기
                if(s.charAt(i) == 'M'){
                answer += 1000;
                if(i!=0){
                    if(s.charAt(i-1) == 'C'){
                        answer -= 200;
                    }
                }
            }
            
        }
        
        return answer;
        
        


    }
}