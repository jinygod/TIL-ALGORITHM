class Solution {
    public int solution(int hp) {
        
        int a = 0;
        int b = 0;
    
        
        while(hp >= 5){
            hp -= 5;
            a++;
        }
        while(hp >= 3){
            hp -= 3;
            b++;
        }
        
        
        
        
        return a+b+hp;
    }
}