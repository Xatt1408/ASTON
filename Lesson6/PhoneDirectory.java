import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (!directory.containsKey(lastName)) {
            directory.put(lastName, new ArrayList<>());
        }
        directory.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "+7-999-999-99-99");
        phoneDirectory.add("Алексеев", "+7-999-999-88-88");
        phoneDirectory.add("Иванов", "+7-999-999-77-77");
        phoneDirectory.add("Иванов", "+7-999-999-66-66");
        phoneDirectory.add("Петров", "+7-999-999-55-55");
        phoneDirectory.add("Петров", "+7-999-999-44-44");


        System.out.println("Иванов: " + phoneDirectory.get("Иванов"));
        System.out.println("Петров: " + phoneDirectory.get("Петров"));
        System.out.println("Алексеев: " + phoneDirectory.get("Алексеев"));
    }
}
