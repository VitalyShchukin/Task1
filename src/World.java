class World {
    String arrayNames[] = {"Солнце", "Меркурий", "Венера", "Земля", "Марс", "Юпитер",
            "Сатурн", "Уран", "Нептун", "Плутон", "Луна", "Ио", "Титан", "Тачка", "Пушка", "Гонка", "Пуля",
            "Молния", "Идеал", "Пушинка"}; //array of N=20 names
    int n = (int) (Math.random() * arrayNames.length);

    String Name() {
        return arrayNames[n]; //name of car random
    }
}
