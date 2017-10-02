package com.orzangleli.radarview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orzangleli.radar.XRadarView;

public class DemoActivity extends AppCompatActivity {

    XRadarView xRadarView1;
    String[] titles = new String[]{"击杀","金钱","防御","魔法","物理","助攻","生存"};
    double[] percents = new double[]{1.0, 0.46,0.63,0.75,0.5,0.9,0.26};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        xRadarView1 = (XRadarView) this.findViewById(R.id.radarView1);
        xRadarView1.setTitles(titles);
        xRadarView1.setPercents(percents);
    }
}
