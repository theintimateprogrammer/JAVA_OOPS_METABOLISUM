public class Task2 {
    public static void main(String[] args) {

        int i, fact = 1;

        int num = 7;

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Total : " +fact);
    }
}
