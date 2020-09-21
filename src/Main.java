public class Main {
    public static void main(String[] args) {
    Publisher nationalBank=new NationalBankPublisher();
    Subscriber bank= new LastyBank();
    Subscriber bank2=new LastyBank();
    nationalBank.addSubscriber(bank);
    nationalBank.addSubscriber(bank2);
    ((NationalBankPublisher)nationalBank).setCurrencyChanged(false);
    ((NationalBankPublisher)nationalBank).setKZRUCurrency(6);
    }
}
