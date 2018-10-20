package com.example.tmg1.test2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
//import android.widget.TextView;
import android.widget.*;
//import android.view.*;


public class Page1 extends AppCompatActivity {
    Helper test;
   // ProgressBar test2;
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        test = new Helper();

        //test2 = (ProgressBar) findViewById(R.id.progressBar2);

        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text1);
        //tv.setText(string1FromJNI());
        // Button tv1 = (Button) findViewById(R.id.button);
        tv.setText(test.quest(true));
        tv.setText(test.quest(true));

        switch(test.getButton())
        {
            case 2:
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                button5.setVisibility(View.INVISIBLE);
                break;
            case 3:
                button4.setVisibility(View.INVISIBLE);
                button5.setVisibility(View.INVISIBLE);
                break;
            case 4:
                button5.setVisibility(View.INVISIBLE);
                break;
            default:
                break;

        }

       /* TextView tv1 = (TextView) findViewById(R.id.sample_text1);
        tv1.setText(stringFromJNI());*/

        /*TextView tv2 = (TextView) findViewById(R.id.sample_text);
        tv2.setText(stringFromJNI());*/


        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new android.view.View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                if(test.getNumber() != 1) {
                    button1Pressed();
                }
                else {
                    button2Pressed();
                }
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new android.view.View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                if(test.getNumber() != 2) {
                    button1Pressed();
                }
                else {
                    button2Pressed();
                }
            }
        });

        //Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new android.view.View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                if(test.getNumber() != 3) {
                    button1Pressed();
                }
                else {
                    button2Pressed();
                }
            }
        });

        //Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new android.view.View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                if(test.getNumber() != 4) {
                    button1Pressed();
                }
                else {
                    button2Pressed();
                }
            }
        });

        //Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new android.view.View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                if(test.getNumber() != 5) {
                    button1Pressed();
                }
                else {
                    button2Pressed();
                }
            }
        });



    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String string1FromJNI();
    //public native String Yes();

    /*
    This will reload the page
     */

    private void button1Pressed() {
       // if (test2.getProgress() != 0) {
            Intent intent = new Intent(this, Page1.class);
            startActivity(intent);
        /*}
        else
        {
            Intent intent = new Intent(this, Page2.class);
            startActivity(intent);
        }*/
    }

    /*
        This will lead to the death page
     */

    private void button2Pressed() {

        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }

}
