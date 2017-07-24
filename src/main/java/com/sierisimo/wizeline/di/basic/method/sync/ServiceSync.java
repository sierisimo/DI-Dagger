package com.sierisimo.wizeline.di.basic.method.sync;

import com.sierisimo.wizeline.di.basic.method.db.SQLiteDataBase;

public class ServiceSync {
    private SQLiteDataBase sqLiteDataBase;

    private String url;

    private boolean jsonSupported;

    public SQLiteDataBase getSqLiteDataBase() {
        return sqLiteDataBase;
    }

    public void setSqLiteDataBase(SQLiteDataBase sqLiteDataBase) {
        this.sqLiteDataBase = sqLiteDataBase;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isJsonSupported() {
        return jsonSupported;
    }

    public void setJsonSupported(boolean jsonSupported) {
        this.jsonSupported = jsonSupported;
    }
}
