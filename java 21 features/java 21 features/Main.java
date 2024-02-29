class Main {
    public static void main(String[] args) {
        System.out.println("Program started");

        int a = 12;
        int b = 14;
        System.out.println(STR."Value of a is \{a}");
        System.out.println(STR."Value of b is \{b}");

        String title = "Contact Page";
        String heading = "Welcome to programming world";
        String body = "Hello, please do attend classes regularly ";

        String html = STR."""
                <html>
                <head>
                <title>\{title}</title>
                </head>
                <body>
                <header>\{heading}</header>
                <p>\{body}</p>
                </body>
                </html>
                """;
        System.out.println(html);

        try {
            // double d = 100 / 0;
            double d = 100 / 5;
            System.out.println(d);
        } catch (Exception _) {
            System.out.println("ERROR");
        }
    }
}