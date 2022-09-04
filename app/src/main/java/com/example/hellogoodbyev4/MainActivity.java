package com.example.hellogoodbyev4;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {





    //Variables for the Image and an array to house the two different pictures
    private static ImageView imgview;
    private int current_img;
    int[] images={R.drawable.hello,R.drawable.goodbye};

    private static Button button;





    //Variables for the different textview portions
    ViewGroup container;
    TextView text1;
    TextView text2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





//Variables defined in the OnCreate Section
        buttonclick();
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);




    }

    //The Application was stuck and wouldn't work until this part was added
    public void buttonclick()

    {



//More variables for the different images and textview section
//Defining the different Id's and setting initial visibility of text view
        imgview=(ImageView)findViewById(R.id.view1);
        button=(Button)findViewById(R.id.button);
        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text2.setVisibility(View.INVISIBLE);
        text1.setVisibility(View.VISIBLE);



//Start of the onclick function
        button.setOnClickListener (
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {






//If statement with different Visibilities for the Text View Elements
                        if (text1.getVisibility() == View.VISIBLE)
                        {
                            text1.setVisibility(View.INVISIBLE);
                            text2.setVisibility(View.VISIBLE);
                        }



                        else if (text2.getVisibility() == View.VISIBLE)
                        {
                            text2.setVisibility(View.INVISIBLE);
                            text1.setVisibility(View.VISIBLE);
                        }






//Code to make the image change back and forth between the different elephants
                        current_img++;

                        current_img = current_img % images.length;

                        imgview.setImageResource(images[current_img]);




                    }
                }
        );
    }
}







