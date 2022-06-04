import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    private Player player;
    private Location location;

    public Game() {

    }

    public void start() {

        System.out.println("Macera oyununa hosgeldiniz.");
        System.out.print("Lutfen bir isim giriniz : ");
        String playerName = input.nextLine();
        this.player = new Player(playerName);
        System.out.println("Sayin " + player.getName() + " bu karanlik ve sisli adaya hosgeldiniz!");
        player.selectChar();

        Location location = null;

        while (true){
            if(this.player.getInventory() != null){
                if(checkInventory()){
                    System.out.println("TEBRIKLER " + player.getName() +
                            "\n" + Cave.food +
                            "\n" + Forest.firewood +
                            "\n" + River.water +
                            "\nbu 3 ganimeti toplayarak adadan kacmayi basardin.");
                    break;
                }
            }
            player.printInfo();
            System.out.println();
            System.out.println("======================= BOLGELER ======================");
            System.out.print("""
                    1 - Guvenli Ev --> Burasi sizin icin guvenli bir ev.
                    2 - Magaza     --> Silah veya zirh satin alabilirsiniz.
                    3 - Magara     --> Zombiler biraz ugrastirabilir.
                    4 - Orman      --> Burada bol miktarda vampir mecvut.
                    5 - Nehir      --> Ayilarla karsilasabilirsiniz.
                    Lutfen gitmek istediniz bolgeyi seciniz :\s""");

            int selecLoc = input.nextInt();

            System.out.println();

            location = switch (selecLoc) {
                case 1 -> new SafeHouse(player);
                case 2 -> new ToolStore(player);
                case 3 -> new Cave(player);
                case 4 -> new Forest(player);
                case 5 -> new River(player);
                default -> new SafeHouse(player);
            };

            if(!location.onLocation()){
                System.out.println("GAME OVER :(");
                break;
            }
        }
    }

    public boolean checkInventory(){
        return player.getInventory().isFirewood() && player.getInventory().isFood() && player.getInventory().isWater();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
