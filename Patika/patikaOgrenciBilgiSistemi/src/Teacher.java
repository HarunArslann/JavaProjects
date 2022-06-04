public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String brunch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = brunch;

    }
    void print(){
        System.out.println("Adi : " + this.name);
        System.out.println("Telefon no : " + this.mpno);
        System.out.println("Bolumu : " + this.branch);
    }
}
