package com.sierisimo.wizeline.di.basic.method;

import com.sierisimo.wizeline.di.basic.method.setters.credit.CreditCardProcessor;
import com.sierisimo.wizeline.di.basic.method.setters.db.SQLiteDataBase;
import com.sierisimo.wizeline.di.basic.method.setters.sync.ServiceSync;

public class SingleMethodExecutor {
    public static void noDependenciesAsked(CreditCardProcessor creditCardProcessor) {
        SQLiteDataBase dataBase = creditCardProcessor.getSqLiteDataBase();
        ServiceSync serviceSync = creditCardProcessor.getServiceSync();

        // Do amazing stuff...
    }

    public static void dependenciesAsked(SQLiteDataBase sqLiteDataBase, ServiceSync serviceSync) {
        //Just do the amazing stuff...
    }
}
