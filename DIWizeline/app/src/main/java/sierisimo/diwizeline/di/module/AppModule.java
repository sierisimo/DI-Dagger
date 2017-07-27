package sierisimo.diwizeline.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import sierisimo.diwizeline.BuildConfig;

/**
 * Created by sierisimo on 7/27/17.
 */

@Module
public class AppModule {

    private Context appContext;

    public AppModule(@NonNull Context appContext) {
        this.appContext = appContext;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return appContext;
    }

    @Provides
    @Singleton
    public SharedPreferences providePreferences() {
        return appContext.getSharedPreferences(BuildConfig.SP_NAME, Context.MODE_PRIVATE);
    }
}
