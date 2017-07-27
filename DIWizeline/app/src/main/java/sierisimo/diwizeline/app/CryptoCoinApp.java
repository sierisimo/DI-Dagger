package sierisimo.diwizeline.app;

import android.app.Application;

import sierisimo.diwizeline.di.component.AppComponent;
import sierisimo.diwizeline.di.component.DaggerAppComponent;
import sierisimo.diwizeline.di.module.AppModule;

/**
 * Created by sierisimo on 7/27/17.
 */

public class CryptoCoinApp extends Application {
    protected static CryptoCoinApp instance;

    public static CryptoCoinApp get() {
        return instance;
    }

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
