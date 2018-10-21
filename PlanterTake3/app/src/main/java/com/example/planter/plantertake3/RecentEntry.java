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

        Button past = (Button) findViewById(R.id.past);

        TextView field = (TextView) findViewById(R.id.variable1);
        TextView crop = (TextView) findViewById(R.id.variable2);
        TextView water = (TextView) findViewById(R.id.variable3);
        TextView height = (TextView) findViewById(R.id.variable4);
        String types = RecentFieldName.types();
        if(x.getMostRecentRecord(types) != null) {
            String field2 = x.getMostRecentRecord(types).getFieldName();
            String crop2 = x.getMostRecentRecord(types).getCrop();
            String water2 = "" + x.getMostRecentRecord(types).getWater() + " VWC";
            String height2 = "" + x.getMostRecentRecord(types).getHeight() + " in.";

            field.setText(field2);
            crop.setText(crop2);
            water.setText(water2);
            height.setText(height2);
        }
        else
        {
            TextView var1 = (TextView) findViewById(R.id.textView);
            TextView var2 = (TextView) findViewById(R.id.textView2);
            TextView var3 = (TextView) findViewById(R.id.textView3);
            TextView var4 = (TextView) findViewById(R.id.textView4);

            var1.setVisibility(View.INVISIBLE);
            var2.setVisibility(View.INVISIBLE);
            var3.setVisibility(View.INVISIBLE);
            var4.setVisibility(View.INVISIBLE);


            field.setText("No Field with name of" );
            crop.setText(types);
            water.setText("Is Recorded");
            height.setText("");
            past.setVisibility(View.INVISIBLE);
        }



        Button home = (Button) findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                goHome();
            }
        });

        past.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PastData.setIndex(1);
                goPast();
            }
        });


    }

    public void goHome()
    {
        Intent intent = new Intent(this, StartPage.class);
        startActivity(intent);
    }

    public void goPast()
    {
        Intent intent = new Intent(this, PastData.class);
        startActivity(intent);
    }
}
