public class Gold extends Account{
    public Gold(String numberAccount, double balance, String openDay) {
        super(numberAccount, balance, openDay);
    }

    @Override
    public double calculateInterest() {
        return this.balance * 0.05;
    }
}
