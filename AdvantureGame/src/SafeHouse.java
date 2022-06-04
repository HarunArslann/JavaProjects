public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Guvenli Ev");
    }

    @Override
    public boolean onLocation() {
        switch (getPlayer().getCharName()) {
            case "Samuray" -> getPlayer().setHealth(21);
            case "Okcu   " -> getPlayer().setHealth(18);
            case "Sovalye" -> getPlayer().setHealth(24);
        }

        System.out.println("Guvenli Evdesiniz. Caniniz yenilendi.");
        return true;
    }
}
