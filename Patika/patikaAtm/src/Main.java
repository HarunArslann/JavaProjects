import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;
        int price;
        String brace = "------------------------";

        while (right > 0) {
            System.out.println("Kullanici adi giriniz : ");
            String userName = input.nextLine();
            System.out.println("Sifre giriniz : ");
            String password = input.nextLine();

            if (userName.equals("nihal") && password.equals("arslan")) {
                System.out.println("Merhaba, Java Bankasina Hosgeldiniz.");
                do {
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz:");
                    System.out.println("1- Para Yatirma\n" +
                            "2- Para Cekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Cikis Yap");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para miktari : ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz : " + balance);
                            System.out.println(brace);
                            break;
                        case 2:
                            System.out.println("Para miktari : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersizdir.");
                                System.out.println("Bakiyeniz : " + balance);
                                System.out.println(brace);
                            } else {
                                balance -= price;
                                System.out.println("Bakiyeniz : " + balance);
                                System.out.println(brace);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            System.out.println(brace);
                            break;
                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                            System.out.println(brace);
                            break;
                        default:
                            System.out.println("Yanlis giris yaptiniz. Tekrar deneyiniz.");
                            System.out.println(brace);
                            break;
                    }
                }while (select != 4) ;
                break;
            }else{
                right--;
                System.out.println("Hatali kullanici adi veya sifre.");
                if (right == 0) {
                    System.out.println("Hesap bloke olmustur. Lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }
        }
    }
}