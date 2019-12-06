public class Main {

    public static void main(String[] args) {


        for (int i = 1; i < 100; i++) {

            if (i % 15 == 0) {
                System.out.println(i +" JNetWorks");
            }else if (i % 3 == 0){
                System.out.println(i +" JNet");
            }else if (i % 5 == 0){
                System.out.println(i +" Works");
            }
        }
    }
}
