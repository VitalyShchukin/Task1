class Main {
    public static void main(String[] args) {
        int N = 3; //number of cars
        int maxSpd = 200;
        World init = new World();

        System.out.println("Количество участвующих в зведе автомобилей: " + N + " шт.");
        Car[] car = new Car[N];
        for (int i = 0; i < N; i++) {
            car[i] = new Car(init.getName(i), init.getSpd(), init.getAcc());
            System.out.println(car[i].Name + " " + car[i].Speed + " " + car[i].Acceleration);
        }
        System.out.println();

        Race startRace = new Race();

        boolean isFinished = false;
        int time = 0;
        while (!isFinished) {
            time++;
            for (int i = 0; i < N; i++) {
                if ((startRace.finSpd(car[i].Speed, car[i].Acceleration, time)) > maxSpd) isFinished = true;
                System.out.println(car[i].Name+" "+car[i].Speed+" "+time);
            }
        }

    }
}




