package com.example.techgadgetsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GadgetPictures extends AppCompatActivity {

    public static final String ID_KEY = "Image Resource ID", LBL_KEY = "Label String", DES_KEY = "Description String", URL_KEY = "URL String";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gadget_pictures);

        Bundle myExtras = getIntent().getExtras();

        if(myExtras!=null){
            String label  = myExtras.getString(LBL_KEY);

            TextView ttlText = (TextView)findViewById(R.id.itemttlTextView);
            ttlText.setText(label);

            String image_Id = myExtras.getString(ID_KEY);
            int imageId = Integer.parseInt(image_Id);

            ImageView image = (ImageView)findViewById(R.id.pictureview);

            image.setImageResource(imageId);
            image.setContentDescription(label);

            String description  = myExtras.getString(DES_KEY);

            TextView desText = (TextView)findViewById(R.id.contentView);
            desText.setText(description);

            String url  = myExtras.getString(URL_KEY);

            Button webbtn = (Button)findViewById(R.id.webbutton);

            View.OnClickListener btnWebListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    if(webintent!= null) {
                        startActivity(webintent);
                    }
                }
            };
            webbtn.setOnClickListener(btnWebListener);
        }




    }
}