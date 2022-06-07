import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Priorities{

    private final PriorityQueue<Student> pq;

    public Priorities(){
        this.pq = new PriorityQueue<>((s1,s2)->{
            if(s1.getCgpa() - s2.getCgpa() == 0) {
                if(s1.getName().compareTo(s2.getName()) == 0) {
                    return Integer.compare(s1.getId(), s2.getId());
                }
                else {
                    return s1.getName().compareTo(s2.getName());
                }
            }
            else {
                return Double.compare(s2.getCgpa(), s1.getCgpa());
            }
        }
        );
    }

    public List<Student> getStudents(List<String> events){

        for(String event : events){
            if(event.equals("SERVED")){
                pq.poll();
            }else{
                String[] words = event.split("\\s");
                Student st = new Student(Integer.parseInt(words[3]), words[1], Double.parseDouble(words[2]));
                this.pq.add(st);
            }
        }

        ArrayList<Student> stuList = new ArrayList<>();

        while(!this.pq.isEmpty()){
            stuList.add(this.pq.poll());
        }

        return stuList;
    }
}

class Student{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}