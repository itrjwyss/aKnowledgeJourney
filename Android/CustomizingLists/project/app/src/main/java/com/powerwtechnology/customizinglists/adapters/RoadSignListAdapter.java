package com.powerwtechnology.customizinglists.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.powerwtechnology.customizinglists.R;
import com.powerwtechnology.customizinglists.objects.RoadSign;

import java.util.List;

/**
 * Created by mercedeswyss on 16/04/16.
 */
public class RoadSignListAdapter extends ArrayAdapter<RoadSign> {

    private LayoutInflater inflater;

    public RoadSignListAdapter(Activity context, List<RoadSign> data){
        super(context, R.layout.item_road_sign, data);
        this.inflater = context.getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = inflater.inflate(R.layout.item_road_sign, null);

            RoadSign roadSign = getItem(position);
            ((TextView) convertView.findViewById(R.id.tv_road_sign_name)).setText(roadSign.getRoadSignName());
            ((TextView) convertView.findViewById(R.id.tv_road_sign_description)).setText(roadSign.getRoadSignDescription());

            ImageView iconView = (ImageView) convertView.findViewById(R.id.iv_road_sign_icon);
            if(roadSign.getRoadSignType() == RoadSign.RoadSignType.NO_BICYCLES){
                iconView.setImageResource(R.drawable.no_bicycles);
            } else if(roadSign.getRoadSignType() == RoadSign.RoadSignType.NO_LEFT){
                iconView.setImageResource(R.drawable.no_left);
            } else if(roadSign.getRoadSignType() == RoadSign.RoadSignType.NO_PARKING){
                iconView.setImageResource(R.drawable.no_parking);
            } else if(roadSign.getRoadSignType() == RoadSign.RoadSignType.NO_PEDESTRIANS){
                iconView.setImageResource(R.drawable.no_pedestrians);
            } else if(roadSign.getRoadSignType() == RoadSign.RoadSignType.NO_RIGHT){
                iconView.setImageResource(R.drawable.no_right);
            } else if(roadSign.getRoadSignType() == RoadSign.RoadSignType.NO_TRUCKS){
                iconView.setImageResource(R.drawable.no_trucks);
            } else if(roadSign.getRoadSignType() == RoadSign.RoadSignType.NO_U_TURN){
                iconView.setImageResource(R.drawable.no_u_turn);
            }
        }
        return convertView;
    }

}
