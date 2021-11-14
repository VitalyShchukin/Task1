class World {
    String[] arrayNames = {"Солнце", "Меркурий", "Венера", "Земля", "Марс", "Юпитер",
            "Сатурн", "Уран", "Нептун", "Плутон", "Луна", "Ио", "Титан", "Тачка", "Пушка", "Гонка", "Пуля",
            "Молния", "Идеал", "Пушинка"}; //array of 20 names

    public String getName(int i) {

        return arrayNames[i];
    }

    public int getSpeed() {
        return (51 + (int) (Math.random() * 49)); //start car speed- random (50;100)
    }

    public int getAcceleration() {
        return (1 + (int) (Math.random() * 19)); //start acceleration of car- random (0;20)
    }
    int getFinSpd(int spd, int acc, int time) {
        System.out.print("Скорость автомобиля- " + (spd + (acc * time)) + " с именем");
        return (spd + (acc * time));
    }
}