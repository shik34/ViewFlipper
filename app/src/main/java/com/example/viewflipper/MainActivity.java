package com.example.viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private int[] mDrawablesArray = { R.drawable.image1, R.drawable.image2, R.drawable.image3
            /*, R.drawable.image4,
            R.drawable.image5, R.drawable.image6,
            R.drawable.image7, R.drawable.image8,
            R.drawable.image9, R.drawable.image10*/
    };
    ViewFlipper mViewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);

        for (int i = 0; i < mDrawablesArray.length; i++) {
            setFlipperImage(mDrawablesArray[i]);
        }

        mViewFlipper.setAutoStart(true);
        // и т.д.

        mViewFlipper.setFlipInterval(1500);
    }

    private void setFlipperImage(int resId) {
        ImageView image = new ImageView(getApplicationContext());
        image.setBackgroundResource(resId);
        mViewFlipper.addView(image);
    }
}