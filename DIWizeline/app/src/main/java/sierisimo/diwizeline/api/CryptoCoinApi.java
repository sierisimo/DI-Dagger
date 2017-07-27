package sierisimo.diwizeline.api;

import android.content.Context;

import javax.inject.Inject;

import sierisimo.diwizeline.crypto.CryptoCoin;

/**
 * Created by sierisimo on 7/27/17.
 */

public class CryptoCoinApi {
    public CryptoCoin getCryptoCoinInfo(Context context) {
        return new CryptoCoin();
    }
}
