import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        double price = input.nextDouble();

        System.out.print("Kart No giriniz : ");
        String cardNumber = input.next();

        System.out.print("Son kullanma tarihi giriniz : ");
        String expireDate = input.next();

        System.out.print("Guvenlik kodu giriniz : ");
        String cvc = input.next();

        System.out.println("1. A Bankasi");
        System.out.println("2. B Bankasi");
        System.out.println("3. C Bankasi");
        System.out.println("4. D Bankasi");
        System.out.print("Banka Seciniz : ");

        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                ABankasi aPos = new ABankasi("A Bankasi", "13124123", "098765");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,expireDate,cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankasi", "5435234", "1234");
                bPos.connect("127.0.1.8");
                bPos.payment(price,cardNumber,expireDate,cvc);
                break;
            default:
                System.out.println("Gecerli banka giriniz!");
        }
    }
}