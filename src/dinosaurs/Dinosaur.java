
import java.util.ArrayList;
import java.util.HashMap;

public class Dinosaur {

    private final String name; // Имя динозавра
    private final int age; // Возраст динозавра
    private final String species; // Вид динозавра
    private final String liveOn; // Среда обитания (на суше, в воде и т.д.)
    private final String mainFoodSource; // Основной источник питания
    private final String favoriteFood; // Любимая еда
    private final String enclosure; // Загон, где содержится динозавр
    private final ArrayList<String> vaccinations; // Список прививок

    // Конструктор
    public Dinosaur(String name, int age, String species, String liveOn, String mainFoodSource, String favoriteFood, String enclosure, ArrayList<String> vaccinations) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.liveOn = liveOn;
        this.mainFoodSource = mainFoodSource;
        this.favoriteFood = favoriteFood;
        this.enclosure = enclosure;
        this.vaccinations = vaccinations;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public String getLiveOn() {
        return liveOn;
    }

    public String getMainFoodSource() {
        return mainFoodSource;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public ArrayList<String> getVaccinations() {
        return vaccinations;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Dinosaur{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", liveOn='" + liveOn + '\'' +
                ", mainFoodSource='" + mainFoodSource + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", enclosure='" + enclosure + '\'' +
                ", vaccinations=" + vaccinations +
                '}';
    }

    // Метод equals для сравнения объектов по имени
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Dinosaur dinosaur = (Dinosaur) obj;

        return name.equals(dinosaur.name);
    }

    // Основной метод main для демонстрации работы
    public static void main(String[] args) {
        // Создаём списки прививок
        ArrayList<String> vaccinations1 = new ArrayList<>();
        vaccinations1.add("Бешенство");
        vaccinations1.add("Столбняк");

        ArrayList<String> vaccinations2 = new ArrayList<>();
        vaccinations2.add("Грипп");
        vaccinations2.add("Гепатит");

        // Создаём объекты Dinosaur
        Dinosaur marjukka = new Dinosaur("Марьюкка", 83, "Тираннозавр", "Суша", "Мясо", "Пауки", "Загон A", vaccinations1);
        Dinosaur kaarlo = new Dinosaur("Каарло", 155, "Стегозавр", "Суша", "Растения", "Листья", "Загон B", vaccinations2);

        // Храним динозавров в HashMap
        HashMap<Integer, Dinosaur> dinosaurs = new HashMap<>();
        dinosaurs.put(1, marjukka);
        dinosaurs.put(2, kaarlo);

        // Выводим информацию о динозаврах
        System.out.println(dinosaurs.get(1));
        System.out.println(dinosaurs.get(2));
    }
}
