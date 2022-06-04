public abstract class BattleLoc extends Location {

    private Monster monster;

    public BattleLoc(Player player, String name, Monster monster) {
        super(player, name);
        this.monster = monster;
    }

    public void combat(Monster currentMonster) {

        while (true) {
            currentMonster.setHealth(currentMonster.getHealth() - this.getPlayer().getDamage());
            if (currentMonster.getHealth() <= 0) {
                break;
            }
            this.getPlayer().setHealth(this.getPlayer().getHealth() -
                    currentMonster.getDamage() -
                    (Math.max(0, this.getPlayer().getInventory().getArmor().getDefence() -
                            currentMonster.getDamage())));
            if (this.getPlayer().getHealth() <= 0) {
                break;
            }
        }
    }

    public int setMonsterNumber() {
        return (int) (Math.random() * 3) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

}
