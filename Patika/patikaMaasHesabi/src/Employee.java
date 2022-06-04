public class Employee {

    String name;
    int salary;
    int workHour;
    int hireYear;

    Employee(String name, int salary, int workHour, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary < 1000){
            return 0;
        }else{

            return this.salary*0.03;
        }
    }

    double bonus(){
        if(this.workHour < 40){
            return 0;
        }else{
            return (this.workHour-40)*30;
        }
    }

    double raiseSalary(){

        int workYear = 2021 - this.hireYear;
        if(workYear < 10){
            return this.salary*0.05;
        }else if(workYear < 20){
            return this.salary*0.1;
        }else{
            return this.salary*0.15;
        }
    }

    void toStringEmployer(){
        System.out.println("Maas : " + this.salary + "\n" +
                "Calisma Saati : " + this.workHour + "\n" +
                "Baslangic Yili : " + this.hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maas Artisi : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslarla Birlikte Maas : " + (this.salary+bonus()-tax()) + "\n" +
                "Toplam Maas : " + Math.max((this.salary+bonus()-tax()),this.salary+raiseSalary()));
    }
}
