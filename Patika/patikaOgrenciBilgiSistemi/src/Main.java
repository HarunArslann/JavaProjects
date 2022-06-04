public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK","507");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO","500");

        Course tarih = new Course("Tarih" , "101", "TRH", 0.5);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","FZK",0.2);
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101","BIO",0.3);
        biyo.addTeacher(t3);

        Student s1 = new Student("Inek Saban","123","4th", tarih, fizik, biyo);
        s1.addBulkExamNote(100,100,50,100,60,60);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", "124", "4th",tarih, fizik, biyo);
        s2.addBulkExamNote(50,30,50,100,40,80);
        s2.isPass();



    }
}