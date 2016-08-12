package gt.org.ipm.pokemongo.objects;

import android.os.Parcel;
import android.os.Parcelable;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by mercedeswyss on 11/08/16.
 */

public class City implements Parcelable {

    @Getter @Setter
    private String country;

    @Getter @Setter
    private String cityName;

    public City(String country, String cityName){
        this.country = country;
        this.cityName = cityName;
    }

    protected City(Parcel in) {
        country = in.readString();
        cityName = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(country);
        dest.writeString(cityName);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() {
        @Override
        public City createFromParcel(Parcel in) {
            return new City(in);
        }

        @Override
        public City[] newArray(int size) {
            return new City[size];
        }
    };

}
