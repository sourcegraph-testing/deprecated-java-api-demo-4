package dev.trly.java.example.primitive.wrappers;

public final class BadgePreviewApp {
    private BadgePreviewApp() {
    }

    public static void main(String[] args) {
        final Character[] initials = {
            Character.valueOf('N'),
            Character.valueOf('K')
        };
        final Character hall = Character.valueOf('B');
        final Boolean priorityAccess = Boolean.valueOf(true);

        final String badgeCode = "%c%c-%c12".formatted(
            initials[0].charValue(),
            initials[1].charValue(),
            hall.charValue()
        );
        final String accessArea = priorityAccess.booleanValue() ? "Priority lounge" : "Main hall";

        System.out.printf("Badge: %s%n", badgeCode);
        System.out.printf("Access: %s%n", accessArea);
    }
}
