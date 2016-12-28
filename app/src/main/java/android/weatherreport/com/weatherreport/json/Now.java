package android.weatherreport.com.weatherreport.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sivanliu on 2016/12/28.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
