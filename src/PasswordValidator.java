public class PasswordValidator {
    private PasswordValidator() {
    }

    public static void validatePassword(String pwd) {
        if (pwd == null) {
            throw new IllegalArgumentException("Password is never null");
        }
        if (pwd.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }
        boolean hasDigit = false;
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isDigit(pwd.charAt(i))) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password must contain at least one digit");
        }
    }

    public static void main(String[] args) {
        validatePassword("1231");
//        validatePassword("adasdasda");
    }
}
