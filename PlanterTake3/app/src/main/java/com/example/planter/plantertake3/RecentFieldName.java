package com.example.planter.plantertake3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.text.*;
import com.planter.*;
import android.content.*;

public class RecentFieldName extends AppCompatActivity {
    private static String field;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_field_name);

        Button nextPage = (Button) findViewById(R.id.goToRecent);
        Button home = (Button) findViewById(R.id.home1);

        nextPage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView fieldType = (TextView) findViewById(R.id.editText3);
                field = "" + fieldType.getText();
                goToRecentEntry();

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });
    }

    public void goToRecentEntry(){
        Intent intent = new Intent(this, RecentEntry.class);
        startActivity(intent);
    }

    public void goHome()
    {
        Intent intent = new Intent(this, StartPage.class);
        startActivity(intent);
    }

    public static String types()
    {
        return field;
    }
}
