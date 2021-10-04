public class Main {
    public static void main(String[] args) {

        int balance = 300;
        int refill = 1200;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int newBalance = balance + refill + bonus;
        System.out.println(newBalance);
        }

}
