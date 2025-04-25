//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] box = {10,8,6};
        int n = 3;
        Solution a = new Solution();
        int result = a.solution(box,n);
        System.out.println(result);
    }
}

class Solution{
    public int solution(int[] box, int n) {
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }
}