public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1,4,6,8,23,56};
        int aranacak = 222;
        boolean mevcut = false;

        for(int sayi : sayilar){
            if(sayi == aranacak){
                mevcut = true;
                break;
            }
        }
        if (mevcut){
            System.out.println("Sayi mevcuttur.");
        }else{
            System.out.println("Sayi mevcut degildir.");
        }
    }
}