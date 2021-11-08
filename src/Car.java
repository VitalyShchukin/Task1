
class Car {
    String Name; //name of car
    int Speed = 51 + (int) (Math.random() * 49); //start speed random from (50;100);
    int Acceleration = 1 + (int) (Math.random() * 19);// start acceleration from (0;20)

    Car(String Name) {
        this.Name = Name;
        }
}