package android.weatherreport.com.weatherreport.db;

import org.litepal.crud.DataSupport;

/**
 * Created by sivanliu on 2016/12/27.
 */

public class Conuntry extends DataSupport {

    private int id;
    //县的名字
    private String countyName;
    //天气的id
    private String weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
