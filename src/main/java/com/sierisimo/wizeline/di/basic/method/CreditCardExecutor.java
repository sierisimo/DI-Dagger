package com.sierisimo.wizeline.di.basic.method;

import com.sierisimo.wizeline.di.basic.method.credit.CreditCardProcessor;
import com.sierisimo.wizeline.di.basic.method.db.SQLiteDataBase;
import com.sierisimo.wizeline.di.basic.method.sync.ServiceSync;

public class CreditCardExecutor {
    public static void executeBySetter_1() {
        CreditCardProcessor creditCardProcessor = new CreditCardProcessor();
        ServiceSync serviceSync = new ServiceSync();
        SQLiteDataBase sqLiteDataBase = new SQLiteDataBase();

        sqLiteDataBase.setUserName("sierisimo");
        sqLiteDataBase.setPassword("password123");
        sqLiteDataBase.setDomain("jdbc://sierisimo.net");
        sqLiteDataBase.setPort(5432);

        serviceSync.setUrl("https://sierisimo.net");
        serviceSync.setJsonSupported(true);
        serviceSync.setSqLiteDataBase(sqLiteDataBase);

        creditCardProcessor.setServiceSync(serviceSync);
        creditCardProcessor.setSqLiteDataBase(sqLiteDataBase);
    }

    public static void executreBySetter_2(){
        CreditCardProcessor creditCardProcessor = new CreditCardProcessor();

        SQLiteDataBase sqLiteDataBase = new SQLiteDataBase();

        ServiceSync serviceSync = new ServiceSync();
        serviceSync.setUrl("https://sierisimo.net");
        serviceSync.setJsonSupported(true);
        serviceSync.setSqLiteDataBase(sqLiteDataBase);

        sqLiteDataBase.setUserName("sierisimo");
        sqLiteDataBase.setPassword("password123");
        sqLiteDataBase.setDomain("jdbc://sierisimo.net");
        sqLiteDataBase.setPort(5432);

        creditCardProcessor.setServiceSync(serviceSync);
        creditCardProcessor.setSqLiteDataBase(sqLiteDataBase);
    }
}
