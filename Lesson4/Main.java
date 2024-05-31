abstract class Animal {

    private static int count;

    public Animal() {
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}

class Cat extends Animal {

    private String name;
    private static int count;
    private boolean full;

    public Cat(String name) {
        super();
        this.name = name;
        this.full = false; // Коты изначально голодные
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    public boolean isFull() {
        return full;
    }

    public String getName() {
        return name;
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (foodAmount <= 0) {
            System.out.println(name + " не может есть отрицательное количество еды!");
            return;
        }
        if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            full = true;
            System.out.println(name + " съел(а) " + foodAmount + " еды и теперь сыт(а).");
        } else {
            System.out.println(name + " не хватает еды, чтобы наесться.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 200) {
            System.out.println(name + " пробежал(а) " + distance + " м");
        } else if (distance < 0) {
            System.out.println("Расстояние не может быть отрицательным!");
        } else {
            System.out.println(name + " не может пробежать такое большое расстояние!");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }
}

class Dog extends Animal {

    private String name;
    private static int count;

    public static int getCount() {
        return count;
    }

    public Dog(String name) {
        super();
        this.name = name;
        count += 1;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 500) {
            System.out.println(name + " пробежал(а) " + distance + " м");
        } else if (distance < 0) {
            System.out.println("Расстояние не может быть отрицательным!");
        } else {
            System.out.println(name + " не может пробежать такое большое расстояние!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 0 && distance <= 10) {
            System.out.println(name + " проплыл(а) " + distance + " м");
        } else if (distance < 0) {
            System.out.println("Расстояние не может быть отрицательным!");
        } else {
            System.out.println(name + " не может проплыть такое большое расстояние!");
        }
    }
}

class Bowl {
    private int food;

    public Bowl(int food) {
        if (food < 0) {
            this.food = 0;
        } else {
            this.food = food;
        }
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount > 0 && food >= amount) {
            food -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cat("Барсик");
        Animal a2 = new Dog("Джек");
        Animal a3 = new Cat("Мурка");
        Animal a4 = new Dog("Райан");

        a1.run(201);
        a1.swim(10);

        System.out.println("---------");

        a2.run(501);
        a2.swim(10);

        System.out.println("---------");

        a3.run(150);
        a3.swim(150);

        System.out.println("---------");

        a4.run(150);
        a4.swim(11);

        System.out.println("---------");

        System.out.println("Количество созданных животных: " + Animal.getCount());
        System.out.println("Количество созданных собак: " + Dog.getCount());
        System.out.println("Количество созданных котов: " + Cat.getCount());

        System.out.println("---------");

        Bowl bowl = new Bowl(39); // Создаем миску с 50 единицами еды
        Cat[] cats = {new Cat("Барсик"), new Cat("Мурка")};

        for (Cat cat : cats) {
            cat.eat(bowl, 20); // Каждый кот пытается съесть 20 единиц еды
        }

        System.out.println("---------");

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
    }
}