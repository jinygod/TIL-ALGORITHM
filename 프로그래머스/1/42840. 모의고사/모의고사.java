import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] array1 = new int[answers.length];
        int[] array2 = new int[answers.length];
        int[] array3 = new int[answers.length];
        for(int i = 0; i < answers.length; i++){
            // array1 배열 값 세팅
            if(i % 5 == 0){
                array1[i] = 1;
            }
            else if(i % 5 == 1){
                array1[i] = 2;
            }
            else if(i % 5 == 2){
                array1[i] = 3;
            }
            else if(i % 5 == 3){
                array1[i] = 4;
            }
            else{
                array1[i] = 5;
            }
            // array2 배열 값 세팅
            if(i % 2 == 0){
                array2[i] = 2;
            }
            else if(i % 8 == 1){
                array2[i] = 1;
            }
            else if(i % 8 == 3){
                array2[i] = 3;
            }
            else if(i % 8 == 5){
                array2[i] = 4;
            }
            else{
                array2[i] = 5;
            }
            // array3 배열 값 세팅
            if(i % 10 == 0 || i % 10 == 1){
                array3[i] = 3;
            }
            else if(i % 10 == 2 || i % 10 == 3){
                array3[i] = 1;
            }
            else if(i % 10 == 4 || i % 10 == 5){
                array3[i] = 2;
            }
            else if(i % 10 == 6 || i % 10 == 7){
                array3[i] = 4;
            }
            else{
                array3[i] = 5;
            }
        }
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int max = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == array1[i]){
                score1++;
            }
            if(answers[i] == array2[i]){
                score2++;
            }
            if(answers[i] == array3[i]){
                score3++;
            }
        }
        if(max < score1){
            max = score1;
        }
        if(max < score2){
            max = score2;
        }
        if(max < score3){
            max = score3;
        }
        
            if(max == score1){
                answer.add(1);
            }
            if(max == score2){
                answer.add(2);
            }
            if(max == score3){
                answer.add(3);
            }
        
        
        return answer;
    }
}