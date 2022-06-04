public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(isCheck()){
            int round = 1;
            System.out.println(f1.name + " ile " + f2.name + " karsilasmasi basliyor.");

            while(this.f1.health > 0 && this.f2.health > 0){

                System.out.println("========" + round + ". ROUND==========");

                if (whoFirst() == 1){

                    this.f2.health = f1.hit(this.f2);
                    System.out.println(this.f2.name +" sporcusunun " + this.f2.health + " cani kaldi.");

                    if(isWin()){
                        break;
                    }
                    this.f1.health = f2.hit(this.f1);
                    System.out.println(this.f1.name +" sporcusunun " + this.f1.health + " cani kaldi.");

                    if(isWin()) {
                        break;
                    }
                }else{
                    this.f1.health = f2.hit(this.f1);
                    System.out.println(this.f1.name +" sporcusunun " + this.f1.health + " cani kaldi.");
                    if(isWin()){
                        break;
                    }
                    this.f2.health = f1.hit(this.f2);
                    System.out.println(this.f2.name +" sporcusunun " + this.f2.health + " cani kaldi.");

                    if(isWin()){
                        break;
                    }
                }
                round++;
            }
            System.out.println("Karsilasma sona erdi.Kazanan --------> " + whoWin().name);

        }else{
            System.out.println("Sporcu sikletleri uygun degildir.");
        }

    }
    public boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin(){

        if(this.f1.health == 0){
            System.out.println("*********" + this.f2.name + " Kazandi*******");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println("*********" + this.f1.name + " Kazandi*******");
            return true;
        }

        return false;
    }
    public int whoFirst(){
        return (int) ((Math.random()*2) + 1);
    }

    public Fighter whoWin(){
        Fighter winner;

        if(this.f1.health == 0){
            this.f2.health = this.f2.startingHealth;
            winner = this.f2;
        }else{
            this.f1.health = this.f1.startingHealth;
            winner = this.f1;
        }

        return winner;
    }
}
