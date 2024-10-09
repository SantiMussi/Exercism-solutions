class SqueakyClean {
    static String clean(String identifier) {
        //Replace spaces with underscores
        identifier = identifier.replace(" ", "_");

        //Convert kebab-case to camelCase
        String[] parts = identifier.split("-");
        StringBuilder camelCase = new StringBuilder(parts[0]); // Start with the first part
        for (int i = 1; i < parts.length; i++) {
            if (parts[i].length() > 0) {
                camelCase.append(Character.toUpperCase(parts[i].charAt(0)));
                camelCase.append(parts[i].substring(1).toLowerCase());
            }
        }
        identifier = camelCase.toString();

        //Convert leetspeak to normal text
        identifier = identifier.replace('4', 'a')
                .replace('3', 'e')
                .replace('0', 'o')
                .replace('1', 'l')
                .replace('7', 't');

        //Omit characters that are not letters or underscores
        return identifier.replaceAll("[^a-zA-Z_]", "");
    }
}
