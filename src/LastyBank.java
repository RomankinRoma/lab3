public class LastyBank implements Subscriber{

    @Override
    public void update(Publisher publisher) {
        System.out.println(((NationalBankPublisher) publisher).getlKZRUCurrency()+"->"+((NationalBankPublisher) publisher).getKZRUCurrency());
        System.out.println(((NationalBankPublisher) publisher).getlKZUSCurrency()+"->"+((NationalBankPublisher) publisher).getKZUSCurrency());
        System.out.println(((NationalBankPublisher) publisher).getlRUUSDCurrency()+"->"+((NationalBankPublisher) publisher).getRUUSDCurrency());
        System.out.println("Currency changed!");
    }
}
