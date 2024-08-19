package ru.yandex.practicum.catsgram.model;

public enum SortOrder {
    ASCENDING, DESCENDING;

    // Преобразует строку в элемент перечисления
    public static SortOrder from(String order) {
        switch (order.toLowerCase()) {
            case "ascending":
            case "asc":
                return ASCENDING;
            case "descending":
            case "desc":
                return DESCENDING;
            default:
                throw new IllegalArgumentException("Invalid sort order: " + order);
        }
    }
}
