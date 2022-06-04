public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("HARUN" ,80,75, 70);
        Fighter f2 = new Fighter("HAKAN" ,120,100, 25);
        Fighter f3 = new Fighter("MEHMET" ,130,90, 35);
        Fighter f4 = new Fighter("SONER" ,100,105, 50);
        Fighter f5 = new Fighter("RAMAZAN" ,60,80, 75);
        Fighter f6 = new Fighter("YUNUS",100,80,50);
        Fighter f7 = new Fighter("KUBILAY",200,100,20);
        Fighter f8 = new Fighter("SERHAT",100,70,50);


        Match match1 = new Match(f1,f2,75,100);
        match1.run();
        Match match2 = new Match(f3,f4,75,100);
        match2.run();
        Match match3 = new Match(f5,f6,75,100);
        match3.run();
        Match match4 = new Match(f7,f8,75,100);
        match4.run();
        Match match5 = new Match(match1.whoWin(),match2.whoWin(),75,100);
        match5.run();
        Match match6 = new Match(match3.whoWin(),match4.whoWin(),75,100);
        match6.run();
        Match match7 = new Match(match5.whoWin(),match6.whoWin(),75,100);
        match7.run();
        System.out.println("Turnuva Tamamlandi. KAZANAN ---------> " + match7.whoWin().name);

    }
}