public class Park {
    private String name;


    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
        }
    }

    public static void main(String[] args) {

        Park park = new Park("Парк Горького");

        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 300);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "10:00 - 23:00", 500);
        Park.Attraction attraction3 = park.new Attraction("Комната страха", "12:00 - 20:00", 200);

        attraction1.printInfo();
        System.out.println();
        attraction2.printInfo();
        System.out.println();
        attraction3.printInfo();
    }
}
