public class Main {
    public static void main(String[] args) {

        char grade = 'X';

        switch (grade) {
            case 'A' :
                System.out.println("Mükemmel.");
                break;
            case 'B' :
                System.out.println("Çok iyi.");
                break;
            case 'C' :
                System.out.println("Orta");
                break;
            case 'D' :
                System.out.println("Kötü");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz.");
                break;

        }
    }
}