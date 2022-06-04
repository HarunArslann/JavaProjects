public class Main {
    public static void main(String[] args) {

        char harf = 'N';

        switch (harf) {
            case 'A':
                System.out.println(harf + " kalın sesli harftir.");
                break;
            case 'E':
                System.out.println(harf + " ince sesli harftir.");
                break;
            case 'I':
                System.out.println(harf + " kalın sesli harftir.");
                break;
            case 'U':
                System.out.println(harf + " kalın sesli harftir.");
                break;
            case 'O':
                System.out.println(harf + " kalın sesli harftir.");
                break;
            case 'İ':
                System.out.println(harf + " ince sesli harftir.");
                break;
            case 'Ü':
                System.out.println(harf + " ince sesli harftir.");
                break;
            case 'Ö':
                System.out.println(harf + " ince sesli harftir.");
                break;
            default:
                System.out.println(harf + " sesli harf değildir.");
        }
    }
}