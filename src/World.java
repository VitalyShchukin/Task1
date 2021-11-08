class World {
    public static void main(String[] args) {

        String arrayNames[] = {"Солнце", "Меркурий", "Венера", "Земля", "Марс", "Юпитер",
                        "Сатурн", "Уран", "Нептун", "Плутон", "Луна", "Ио", "Титан"}; //array of N names (N=13)


        Car car1 = new Car(arrayNames[0]);
        Car car2 = new Car(arrayNames[1]);
        Car car3 = new Car(arrayNames[2]);

        Car arrayCars[] = {car1, car2, car3};

        System.out.println(arrayCars[0].Name+ " "+ arrayCars[0].Speed+" "+arrayCars[0].Acceleration);
        System.out.println(arrayCars[1].Name+ " "+ arrayCars[1].Speed+" "+arrayCars[1].Acceleration);
        System.out.println(arrayCars[2].Name+ " "+ arrayCars[2].Speed+" "+arrayCars[2].Acceleration);
    }
    //    int N=5;//
//    Car[] cars=new Car[N]; //array of cars
//
//    void CarW() {
//        for (int i = 0; i < N; i++) {
//            Car car[i]=new Car(car(i).ArrayNames[i], car(i).spd, car(i).acc);
//            System.out.println("Имя- " + car(1).arrayNames[1] + "; скорость- " + car(1).spd() + "; ускорение- " + car(1).acc());
//        }
//    }

//    void Cars() {
//        Car car1 = new Car();
//        return System.out.println("Имя- " + car1.arrayNames[0] + "; скорость- " + car1.spd() + "; ускорение- " + car1.acc());
//    }
//    //array of cars
////    int N=5;
////    Car ArrayCars[]=new Car[];
////    for (int i;i<N;i++) {
////        Car car[i]=new Car();
////        System.out.println(car[0].Name);}
//
}
