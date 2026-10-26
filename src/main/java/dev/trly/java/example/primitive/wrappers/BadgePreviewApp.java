package dev.trly.java.example.primitive.wrappers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BadgePreviewApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(BadgePreviewApp.class);

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

        LOGGER.info("Badge: {}", badgeCode);
        LOGGER.info("Access: {}", accessArea);
    }
}
