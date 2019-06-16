import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //String text = "Program ma za zadanie przyjac ciag slow, czyli dowolny tekst i skompresowac go, aby mozna bylo wyslac w okreslonej liczbie wiadomosci SMS oraz ma obliczyc koszt wyslania takich wiadomosci.";

        NaivCompressor nc = new NaivCompressor();
        Paginator p = new Paginator();
        Calculator c = new Calculator();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please write your message: ");
        String text = scanner.nextLine();

        System.out.println("Please write the price for one SMS in your country (PLN): ");
        double price = scanner.nextDouble();

        scanner.close();

        String compressedText = nc.compress(text);

        int smsAmount = p.paginate(compressedText).size();

        BigDecimal totalPrice = c.calculate(smsAmount, price);

        String decompressedText = nc.decompress(compressedText);

        System.out.println(compressedText);
        System.out.println(smsAmount);
        System.out.println(totalPrice);
        System.out.println(decompressedText);






    }
}
