package com.sierisimo.wizeline.di.basic.method.credit;

import com.sierisimo.wizeline.di.basic.method.db.SQLiteDataBase;
import com.sierisimo.wizeline.di.basic.method.sync.ServiceSync;

public class CreditCardProcessor {
    private SQLiteDataBase sqLiteDataBase;
    private ServiceSync serviceSync;

    public SQLiteDataBase getSqLiteDataBase() {
        return sqLiteDataBase;
    }

    public void setSqLiteDataBase(SQLiteDataBase sqLiteDataBase) {
        this.sqLiteDataBase = sqLiteDataBase;
    }

    public ServiceSync getServiceSync() {
        return serviceSync;
    }

    public void setServiceSync(ServiceSync serviceSync) {
        this.serviceSync = serviceSync;
    }
}
