class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int first = 0;
        int second = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                first += num_list[i];
            }
            else{
                second += num_list[i];
            }
        }
        return Math.max(first,second);
    }
}