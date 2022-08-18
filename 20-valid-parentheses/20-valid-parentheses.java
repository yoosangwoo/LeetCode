class Solution {
    public boolean isValid(String s) {
        
        // 1. 빈 배열 arr 를 만든다.
        Stack<String> arr = new Stack<>();
        
        // 2. i=0부터 s의 길이만큼 1씩 증가하면 반복한다.
        for(int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
        //     2-1. i번째 문자가 ( 이면
                case '(' : 
        //         2-1-1. 배열 arr에 ) 넣는다.
                    arr.push(")");
                    break;
        //     2-2. i번째 문자가 { 이면
                case '{' : 
        //         2-2-1. 배열 arr에 } 를 넣는다.
                    arr.push("}");
                    break;
        //     2-3. i번째 문자가 [ 이면
                case '[' : 
        //         2-3-1. 배열 arr에 ]를 넣는다.
                    arr.push("]");
                    break;
        //     2-4. i번째 문자가 ( 또는 { 또는 [ 이 아니면
                default :
                    if(arr.size()==0){
                        return false;
                    }
        //         2-4-1. i번째 문자가 배열 arr의 마지막 값과 같으면
                    if(String.valueOf(s.charAt(i)).equals(arr.peek())){
        //             2-4-1-1. 배열 arr의 마지막 값 제거
                        arr.pop();
                    }
        //         2-4-2. i번째 문자가 배열 arr의 마지막 값과 같지 않으면
                    else {
        //             2-4-2-1. false 반환
                        return false;
                    }
                    
            }
        }

        
        return arr.size() == 0;

//         // 3. 배열 arr의 길이가 0이면
//         if(arr.empty() == true){
//         //     3-1. return true;
//             return true;
//         } else if(arr.empty() != true){
//         // 4. 배열 arr의 길이가 0이 아니면
//         //     4-1. return false;
//             return false;
//         }

//         return true;
    }
}

// 1. 빈 배열 arr 를 만든다.
// 2. i=0부터 s의 길이만큼 1씩 증가하면 반복한다.
//     2-1. i번째 문자가 ( 이면
//         2-1-1. 배열 arr에 ) 넣는다.
    
//     2-2. i번째 문자가 { 이면
//         2-2-1. 배열 arr에 } 를 넣는다.
    
//     2-3. i번째 문자가 [ 이면
//         2-3-1. 배열 arr에 ]를 넣는다.
                  
//     2-4. i번째 문자가 ( 또는 { 또는 [ 이 아니면
//         2-4-1. i번째 문자가 배열 arr의 마지막 값과 같으면
//             2-4-1-1. 배열 arr의 마지막 값 제거
//         2-4-2. i번째 문자가 배열 arr의 마지막 값과 같지 않으면
//             2-4-2-1. false 반환
                            
// 3. 배열 arr의 길이가 0이면
//     3-1. return true;
                            
// 4. 배열 arr의 길이가 0이 아니면
//     4-1. return false;