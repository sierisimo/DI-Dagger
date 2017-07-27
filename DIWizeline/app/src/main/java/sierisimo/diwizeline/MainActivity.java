package sierisimo.diwizeline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import sierisimo.diwizeline.api.CryptoCoinApi;
import sierisimo.diwizeline.app.CryptoCoinApp;
import sierisimo.diwizeline.crypto.CryptoCoin;

public class MainActivity extends AppCompatActivity {

    @Inject
    CryptoCoinApi cryptoCoinApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CryptoCoinApp.get().getAppComponent().inject(this);

        showInfo();
    }

    private void showInfo() {
        CryptoCoin cryptoCoin = cryptoCoinApi.getCryptoCoinInfo(this);

        TextView tvName = (TextView) findViewById(R.id.tvAcName);
        tvName.setText(cryptoCoin.getName());
    }
}
