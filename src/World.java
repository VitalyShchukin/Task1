class World {
    String[] arrayNames = {"Солнце", "Меркурий", "Венера", "Земля", "Марс", "Юпитер",
            "Сатурн", "Уран", "Нептун", "Плутон", "Луна", "Ио", "Титан", "Тачка", "Пушка", "Гонка", "Пуля",
            "Молния", "Идеал", "Пушинка"}; //array of 20 names

    String getName(int i) {
        return arrayNames[i];
    }

    int getSpd() {
        return (51 + (int) (Math.random() * 49)); //start car speed- random (50;100)
    }

    int getAcc() {
        return (1 + (int) (Math.random() * 19)); //start acceleration of car- random (0;20)
    }
}