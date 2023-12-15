import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    private Map<String, String> userDatabase = new HashMap<>();

    public void registerUser(String username, String password) {
        if (!userDatabase.containsKey(username)) {
            userDatabase.put(username, password);
            System.out.println("Реєстрація пройшла успішно.");
        } else {
            System.out.println("Користувач з таким ім'ям вже існує.");
        }
    }

    public boolean loginUser(String username, String password) {
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            System.out.println("Вхід успішний. Ласкаво просимо, " + username + "!");
            return true;
        } else {
            System.out.println("Помилка входу. Перевірте логін та пароль.");
            return false;
        }
    }

    public static void first(String[] args) {
        main authenticationSystem = new main();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть логін:");
        String username = scanner.nextLine();

        System.out.println("Введіть пароль:");
        String password = scanner.nextLine();

        authenticationSystem.registerUser(username, password);

        System.out.println("Введіть логін для входу:");
        String loginUsername = scanner.nextLine();

        System.out.println("Введіть пароль для входу:");
        String loginPassword = scanner.nextLine();

        authenticationSystem.loginUser(loginUsername, loginPassword);

        scanner.close();
    }
}
