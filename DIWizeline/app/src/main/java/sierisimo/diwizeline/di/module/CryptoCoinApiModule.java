package sierisimo.diwizeline.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import sierisimo.diwizeline.api.CryptoCoinApi;

/**
 * Created by sierisimo on 7/27/17.
 */

@Module
public class CryptoCoinApiModule {
    @Provides
    @Singleton
    public CryptoCoinApi provideCryptoCoinApi() {
        return new CryptoCoinApi();
    }
}
