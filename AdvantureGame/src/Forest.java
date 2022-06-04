public class Forest extends BattleLoc{

    public static final String firewood = "Odun";

    public Forest(Player player) {
        super(player, "Orman", new Vampire());
    }

    @Override
    public boolean onLocation() {

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
                combat(new Vampire());
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
                    getPlayer().setMoney(getPlayer().getMoney() + getMonster().getCoin());
                    getPlayer().printInfo();
                }else{
                    System.out.println("Tebrikler " + getMonster().getCoin() + " coin kazandin.");
                    System.out.println("Birini hallettin. Kaldi " + number + " " + getMonster().getName());
                    System.out.println("Helal sana. Hepsini hakladin!!!");
                    getPlayer().setMoney(getPlayer().getMoney() + getMonster().getCoin());
                    System.out.println("Ganimet elde edildi --> " + firewood);
                    System.out.println();
                    getPlayer().getInventory().setFirewood(true);
                }
            }
        }
        return this.getPlayer().getHealth() > 0;
    }
}
