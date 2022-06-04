public class Monster {
    private String name;
    private int id;
    private int damage;
    private int health;
    private int coin;

    public Monster(String name, int id, int damage, int health, int coin) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.coin = coin;
    }

    private int obstacleNumber(){

        return 1;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
