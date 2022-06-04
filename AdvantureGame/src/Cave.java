public class Cave extends BattleLoc{

    public Cave(Player player) {
        super(player, "Magara", new Zombie(),"Yemek");
    }

    @Override
    public boolean onLocation() {

        return combatActions(new Zombie(),this);
    }
}
