public class D6J5 {
    public static void main(String[] args) {
        //repeat
        String repeated = "Azzam ".repeat(3);
        System.out.println("repeat(): " + repeated);

        //trim vs strip
        String str= "  \t  Hello  \u2005";
        System.out.println("\nstrip(): '" + str.strip() + "'");
        System.out.println("trim(): '" + str.trim() + "'");

        //isBlank
        String empty = "   ";
        System.out.println("\nisBlank(): " + empty.isBlank());
        System.out.println("isEmpty(): " + empty.isEmpty());

        //indent
        String text = "Azzam\nShivam\nSatwik";
        System.out.println("\nindent(12):\n" + text.indent(12));

        //transform
        String transformed = "azzam".transform(s -> s.substring(0, 1).toUpperCase() + s.substring(1));
        System.out.println("\ntransformed string: " + transformed);  //

        //stripIndent
        String message ="""
              hello
                   my
                      world
                   of
              peoples
              """;
        System.out.println("\nstripIndent():\n" + message.stripIndent());

        // translateEscapes()
        String withEscapes = "Tab\\tNewline\\n";
        System.out.println("\ntranslateEscapes(): " + withEscapes.translateEscapes());

        String string = """
            {
                "name": "Azzam",
                "age": 22
            }
            """;
        System.out.println("\nText block:\n" + string);

        //formatted()
        String details = "Name: %s, Age: %d";System.out.println("\nformatted(): " + details.formatted("Satwik", 23));

    }
}