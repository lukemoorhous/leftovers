package com.example.planter.plantertake3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.planter.API.*;
//import com.example.planter.plantertake3.ExampleInstrumentedTest.java
import android.view.*;
import android.widget.*;
import android.content.*;

public class StartPage extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        //PlanterAPI test = new PlanterAPI();

        // Example of a call to a native method
       // TextView tv = (TextView) findViewById(R.id.sample_text);
       // tv.setText(stringFromJNI());

        Button newEnt = (Button) findViewById(R.id.newEntry);
        Button recentEnt = (Button) findViewById(R.id.recentEntry);

        newEnt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                goToNewEntry();
            }
        });

        recentEnt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToRecentEntry();
            }
        });

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    //public native String stringFromJNI();

    public void goToNewEntry()
    {
        Intent intent = new Intent(this, NewEntry.class);
        startActivity(intent);
    }

    public void goToRecentEntry()
    {
        Intent intent = new Intent(this, RecentFieldName.class);
        startActivity(intent);
    }
}
