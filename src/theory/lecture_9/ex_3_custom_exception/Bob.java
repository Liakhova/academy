package theory.lecture_9.ex_3_custom_exception;

import java.io.IOException;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Bob {

    public void swim_10() throws Exception, Error {
        System.err.println("заплыли на 10м");
        swim_20();
        System.err.println("уплываем с 10м");
    }

    private void swim_20() throws APIException {
        System.err.println("заплыли на 20м");

        try {
            swim_50();
        } catch (Exception t) {
            System.err.println("акула уплывает на глубине 20м");
            throw new APIException(t.getMessage() + "  на глубине 20 метров");
        }
        System.err.println("уплываем с 20м");
    }

    private void swim_50() throws IOException {
        System.err.println("заплыли на 50м");

        throw new IOException("акула");
    }
}
