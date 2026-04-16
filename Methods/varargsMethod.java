package Methods;

public class varargsMethod {
    // static int sum(int... arr) {
    // int result = 0;
    // for (int a : arr) {
    // result += a;

    // }
    // return result;
    // }

    static int sum(int x, int... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result ;
    }

    public static void main(String[] args) {
        System.out.println("sum of 1 : " + sum(1));
        System.out.println("sum of  1,3,6,8 and 4 :" + sum(1, 3, 6, 8,4));
        System.out.println("sum of  13,3,61 and 2 :" + sum(13, 3, 61,2));
    }

}
