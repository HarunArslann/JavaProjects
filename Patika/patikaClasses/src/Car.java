public class Car {

    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed, String color){
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
    }

    int increaseSpeed(int increase){
        if((this.speed+increase) <= this.speedLimit ){
            this.speed += increase;
        }else{
            this.speed = this.speedLimit;
        }
        return this.speed;
    }

    int decreaseSpeed(int decrease){
        if((this.speed-decrease) >= 0){
            this.speed -= decrease;

        }else{
            this.speed = 0;
        }
        return this.speed;
    }

    void printSpeed(){

        System.out.println(this.model + " Hiziniz : " + this.speed);
    }
}
