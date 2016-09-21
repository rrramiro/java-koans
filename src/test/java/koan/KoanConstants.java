package koan;

import static org.junit.Assert.fail;

public class KoanConstants {
    private KoanConstants(){}

    public static final Object __ = new Object(){
        @Override
        public String toString() {
            return "__";
        }
    };

}
