package com.example.frederiklentjes.minder.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        addItem(createDummyItem(1, "Frederik Lentjes", "Allergie - Ausschlag und Juckreiz am Hals."));
        addItem(createDummyItem(2, "Dario Wieschebrock", "Schnittwunde - Rechter Daumen bis auf den Knochen."));
        addItem(createDummyItem(3, "Sonja Zimmermann", "Zeckenbiss - Roter Ring rundum den Biss in der Kniekehle."));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int id, String name, String content) {
        return new DummyItem(String.valueOf(id), name, content);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String name;
        public final String details;

        public DummyItem(String id, String name, String details) {
            this.id = id;
            this.name = name;
            this.details = details;
        }

        @Override
        public String toString() {
            return details;
        }
    }
}
