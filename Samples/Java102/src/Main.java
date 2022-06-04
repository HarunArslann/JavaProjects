
public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Harun", "Arslan","1", "Istanbul",70);
        Student st2 = new Student("Nihal", "Arslan","2", "Bandirma",80);
        Student st3 = new Student("Hakan", "Surmeli","3", "Kars",70);

        Instructor teacher = new Instructor("Mahmut", "Hoca", "CENG");

        Course mat = new Course("MAT101", "MAT", teacher);

        Student[] st = {st1,st2,st3};

        System.out.println("Ortalama : " + mat.calcAverage(st));

    }
}