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

        if(x.getMostRecentRecord("Corn") != null) {
            String field2 = x.getMostRecentRecord("Corn").getFieldName();
            String crop2 = x.getMostRecentRecord("Corn").getCrop();
            String water2 = "" + x.getMostRecentRecord("Corn").getWater();
            String height2 = "" + x.getMostRecentRecord("Corn").getHeight();

            field.setText(field2);
            crop.setText(crop2);
            water.setText(water2);
            height.setText(height2);
        }
        else
        {
            field.setText("null");
            crop.setText("null");
            water.setText("null");
            height.setText("null");
        }



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
