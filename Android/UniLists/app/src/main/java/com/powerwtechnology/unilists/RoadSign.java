package com.powerwtechnology.unilists;

/**
 * Created by mercedeswyss on 7/07/16.
 */

public class RoadSign {

    public enum RoadSignType {
        NO_BICYCLES, NO_LEFT
    }

    private String roadSignName;

    private String roadSignDescription;

    private RoadSignType roadSignType;

    public RoadSign(String roadSignName, String roadSignDescription, RoadSignType roadSignType){
        this.roadSignDescription = roadSignDescription;
        this.roadSignName = roadSignName;
        this.roadSignType = roadSignType;
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
}
