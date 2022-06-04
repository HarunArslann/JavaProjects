import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private final Scanner input = new Scanner(System.in);

    public Player(String name) {

        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){

        GameChar[] charList = {new Samurai(),new Archer(), new Knight()};

        System.out.println("==================================KARAKTERLER==================================");
        for(GameChar gameChar : charList){
            System.out.println("Karakter : " + gameChar.getName() +
                    "\t ID : " + gameChar.getId() +
                    "\t\t Hasar : " + gameChar.getDamage() +
                    "\t\t Saglik : " + gameChar.getHealth() +
                    "\t\t Para : " + gameChar.getMoney());
        }

        System.out.print("Lutfen bir karakter seciniz (ID) : ");
        int select = input.nextInt();

        switch (select) {
            case 1 -> initPlayer(new Samurai());
            case 2 -> initPlayer(new Archer());
            case 3 -> initPlayer(new Knight());
            default -> System.out.println("Gecersiz karakter!!");
        }

    }

    public void initPlayer(GameChar gameChar){

        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());

    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void printInfo(){
        System.out.println("< Silahiniz : " + this.getInventory().getWeapon().getName() +
                ", Zirhiniz : " + this.getInventory().getArmor().getName() + " (" + this.getInventory().getArmor().getDefence() + ")" +
                ", Hasariniz : " + this.getDamage() +
                ", Sagliginiz : " + this.getHealth() +
                ", Paraniz : " + this.getMoney() + " >");
    }
}
