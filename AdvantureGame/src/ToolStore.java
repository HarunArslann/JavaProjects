import java.util.ArrayList;

public class ToolStore extends NormalLoc{
    public static ArrayList<Weapon> weapons = Weapon.weapons();
    public static ArrayList<Armor> armors = Armor.armors();

    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    public void menu(){

    }

    public void buy(){

    }

    @Override
    public boolean onLocation() {

        System.out.println("-------------- Magazaya hosgeldiniz! --------------");

        while (true){

            System.out.print("""
                1 - Silahlar
                2 - Zirhlar
                3 - Cikis yap
                Lutfen bir secim yapiniz :\s""");
            int selectCase = input.nextInt();

            while(selectCase < 1 || selectCase > 3){
                System.out.print("Gecersiz deger, tekrar giriniz : ");
                selectCase = input.nextInt();
            }

            switch (selectCase){
                case 1:
                    if(weapons.size() != 0){
                        printWeapon();
                        buyWeapon();
                        System.out.println("-------------- Alisverise Devam Edebilirsiniz! --------------");
                    }else{
                        System.out.println();
                        System.out.println("Maalesef elinizdekinden daha iyi bir silahimiz yok :)");
                        System.out.println();
                    }
                    break;
                case 2:
                    if(armors.size() != 0){
                        printArmor();
                        buyArmor();
                        System.out.println("-------------- Alisverise Devam Edebilirsiniz! --------------");
                    }else{
                        System.out.println();
                        System.out.println("Maalesef elinizdekinden daha iyi bir zirhimiz yok :)");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Yine bekleriz :)");
                    System.out.println();
                    return true;
            }
        }
    }
    public void printWeapon(){
        System.out.println();

        System.out.println("------------ Silahlar --------------");
        for(Weapon weapon : weapons){
            System.out.println(weapon.getId() +
                    " - " + weapon.getName() +
                    " < Hasar : " + weapon.getDamage() +
                    ", Fiyat : " + weapon.getPrice() + " >");
        }
    }

    public void buyWeapon(){

        System.out.print("Bir silah seciniz : ");
        int selectWeapon = input.nextInt();

        while(selectWeapon < 1 || selectWeapon > Weapon.weapons().size()){

            System.out.print("Gecersiz deger, tekrar giriniz : ");
            selectWeapon = input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeapon);

        if(selectedWeapon != null){
            if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Yetersiz Bakiye!!!");
                System.out.println("Bakiyeniz : " + getPlayer().getMoney());
            }else{

                System.out.println(selectedWeapon.getName() + " silahini satin aldniiz. Hayirli olsun.");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paraniz : " + this.getPlayer().getMoney());
                System.out.println();
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                weapons.remove(selectedWeapon);
                Weapon.setWeaponList();

            }
        }
    }

    public void printArmor(){
        System.out.println("Zirhlar");
        System.out.println();
        for(Armor armor : armors){
            System.out.println(armor.getId() + " - " + armor.getName() +
                    ", Savunma : " + armor.getDefence() +
                    ", Fiyat : " + armor.getPrice());
        }
    }

    public void buyArmor(){

        System.out.print("Bir zirh seciniz : ");
        int selectArmor = input.nextInt();

        while(selectArmor < 1 || selectArmor > armors.size()){

            System.out.print("Gecersiz deger, tekrar giriniz : ");
            selectArmor = input.nextInt();
        }

        Armor selectedArmor = Armor.getArmorObjByID(selectArmor);

        if(selectedArmor != null){
            if(selectedArmor.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Yetersiz Bakiye!!!");
                System.out.println("Bakiyeniz : " + getPlayer().getMoney());
            }else{

                System.out.println(selectedArmor.getName() + " silahini satin aldniiz. Hayirli olsun.");
                int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paraniz : " + this.getPlayer().getMoney());
                this.getPlayer().getInventory().setArmor(selectedArmor);
                armors.remove(selectedArmor);
                Armor.setArmorList();

            }
        }
    }

}
