import com.mjc.mjc813.cal.MyCalculator;

public class Main {
    public static void main(String[] args) {
        MyCalculator mCal = new MyCalculator();

        System.out.println("두수(a,b)의 값은 "+mCal.myAdd(10, 30)+"입니다.");
        System.out.println("두수(a,b)의 값은"+ mCal.myAdd(123456789012345L, 98765432198765L)+"입니다.");

    }
}
