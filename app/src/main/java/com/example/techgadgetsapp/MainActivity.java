package com.example.techgadgetsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Tech Gadgets App");
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setLogo(R.mipmap.ic_launcher); // or your custom logo
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }

        ListView gadgetsListView = (ListView)findViewById(R.id.gadgetslistview);

        gadgetsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent itemIntent;

                switch (position){
                    case 0:
                        itemIntent = new Intent(MainActivity.this, GadgetPictures.class);

                        itemIntent.putExtra(GadgetPictures.LBL_KEY,
                                getResources().getString(R.string.contttlTxt1));
                        itemIntent.putExtra(GadgetPictures.ID_KEY,
                                Integer.toString(R.drawable.macbook));
                        itemIntent.putExtra(GadgetPictures.DES_KEY,
                                getResources().getString(R.string.techitem1));
                        itemIntent.putExtra(GadgetPictures.URL_KEY,
                                getResources().getString(R.string.URL1));
                        break;
                    case 1:
                        itemIntent = new Intent(MainActivity.this, GadgetPictures.class);

                        itemIntent.putExtra(GadgetPictures.LBL_KEY,
                                getResources().getString(R.string.contttlTxt2));
                        itemIntent.putExtra(GadgetPictures.ID_KEY,
                                Integer.toString(R.drawable.printer));
                        itemIntent.putExtra(GadgetPictures.DES_KEY,
                                getResources().getString(R.string.techitem2));
                        itemIntent.putExtra(GadgetPictures.URL_KEY,
                                getResources().getString(R.string.URL2));
                        break;
                    case 2:
                        itemIntent = new Intent(MainActivity.this, GadgetPictures.class);

                        itemIntent.putExtra(GadgetPictures.LBL_KEY,
                                getResources().getString(R.string.contttlTxt3));
                        itemIntent.putExtra(GadgetPictures.ID_KEY,
                                Integer.toString(R.drawable.raspberrypi));
                        itemIntent.putExtra(GadgetPictures.DES_KEY,
                                getResources().getString(R.string.techitem3));
                        itemIntent.putExtra(GadgetPictures.URL_KEY,
                                getResources().getString(R.string.URL3));
                        break;
                    case 3:
                        itemIntent = new Intent(MainActivity.this, GadgetPictures.class);

                        itemIntent.putExtra(GadgetPictures.LBL_KEY,
                                getResources().getString(R.string.contttlTxt4));
                        itemIntent.putExtra(GadgetPictures.ID_KEY,
                                Integer.toString(R.drawable.casapopupdesk));
                        itemIntent.putExtra(GadgetPictures.DES_KEY,
                                getResources().getString(R.string.techitem4));
                        itemIntent.putExtra(GadgetPictures.URL_KEY,
                                getResources().getString(R.string.URL4));
                        break;
                    case 4:
                        itemIntent = new Intent(MainActivity.this, GadgetPictures.class);

                        itemIntent.putExtra(GadgetPictures.LBL_KEY,
                                getResources().getString(R.string.contttlTxt5));
                        itemIntent.putExtra(GadgetPictures.ID_KEY,
                                Integer.toString(R.drawable.samsunggalaxywatch));
                        itemIntent.putExtra(GadgetPictures.DES_KEY,
                                getResources().getString(R.string.techitem5));
                        itemIntent.putExtra(GadgetPictures.URL_KEY,
                                getResources().getString(R.string.URL5));
                        break;
                    default:
                        Toast myToast = Toast.makeText(MainActivity.this, "Invalid Choice", Toast.LENGTH_LONG);
                        myToast.show();

                        itemIntent = null;
                        break;
                }

                if(itemIntent != null){
                    startActivity(itemIntent);
                }
            }
        });
    }
}