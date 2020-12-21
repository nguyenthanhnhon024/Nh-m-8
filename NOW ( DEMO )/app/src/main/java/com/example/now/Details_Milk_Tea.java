package com.example.now;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Details_Milk_Tea extends AppCompatActivity {

    TextView foodDescription;
    TextView foodDanhGia1;
    TextView foodPrice1;
    TextView foodTitle1;
    ImageView foodImage,back;
    RatingBar ratingBar;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_milk_tea);

        foodDescription = (TextView)findViewById(R.id.txtDescription);
        foodImage =(ImageView)findViewById(R.id.ivImage2);
        foodDanhGia1 = (TextView) findViewById(R.id.danhgia1);
        foodPrice1 = (TextView) findViewById(R.id.tvPrice1);
        foodTitle1 = (TextView) findViewById(R.id.title1);

        Bundle mBundle = getIntent().getExtras();

        if(mBundle!=null){
            foodDescription.setText(mBundle.getString("Description"));
            foodImage.setImageResource(mBundle.getInt("Image"));
            foodDanhGia1.setText(mBundle.getString("DanhGia"));
            foodPrice1.setText(mBundle.getString("Price"));
            foodTitle1.setText(mBundle.getString("Title"));
        }

        ratingBar = findViewById(R.id.rating_bar);
        btSubmit = findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(),s+" Star", Toast.LENGTH_SHORT).show();
            }
        });

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}