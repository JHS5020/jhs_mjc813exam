import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] box = {10,8,6};
        int n = 3;
        int[] num_list = {1, 2, 3, 4, 5};
        Solution a = new Solution();
        int result = a.solution(box,n);
        System.out.println(result);
        String result1 = a.solution1("hello",3);
        System.out.println(result1);
        int result2 = a.solution2("happy birthday!");
        System.out.println(result2);
        int[] result3 = a.solution3(num_list);
        System.out.println(Arrays.toString(result3));
    }
}

class Solution{
    public int solution(int[] box, int n) {
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }
    public String solution1(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i<my_string.length();i++){
            char a = my_string.charAt(i);
                for(int j = 0; j<n;j++){
                    answer.append(a);
            }
        }
        return answer.toString();
    }
    public int solution2(String message) {
        int answer = 0;
        return answer = message.length() * 2;
    }
    public int[] solution3(int[] num_list) {
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i<num_list.length; i++){
            a.add(num_list[num_list.length -i -1]);
        }
        int[] answer = new int[a.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
}
