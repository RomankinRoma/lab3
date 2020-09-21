public class LastyBank implements Subscriber{

    @Override
    public void update(Publisher publisher) {
        System.out.println("KZ-RU:"+((NationalBankPublisher) publisher).getlKZRUCurrency()+"->"+((NationalBankPublisher) publisher).getKZRUCurrency());
        System.out.println("KZ-US:"+((NationalBankPublisher) publisher).getlKZUSCurrency()+"->"+((NationalBankPublisher) publisher).getKZUSCurrency());
        System.out.println("RU-US:"+((NationalBankPublisher) publisher).getlRUUSDCurrency()+"->"+((NationalBankPublisher) publisher).getRUUSDCurrency());
        System.out.println("Currency changed!");
    }
}
