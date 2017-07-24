package com.sierisimo.wizeline.di.basic.constructor.db;

public class SQLiteDataBase {
    private String userName;
    private String password;
    private String domain;
    private int port;

    public SQLiteDataBase(String userName, String password, String domain, int port) {
        this.userName = userName;
        this.password = password;
        this.domain = domain;
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDomain() {
        return domain;
    }

    public int getPort() {
        return port;
    }
}
