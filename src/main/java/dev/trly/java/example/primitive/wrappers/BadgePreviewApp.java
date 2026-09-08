package dev.trly.java.example.primitive.wrappers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BadgePreviewApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(BadgePreviewApp.class);

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

        LOGGER.info("Badge: {}", badgeCode);
        LOGGER.info("Access: {}", accessArea);
    }
}
