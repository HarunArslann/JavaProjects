import java.util.*;

public class Main {

    private static ArrayList<Team> teams = new ArrayList<>();
    private static final HashMap<Integer,ArrayList<Match>> round = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Lutfen eklemek istediniz takim sayisini giriniz : ");
        int teamNumbers = input.nextInt();

        System.out.println("Simdi takimlari alt alta yazabilirsiniz.");

        addTeams(teamNumbers);

        for(int i = 1 ; i <= (teams.size() - 1) ; i++){

            round.put(i,createFixture());

        }

        for(Integer key : round.keySet()){
            System.out.println(key + ". Hafta Maclari");
            for(int i = 0 ; i < teams.size() / 2 ; i++){
                System.out.println(round.get(key).get(i).getName());
            }
        }
    }

    public static ArrayList<Match> createFixture(){

        ArrayList<Match> weekFirstPeriod = new ArrayList<>();

        for(int i = 0 ; i < (teams.size() / 2) ; i++){

            weekFirstPeriod.add(new Match(teams.get(i*2),teams.get(i*2+1)));

        }

        teams.add(teams.get(0));
        teams.remove(0);

        return weekFirstPeriod;

    }

    public static void addTeams(int number){

        input.nextLine();
        for(int i = 0 ; i < number ; i++){
            String teamName = input.nextLine();
            teamName = teamName.replaceFirst(String.valueOf(teamName.charAt(0)),String.valueOf(teamName.charAt(0)).toUpperCase());
            teams.add(new Team(teamName));
        }

        if(number % 2 != 0){
            teams.add(new Team("Bay"));
        }
    }
}