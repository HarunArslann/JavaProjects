import java.util.Scanner;

public class Main {
    public class Shape{
        int length;
        int breadth;

        public Shape(int length, int breadth){
            this.length = length;
            this.breadth = breadth;
        }

        public void area(){
            System.out.println(this.length + " " + this.breadth);
        }


    }
    public class Rectangle extends Shape{

        public Rectangle(int length, int breadth) {
            super(length, breadth);
        }

        @Override
        public void area(){
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine().split());

    }
}