class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.isEmpty()) {
            return "";
        }
        // Paso 1: Reemplazar cada espacio con un guion bajo
        String cleaned = identifier.trim().replace(" ", "_");

        // Paso 2: Eliminar caracteres especiales de los costados (excepto guiones bajos)
        cleaned = removeSpecialCharacters(cleaned);

        //Step 2: Convert kebab to camelCase
        cleaned = convertKebabToCamelCase(cleaned);

        // Step 3: Remove all non-alphanumeric characters
        cleaned = convertLeetSpeak(cleaned);

        return cleaned;
    }

    private static String removeSpecialCharacters(String input) {
        return input.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");
    }

    private static String convertKebabToCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : input.toCharArray()) {
            if (c == '-') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    private static String convertLeetSpeak(String input) {
        return input.replace('4', 'a')
                .replace('3', 'e')
                .replace('0', 'o')
                .replace('1', 'l')
                .replace('7', 't');
    }

}
