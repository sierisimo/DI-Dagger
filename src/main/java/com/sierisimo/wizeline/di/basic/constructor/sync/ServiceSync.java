package com.sierisimo.wizeline.di.basic.constructor.sync;

import com.sierisimo.wizeline.di.basic.constructor.db.SQLiteDataBase;

public class ServiceSync {
    private SQLiteDataBase sqLiteDataBase;

    private String url;

    private boolean jsonSupported;

    public ServiceSync(SQLiteDataBase sqLiteDataBase, String url, boolean jsonSupported) {
        this.sqLiteDataBase = sqLiteDataBase;
        this.url = url;
        this.jsonSupported = jsonSupported;
    }

    public ServiceSync(SQLiteDataBase sqLiteDataBase, String url) {
        this.sqLiteDataBase = sqLiteDataBase;
        this.url = url;
        this.jsonSupported = false;
    }

    public SQLiteDataBase getSqLiteDataBase() {
        return sqLiteDataBase;
    }

    public String getUrl() {
        return url;
    }

    public boolean isJsonSupported() {
        return jsonSupported;
    }
}
