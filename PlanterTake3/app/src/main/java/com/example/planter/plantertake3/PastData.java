package com.example.planter.plantertake3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.text.*;
import android.content.*;
import com.planter.API.*;

public class PastData extends AppCompatActivity {
    private static int index;
    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_data);

        String types = RecentFieldName.types();
        PlanterAPI x = new PlanterAPI();

        Button previous = (Button) findViewById(R.id.previousButton);
        Button next = (Button) findViewById(R.id.nextButton);
        Button home = (Button) findViewById(R.id.homeButton);
        //index = PastData1.getIndex();
        if (index <= 1)
            previous.setVisibility(View.INVISIBLE);
        if (index == x.getFieldLength(types) - 1)
            next.setVisibility(View.INVISIBLE);

        TextView var1 = (TextView) findViewById(R.id.variable1);
        TextView var2 = (TextView) findViewById(R.id.variable2);
        TextView var3 = (TextView) findViewById(R.id.variable3);
        TextView var4 = (TextView) findViewById(R.id.variable4);

        var1.setText(x.getRecord(types, index).getFieldName());
        var2.setText(x.getRecord(types, index).getCrop());
        var3.setText("" + x.getRecord(types, index).getWater());
        var4.setText("" + x.getRecord(types, index).getHeight());

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = index - 1;
                goToIndex();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = index + 1;
                goToIndex();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });




    }

    public void goToIndex()
    {
        Intent intent = new Intent(this, PastData.class);
        startActivity(intent);
    }

    public void goHome()
    {
        Intent intent = new Intent(this, StartPage.class);
        startActivity(intent);
    }

    public static int getIndex()
    {
        return index;
    }

    public static void setIndex(int ind)
    {
        index = ind;
    }


}
