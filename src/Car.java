class Car extends World{
    int Speed() {
        return (51 + (int) (Math.random() * 49)); //start speed random from (50;100)
    }
    int Acceleration() {
        return (1 + (int) (Math.random() * 19)); //start acceleration from (0;20)
    }
}