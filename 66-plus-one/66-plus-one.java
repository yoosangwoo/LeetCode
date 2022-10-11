class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int le = digits.length;
		// 배열의 마지막부터 배열의 길이만큼 1씩 감소하며 반복한다
        for(int i=le-1; i>=0; i--) {
            // 배열 자리마다 1씩 증가한다
            digits[i] += carry;   
            // 더한값의 몫을 carry에 저장한다
            carry = digits[i] / 10;   
            // 10으로 나눈 나머지값을 digit[i] 저장한다
            digits[i] = digits[i] % 10;  
        }
        // 몫이 1이 되면 
        if(carry == 1) {   
            // 배열의 길이를 추가한다
            int[] res = new int[le+1];
            // 배열의 처음을 1로 저장한다
            res[0] = 1;
            for(int i=1; i<=le;i++) {
                // 새로운 배열에 이전의 배열값을 저장한다
                res[i] = digits[i-1];
            }
            return res;
        }
        return digits;
    }
}
