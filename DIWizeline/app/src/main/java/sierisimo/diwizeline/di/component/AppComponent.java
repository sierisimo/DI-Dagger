package sierisimo.diwizeline.di.component;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import sierisimo.diwizeline.MainActivity;
import sierisimo.diwizeline.di.module.AppModule;
import sierisimo.diwizeline.di.module.CryptoCoinApiModule;

/**
 * Created by sierisimo on 7/27/17.
 */

@Component(modules = {AppModule.class, CryptoCoinApiModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);

    SharedPreferences getSharedPrefs();


}
