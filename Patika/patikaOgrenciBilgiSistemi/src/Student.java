public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1,int oralNote1, int note2, int oralNote2, int note3, int oralNote3){

        if(note1 >= 0 && note1 <= 100){
            this.c1.note = (oralNote1*this.c1.coefficient) + (note1*(1-this.c1.coefficient));
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = (oralNote2*this.c2.coefficient) + (note2*(1-this.c2.coefficient));
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = (oralNote3*this.c3.coefficient) + (note3*(1-this.c3.coefficient));
        }
    }

    void printNote(){

        System.out.println(c1.name + " Notu \t:" + this.c1.note);
        System.out.println(c2.name + " Notu \t:" + this.c2.note);
        System.out.println(c3.name + " Notu \t:" + this.c3.note);
        System.out.format("Ortalamaniz \t:" + "%.2f", this.average);
        System.out.println();
        System.out.println("=====================");
    }
    void isPass(){
        this.average = (this.c1.note+this.c2.note+this.c3.note) / 3.0;

        if(this.average > 55){
            System.out.println("Sinifi basarili sekilde gectiniz.");
            this.isPass = true;
        }else{
            System.out.println("Sinifi gecemediniz.");
            this.isPass = false;
        }
        printNote();
    }
}
