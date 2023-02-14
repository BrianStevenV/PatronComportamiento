public class Main {
    public static void main(String[] args) {

        Gold gold = new Gold("34535", 75000, "20/10/2023");
        Platinium platinium = new Platinium("657567", 50000, "24/08/2002");


        gold.record(30000);
        gold.withdrawl(25000);
        System.out.println(gold.balance);
        System.out.println(gold.calculateInterest());
    }
}