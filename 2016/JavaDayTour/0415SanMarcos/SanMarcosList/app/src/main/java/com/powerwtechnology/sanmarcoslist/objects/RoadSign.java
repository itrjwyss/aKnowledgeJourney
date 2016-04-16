package com.powerwtechnology.sanmarcoslist.objects;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mercedeswyss on 16/04/16.
 */
public class RoadSign implements Parcelable {

    public static enum RoadSignType {
        NO_BICYCLES, NO_LEFT, NO_PARKING, NO_PEDESTRIANS, NO_RIGHT, NO_TRUCKS, NO_U_TURN
    }

    private String roadSignName;

    private String roadSignDescription;

    private RoadSignType roadSignType;

    public RoadSign(){}

    public RoadSign(String roadSignName, String roadSignDescription, RoadSignType roadSignType){
        this.roadSignName = roadSignName;
        this.roadSignDescription = roadSignDescription;
        this.roadSignType = roadSignType;
    }

    protected RoadSign(Parcel in) {
        roadSignName = in.readString();
        roadSignDescription = in.readString();
        roadSignType = (RoadSignType) in.readValue(RoadSignType.class.getClassLoader());
    }

    public String getRoadSignName() {
        return roadSignName;
    }

    public void setRoadSignName(String roadSignName) {
        this.roadSignName = roadSignName;
    }

    public String getRoadSignDescription() {
        return roadSignDescription;
    }

    public void setRoadSignDescription(String roadSignDescription) {
        this.roadSignDescription = roadSignDescription;
    }

    public RoadSignType getRoadSignType() {
        return roadSignType;
    }

    public void setRoadSignType(RoadSignType roadSignType) {
        this.roadSignType = roadSignType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(roadSignName);
        dest.writeString(roadSignDescription);
        dest.writeValue(roadSignType);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<RoadSign> CREATOR = new Parcelable.Creator<RoadSign>() {
        @Override
        public RoadSign createFromParcel(Parcel in) {
            return new RoadSign(in);
        }

        @Override
        public RoadSign[] newArray(int size) {
            return new RoadSign[size];
        }
    };

}
