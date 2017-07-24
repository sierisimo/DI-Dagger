package com.sierisimo.wizeline.di.basic.constructor;

import com.sierisimo.wizeline.di.basic.constructor.credit.CreditCardProcessor;
import com.sierisimo.wizeline.di.basic.constructor.db.SQLiteDataBase;
import com.sierisimo.wizeline.di.basic.constructor.sync.ServiceSync;

public class CreditCardExecutor {
    public static void executeByConstructor_wontCompile() {
//        SQLiteDataBase sqLiteDataBase = new SQLiteDataBase();

//        ServiceSync serviceSync = new ServiceSync();

//        CreditCardProcessor creditCardProcessor = new CreditCardProcessor();
    }

    public static void executeByConstructor_good() {
        SQLiteDataBase sqLiteDataBase = new SQLiteDataBase("sierisimo",
                "asdf123",
                "jdbc://sierisimo.net",
                5432);

        ServiceSync serviceSync = new ServiceSync(sqLiteDataBase, "https://sierisimo.net");

        CreditCardProcessor creditCardProcessor = new CreditCardProcessor(sqLiteDataBase, serviceSync);
    }
}
