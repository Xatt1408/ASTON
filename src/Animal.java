class Pet {
    private static int totalAnimals = 0;
    protected String name;

    public Pet(String name) {
        this.name = name;
        totalAnimals++;
    }

    public void run(int distance) {}

    public void swim(int distance) {}

    public static int getTotalAnimals() {
        return totalAnimals;
    }
}

class Dog extends Pet {
    private static int totalDogs = 0;

    public Dog(String name) {
        super(name);
        totalDogs++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимальная дистанция - 500 м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. Максимальная дистанция - 10 м.");
        }
    }

    public static int getTotalDogs() {
        return totalDogs;
    }
}

class Cat extends Pet {
    private static int totalCats = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false;
        totalCats++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимальная дистанция - 200 м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (bowl.getFood() >= 10) {
            bowl.decreaseFood(10);
            this.satiety = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не хватает еды в миске.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getTotalCats() {
        return totalCats;
    }
}

class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = Math.max(0, food);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        this.food += amount;
        System.out.println("Добавлено " + amount + " еды в миску. Теперь в миске " + this.food + " еды.");
    }

    public void decreaseFood(int amount) {
        this.food = Math.max(0, this.food - amount);
    }
}

public class Animal {
    public static void main(String[] args) {
        // Создаем животных
        Dog dogBobik = new Dog("Бобик");
        Cat catMurka = new Cat("Мурка");
        Cat catVasya = new Cat("Вася");

        // Проверяем действия
        dogBobik.run(150);
        dogBobik.swim(5);

        catMurka.run(150);
        catMurka.swim(5);

        // Создаем миску с едой
        Bowl bowl = new Bowl(20);

        // Массив котов
        Cat[] cats = {catMurka, catVasya};

        // Все коты пытаются покушать
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        // Проверяем сытость котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        // Добавляем еды в миску
        bowl.addFood(10);

        // Еще раз все коты пытаются покушать
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        // Проверяем сытость котов снова
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        // Выводим общее количество животных, собак и котов
        System.out.println("Всего животных: " + Pet.getTotalAnimals());
        System.out.println("Всего собак: " + Dog.getTotalDogs());
        System.out.println("Всего котов: " + Cat.getTotalCats());
    }
}