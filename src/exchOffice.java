import java.text.SimpleDateFormat;
import java.util.Date;

public class exchOffice implements Subscriber {
    @Override
    public void update(Publisher publisher) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        if (((NationalBankPublisher) publisher).getlKZRUCurrency() != ((NationalBankPublisher) publisher).getKZRUCurrency()) {
            System.out.println("KZ-RU:" + ((NationalBankPublisher) publisher).getlKZRUCurrency() + "->" + ((NationalBankPublisher) publisher).getKZRUCurrency()+" "+formatter.format(date));
            System.out.println("Currency changed!");
        }
        if (((NationalBankPublisher) publisher).getlKZUSCurrency() != ((NationalBankPublisher) publisher).getKZUSCurrency()){
            System.out.println("KZ-US:" + ((NationalBankPublisher) publisher).getlKZUSCurrency() + "->" + ((NationalBankPublisher) publisher).getKZUSCurrency()+" "+formatter.format(date));
            System.out.println("Currency changed!");
        }
        if(((NationalBankPublisher) publisher).getlRUUSDCurrency()!=((NationalBankPublisher) publisher).getRUUSDCurrency()){
            System.out.println("RU-US:"+((NationalBankPublisher) publisher).getlRUUSDCurrency()+"->"+((NationalBankPublisher) publisher).getRUUSDCurrency()+" "+formatter.format(date));
            System.out.println("Currency changed!");
        }
        System.out.println();
    }
}
