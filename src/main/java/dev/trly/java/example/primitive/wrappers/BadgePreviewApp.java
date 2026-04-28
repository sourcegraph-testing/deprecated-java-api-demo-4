package dev.trly.java.example.primitive.wrappers;

public final class BadgePreviewApp {
    private BadgePreviewApp() {
    }

    public static void main(String[] args) {
        final Character[] initials = {
            new Character('N'),
            new Character('K')
        };
        final Character hall = new Character('B');
        final Boolean priorityAccess = new Boolean(true);

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
