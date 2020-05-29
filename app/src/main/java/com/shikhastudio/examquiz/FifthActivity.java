package com.shikhastudio.examquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {
    TextView question5;
    // Add button Move to next Activity and previous Activity
    Button first_button, previous_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        first_button=(Button)findViewById(R.id.fifth_first);
        previous_button = (Button)findViewById(R.id.fifth_previous);
        question5 = (TextView)findViewById(R.id.question5_id);

        question5.setText("Q 5 - What is off-line synchronization in android?\n"
                + "\n"
                + "Ans- Synchronization without internet");
        // Add_button add clicklistener
        first_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(FifthActivity.this, MainActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        previous_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(FifthActivity.this, ForthActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
