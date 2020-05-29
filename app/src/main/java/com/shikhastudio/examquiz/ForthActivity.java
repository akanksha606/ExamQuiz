package com.shikhastudio.examquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ForthActivity extends AppCompatActivity {
    // define the global variable
    TextView question4;
    // Add button Move to next Activity and previous Activity
    Button next_button, previous_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        next_button=(Button)findViewById(R.id.fourth_next);
        previous_button = (Button)findViewById(R.id.fourth_previous);
        question4 = (TextView)findViewById(R.id.question4_id);

        question4.setText("Q 4 - What is DDMS in android?\n"
                + "\n"
                + "Ans- Dalvik debug monitor services");
        // Add_button add clicklistener
        next_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(ForthActivity.this, FifthActivity.class);

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

                Intent intent = new Intent(ForthActivity.this, ThirdActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
