package com.example.planter.plantertake3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.text.*;
import com.planter.API.*;


public class NewEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);

        Button finish = (Button) findViewById(R.id.recentEntry);

        finish.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                TextView field = (TextView) findViewById(R.id.editText);
                TextView crop = (TextView) findViewById(R.id.editText2);
                TextView water = (TextView) findViewById(R.id.editText4);
                TextView height = (TextView) findViewById(R.id.editText5);

                String water2 = "" + water.getText();
                String height2 = "" + height.getText();

                PlanterAPI x = new PlanterAPI();
                x.addRecord("" + field.getText(), "" + crop.getText(), Double.valueOf(water2), Double.valueOf(height2));
                // next we will go to the recent entries.
                goToRecentEntry();

            }
        });
    }

    public void goToRecentEntry()
    {
        Intent intent = new Intent(this, RecentEntry.class);
        startActivity(intent);
    }

}
