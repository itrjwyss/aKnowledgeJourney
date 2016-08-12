package gt.org.ipm.pokemongo.objects;

import android.os.Parcel;
import android.os.Parcelable;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by mercedeswyss on 11/08/16.
 */

public class Condominium implements Parcelable {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String address;

    @Getter @Setter
    private String builder;

    @Getter @Setter
    private long buildId;

    @Getter @Setter
    private City city;

    public Condominium(){

    }

    protected Condominium(Parcel in) {
        name = in.readString();
        address = in.readString();
        builder = in.readString();
        buildId = in.readLong();
        city = (City) in.readValue(City.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(builder);
        dest.writeLong(buildId);
        dest.writeValue(city);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Condominium> CREATOR = new Parcelable.Creator<Condominium>() {
        @Override
        public Condominium createFromParcel(Parcel in) {
            return new Condominium(in);
        }

        @Override
        public Condominium[] newArray(int size) {
            return new Condominium[size];
        }
    };

}
