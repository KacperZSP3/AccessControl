import java.util.Scanner;

public class AccessControl {

    private static final int ADMIN_CODE = 1234;
    private static final int USER_CODE = 5678;

    public static boolean isAdmin(int code) {
        return code == ADMIN_CODE;
    }

    public static boolean isUser(int code) {
        return code == USER_CODE;
    }

    public static boolean hasAccess(int code) {
        return isAdmin(code) || isUser(code);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź kod dostępu: ");
        int accessCode = scanner.nextInt();

        if (hasAccess(accessCode)) {
            if (isAdmin(accessCode)) {
                System.out.println("Dostęp przyznany: Administrator.");
            } else if (isUser(accessCode)) {
                System.out.println("Dostęp przyznany: Zwykły użytkownik.");
            }
        } else {
            System.out.println("Dostęp zabroniony.");
        }
    }
}