package records;

import static java.lang.StringTemplate.STR;

public class Test {
    public static void main(String[] args) {
        int a= 12;
        int b=20;
        System.out.println(STR."value of a is \{a}");
        System.out.println(STR."value of b is \{b}");

        String title="Contact Page";
        String heading ="Welcome , to programming world";
        String body = "Hello, please do attend classes regularly ";

        String html=STR."""
                    <html>
                    <head>
                    <title>\{title}</title>
                    </head>
                     <body>
                     <h1>\{heading}</h1>
                     <p>\{body}</p>
                     </body>
                    </html>

                """;
                System.out.println(html);

                try {
                    double d = 100/0;
                    System.out.println(d);
                } catch (Exception _) {
                    System.out.println("ERROR");
                }
    }
}
