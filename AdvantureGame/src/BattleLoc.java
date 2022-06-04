public abstract class BattleLoc extends Location {

    private String loot;

    private Monster monster;

    public BattleLoc(Player player, String name, Monster monster, String loot) {
        super(player, name);
        this.monster = monster;
        this.loot = loot;
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

    public boolean combatActions(Monster newMonster, BattleLoc loc){

        int number = setMonsterNumber();

        System.out.println("Eyvah!! Burada " + number + " tane " + getMonster().getName() + " var");
        System.out.println("Umarim hepsini halledebilirsin...");

        while(number != 0){

            System.out.println("Savas ya da Kac ( s / k ) ? ");
            String selection = input.next();

            while(!"sk".contains(selection)){
                System.out.println("Yanlis giris!! Tekrar deneyin");
                selection = input.nextLine();
            }

            if(selection.equals("s")){
                combat(newMonster);
            }else{
                System.out.println("Bu kadar korkak olma...");
                break;
            }

            if(this.getPlayer().getHealth() <= 0){
                return false;
            }else {
                number--;
                if(number > 0){
                    System.out.println("Tebrikler " + getMonster().getCoin() + " coin kazandin.");
                    System.out.println("Birini hallettin. Kaldi " + number + " " + getMonster().getName());
                    newMonster.setHealth(getMonster().getHealth());
                    getPlayer().setMoney(getPlayer().getMoney() + getMonster().getCoin());
                    getPlayer().printInfo();
                }else{
                    System.out.println("Tebrikler " + getMonster().getCoin() + " coin kazandin.");
                    System.out.println("Birini hallettin. Kaldi " + number + " " + getMonster().getName());
                    System.out.println("Helal sana. Hepsini hakladin!!!");
                    getPlayer().setMoney(getPlayer().getMoney() + getMonster().getCoin());
                    System.out.println("Ganimet elde edildi --> " + loc.getLoot());
                    System.out.println();

                    switch (loc.getName()) {
                        case "Magara" -> getPlayer().getInventory().setFood(true);
                        case "Orman" -> getPlayer().getInventory().setFirewood(true);
                        case "Nehir" -> getPlayer().getInventory().setWater(true);
                    }
                }
            }
        }
        return this.getPlayer().getHealth() > 0;
    }

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }
}
