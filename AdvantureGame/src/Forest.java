public class Forest extends BattleLoc{

    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "Odun");
    }

    @Override
    public boolean onLocation() {

        return combatActions(new Vampire(),this);
    }
}
