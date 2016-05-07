package com.powerwtechnology.customizinglists.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.powerwtechnology.customizinglists.R;
import com.powerwtechnology.customizinglists.adapters.RoadSignListAdapter;
import com.powerwtechnology.customizinglists.objects.RoadSign;

import java.util.ArrayList;
import java.util.List;

public class RoadSignListActivity extends AppCompatActivity {

    private ListView roadSignList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_sign_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Add a new Road Sign", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initComponents();
    }

    private void initComponents(){
        List<RoadSign> data = new ArrayList<>();
        data.add(new RoadSign("No Bicicletas", "No se permiten bicicletas estacionadas.", RoadSign.RoadSignType.NO_BICYCLES));
        data.add(new RoadSign("No Girar a la Izquierda", "No se permite cruzar a la izquierda.", RoadSign.RoadSignType.NO_LEFT));
        data.add(new RoadSign("No Parquearse", "No se permite parquear o se llamara a una grua.", RoadSign.RoadSignType.NO_PARKING));
        data.add(new RoadSign("No Peatones", "No se permiten peatones en este sector.", RoadSign.RoadSignType.NO_PEDESTRIANS));
        data.add(new RoadSign("No Girar a la Derecha", "No se permite cruzar a la derecha.", RoadSign.RoadSignType.NO_RIGHT));
        data.add(new RoadSign("No Camiones", "No se permiten el paso a cameones pesados.", RoadSign.RoadSignType.NO_TRUCKS));
        data.add(new RoadSign("No Virar en U", "No se permite virar en U.", RoadSign.RoadSignType.NO_U_TURN));

        roadSignList = (ListView) findViewById(R.id.lv_road_sign_list);
        roadSignList.setAdapter(new RoadSignListAdapter(this, data));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_road_sign_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
