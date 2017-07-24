package com.sierisimo.wizeline.di.basic.constructor.credit;

import com.sierisimo.wizeline.di.basic.constructor.db.SQLiteDataBase;
import com.sierisimo.wizeline.di.basic.constructor.sync.ServiceSync;

public class CreditCardProcessor {
    private SQLiteDataBase sqLiteDataBase;
    private ServiceSync serviceSync;

    public CreditCardProcessor(SQLiteDataBase sqLiteDataBase, ServiceSync serviceSync) {
        this.sqLiteDataBase = sqLiteDataBase;
        this.serviceSync = serviceSync;
    }

    public SQLiteDataBase getSqLiteDataBase() {
        return sqLiteDataBase;
    }

    public ServiceSync getServiceSync() {
        return serviceSync;
    }
}
