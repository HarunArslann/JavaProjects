public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double coefficient;

    Course(String name, String code, String prefix, double coefficient){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
        this.coefficient = coefficient;

    }

    void addTeacher(Teacher teacher){

        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Ogretmen-Ders uyusmuyor.");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }
}
