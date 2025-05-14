import java.util.ArrayList;
import java.util.Random;
public class ThisIsJavaChap04Exam {
    public static void main(String[] args) {
        ThisIsJavaChap04Exam tij = new ThisIsJavaChap04Exam();
        System.out.println(tij.solve04());
        tij.solve05();
    }

    /**
     * 주사위 2개 던져서 합 5 만들기 : (1,4), (4,1), (2,3), (3,2) => {{}, {}, {}, {}}
     * @return
     */
    public String solve04() {
        int[][] result = new int[1][2];
        while( !this.checkAllResult(result) ) {
            int dice01 = this.getRandomDice();
            int dice02 = this.getRandomDice();
            if ( dice01 + dice02 == 5 ) {
                result[0][0] = dice01;
                result[0][1] = dice02;
            }
        }
        return result[0][0] + " 과(와) " + result[0][1] + "이 나와 두눈의 합이 5가 되었습니다";
    }

    /**
     * 1~6까지의 랜덤한 숫자를 리턴한다.
     * @return
     */
    private int getRandomDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    /**
     * int[4][2] 배열 result 의 모든 원소가 꽉 차 있으면 true 를 리턴한다.
     * @param result
     * @return
     */
    private boolean checkAllResult( int[][] result ) {
        // for 2번 중첩해서 값이 (0, 0) 이면 false 이고, 모두 (0,0) 이 아니면 true
        for(int i = 0; i < result.length; i++) {
            if( result[i][0] == 0 || result[i][1] == 0 ) {
                return false;
            }
        }
        return true;
    }


    /**
     * 4x + 5y = 60 이라는 x 값과 y 값이 해당하는 모든 x, y 항을 구해야 한다.
     * x, y 는 단 10 이하의 자연수입니다.
     * @return
     */
    public void solve05() {

        for ( int x = 1; x <= 10; x++ ) {
            for ( int y = 1; y <= 10; y++ ) {
                if( (4*x) + (5*y) == 60){
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
