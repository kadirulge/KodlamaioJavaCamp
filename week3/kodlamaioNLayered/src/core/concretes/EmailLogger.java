package core.concretes;

import core.abstracts.Logger;

public class EmailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Email loglandı!");

    }
}
