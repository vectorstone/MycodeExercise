package com.atguigu.jdk;

import org.junit.Test;

/*
文本块
*/
public class TextBlockDemo {
    @Test
    public void testTextBlock1() {
        String s = "<html>\n" +
                "<head>\n    <charset=utf8>\n</head>\n" +
                "<body>\n    <div></div>\n" + "</body>\n" +
                "</html>";

        System.out.println(s);
    }

    @Test
    public void testTextBlock2() {
        String s = """
                <html>
                <head>
                    <charset=utf8>
                </head>
                <body>
                    <div></div>
                </body>
                </html>
                                """;
        System.out.println(s);

        String s1 = """
                hello
                """;
    }

    @Test
    public void testTextBlock3() {
        String literal = """
                人最宝贵的东西是生命，生命对人来说只有一次。\

                因此，人的一生应当这样度过：当一个人回首往事时，\

                不因虚度年华而悔恨，也不因碌碌无为而羞愧；\

                这样，在他临死的时候，能够说，\

                我把整个生命和全部精力都献给了人生最宝贵的事业\

                ——为人类的解放而奋斗。
                """;
        System.out.println(literal);
    }
}
