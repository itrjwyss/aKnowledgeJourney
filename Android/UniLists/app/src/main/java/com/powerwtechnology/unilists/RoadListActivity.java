package com.powerwtechnology.unilists;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RoadListActivity extends AppCompatActivity {

    private ListView listRoadSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Hola UNI");
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initComponents();
    }

    private void initComponents(){
        listRoadSign = (ListView) findViewById(R.id.lv_road_list);

        List<RoadSign> list = new ArrayList<>();
        list.add(new RoadSign("No Bicicletas", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_BICYCLES));
        list.add(new RoadSign("No Virar a la Izquierda", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_LEFT));
        list.add(new RoadSign("No Bicicletas", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_BICYCLES));
        list.add(new RoadSign("No Virar a la Izquierda", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_LEFT));
        list.add(new RoadSign("No Bicicletas", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_BICYCLES));
        list.add(new RoadSign("No Virar a la Izquierda", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_LEFT));
        list.add(new RoadSign("No Bicicletas", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_BICYCLES));
        list.add(new RoadSign("No Virar a la Izquierda", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_LEFT));
        list.add(new RoadSign("No Bicicletas", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_BICYCLES));
        list.add(new RoadSign("No Virar a la Izquierda", "Aquí están prohibido el paso de bicicletas", RoadSign.RoadSignType.NO_LEFT));

        listRoadSign.setAdapter(new RoadSignArrayAdapter(this, list));
    }

}
