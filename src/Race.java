class Race {
    public static void main(String[] args) {
        int finishSpeed = 100; //скорость на финише по условиям задания
        int N = 4; //указать количество участников заезда

        String arrayNames[] = {"Солнце", "Меркурий", "Венера", "Земля", "Марс", "Юпитер",
                "Сатурн", "Уран", "Нептун", "Плутон", "Луна", "Ио", "Титан"}; //массив имен для итерации в коллиестве N штук (сейчас 13 имён)

        int[] arraySpeeds = new int[N];//создать массив скоростей колличеством N
        for (int i = 0; i < N; i++) {
            arraySpeeds[i] = 51 + (int) (Math.random() * 49); //начальная скорость машины рандом (50;100)
        }

        int[] arrayAccelerations = new int[N];//создать массив ускорений колличеством N
        for (int i = 0; i < N; i++) {
            arrayAccelerations[i] = 1 + (int) (Math.random() * 19); // ускорение машины рандом (0;20)
        }
        System.out.println("Колличество участников заезда: " + N + " шт.");
        System.out.println("Параметры участников:");
        Car car[] = new Car[N]; //количесто автомобилей в заезде
        for (int i = 0; i < N; i++) {
            car[i] = new Car(arrayNames[i], arraySpeeds[i], arrayAccelerations[i]);
            System.out.println("Машина №" + (i + 1) + "\t- " + car[i].Name + " (нач.ск. " + car[i].Speed + "; нач.уск " + car[i].Acceleration + ")");
        }
        System.out.println("\n" + "Старт заезда. Набор скоростей до " + finishSpeed + "..........");

        boolean isFinished = false;
        while (!isFinished) {
            for (int i = 0; i < N; i++) {
                car[i].Speed += car[i].Acceleration; //набор скорости
                if (car[i].Speed > finishSpeed) isFinished = true;
//                System.out.println("№"+i+" "+car[i].Name + " скор. " + car[i].Speed);
            }
        }
        System.out.println("\n" + "Финиш.\nРезультаты:");
        for (int i = 0; i < N; i++) {
            System.out.println("Машина №" + (i + 1) + "\t- " + car[i].Name + " (Скорость на финише " + car[i].Speed + ")");
        }
    }
}



