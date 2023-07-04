class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int sum = 0;
        int sum_square = 0;
        
        for(int i =0 ; i < num_list.length; i++){
            multiple *= num_list[i];
        }
        
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
        }
        
        sum_square = (int)Math.pow(sum, 2);
        
        System.out.println(multiple);
        System.out.println(sum_square);
        
        if(multiple < sum_square){
            return 1;
        }
        else{
            return 0;
        }
    }
}