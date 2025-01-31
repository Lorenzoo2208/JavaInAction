public class Even {

    public static void main(String[] args) {

        System.out.println(isEven(4));

        //true

        System.out.println(isEven(7));

        //false

    }

    // check if n is even

    public static boolean isEven(int n) {

        return n % 2 == 0;
    }


}