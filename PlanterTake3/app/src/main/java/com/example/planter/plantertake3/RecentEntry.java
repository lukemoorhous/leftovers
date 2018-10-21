package com.example.planter.plantertake3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.planter.data.Field;
import com.planter.data.FieldRecord;
import com.planter.app.Planter;
import com.planter.API.*;
import android.widget.*;
import android.view.*;
import android.text.*;
import android.content.*;

public class RecentEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_entry);

        PlanterAPI x = new PlanterAPI();

        TextView field = (TextView) findViewById(R.id.variable1);
        TextView crop = (TextView) findViewById(R.id.variable2);
        TextView water = (TextView) findViewById(R.id.variable3);
        TextView height = (TextView) findViewById(R.id.variable4);

        String water2 = "" + x.getMostRecentRecord("Corn").getWater();
        String height2 = "" + x.getMostRecentRecord("Corn").getHeight();

        field.setText(x.getMostRecentRecord("Corn").getFieldName());
        crop.setText(x.getMostRecentRecord("Corn").getCrop());
        water.setText(water2);
        height.setText(height2);

        Button home = (Button) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                goHome();
            }
        });


    }

    public void goHome()
    {
        Intent intent = new Intent(this, StartPage.class);
        startActivity(intent);
    }
}
