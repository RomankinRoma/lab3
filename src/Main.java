public class Main {
    public static void main(String[] args) {
    Publisher nationalBank=new NationalBankPublisher();
    Subscriber bank= new LastyBank();
    Subscriber exchOffice=new exchOffice();
    nationalBank.addSubscriber(bank);
    nationalBank.addSubscriber(exchOffice);
    ((NationalBankPublisher)nationalBank).setCurrencyChanged(false);
    ((NationalBankPublisher)nationalBank).setKZRUCurrency(6);
    ((NationalBankPublisher)nationalBank).setKZUSCurrency(400);
    ((NationalBankPublisher)nationalBank).setRUUSDCurrency(65);
    ((NationalBankPublisher)nationalBank).setRUUSDCurrency(55);
    }
}
