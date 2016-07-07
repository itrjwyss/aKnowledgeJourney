package com.powerwtechnology.unilists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mercedeswyss on 7/07/16.
 */

public class RoadSignArrayAdapter extends ArrayAdapter<RoadSign> {

    private Context context;
    private LayoutInflater layoutInflater;

    public RoadSignArrayAdapter(Context context, List<RoadSign> objects) {
        super(context, R.layout.item_road_sign, objects);

        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View viewConvert, ViewGroup viewGroup){
        if(viewConvert == null){
            viewConvert = layoutInflater.inflate(R.layout.item_road_sign, null);

            RoadSign roadSign = getItem(position);

            TextView tvRoadName = (TextView) viewConvert.findViewById(R.id.tv_road_name);
            tvRoadName.setText(roadSign.getRoadSignName());

            ((TextView) viewConvert.findViewById(R.id.tv_road_description)).setText(roadSign.getRoadSignDescription());

            ImageView ivRoadIcon = (ImageView) viewConvert.findViewById(R.id.iv_road_image);
            if(roadSign.getRoadSignType() == RoadSign.RoadSignType.NO_BICYCLES){
                ivRoadIcon.setImageResource(R.drawable.no_bicycles);
            }else if(roadSign.getRoadSignType() == RoadSign.RoadSignType.NO_LEFT){
                ivRoadIcon.setImageResource(R.drawable.no_left);
            }
        }

        return viewConvert;
    }



}
