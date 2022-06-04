import java.util.ArrayList;

public class Armor {
    private String name;
    private int id;
    private int defence;
    private int price;

    public Armor(String name, int id, int defence, int price) {
        this.name = name;
        this.id = id;
        this.defence = defence;
        this.price = price;
    }

    public static ArrayList<Armor> armors(){
        ArrayList<Armor> armorList = new ArrayList<>();
        armorList.add(new Armor("Hafif",1,1,15));
        armorList.add(new Armor("Orta",2,3,25));
        armorList.add(new Armor("Agir",3,5,40));

        return armorList;
    }

    public static Armor getArmorObjByID(int id){

        for(Armor armor : ToolStore.armors){
            if(armor.getId() == id){
                return armor;
            }
        }
        return null;
    }

    public static void setArmorList() {
        int index = 1;
        for(Armor armor : ToolStore.armors){
            armor.setId(index);
            index++;
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

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
