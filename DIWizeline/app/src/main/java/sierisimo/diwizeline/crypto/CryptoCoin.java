package sierisimo.diwizeline.crypto;

/**
 * Created by sierisimo on 7/27/17.
 */

public class CryptoCoin {
    private long value;
    private int photo;
    private String name;

    public CryptoCoin() {
        name = "BitCoin";
    }

    public long getValue() {
        return value;
    }

    public int getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }
}
