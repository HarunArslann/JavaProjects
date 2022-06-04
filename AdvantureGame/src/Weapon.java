import java.util.ArrayList;

public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;



    public Weapon(String name, int id, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static ArrayList<Weapon> weapons(){
        ArrayList<Weapon> weaponsList = new ArrayList<>();
        weaponsList.add(new Weapon("Kilic",1,2,25));
        weaponsList.add(new Weapon("Tabanca",2,3,35));
        weaponsList.add(new Weapon("Tufek",3,7,45));

        return weaponsList;
    }

    public static Weapon getWeaponObjByID(int id){

        for(Weapon weapon : ToolStore.weapons){
            if(weapon.getId() == id){
                return weapon;
            }
        }
        return null;
    }

    public static void setWeaponList(){
        int index = 1;
        if(ToolStore.weapons != null){
            for(Weapon weapon : ToolStore.weapons){
                weapon.setId(index);
                index++;
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
