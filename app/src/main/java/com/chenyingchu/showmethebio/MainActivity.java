package com.chenyingchu.showmethebio;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener{

    private ImageView qwerImage;
    private ImageView zxcvImage;
    private String qwerString = "qwer shi ge da yin yue jia";
    private String zxcvString = "zxcv shi ge da yin yue jia";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qwerImage = (ImageView) findViewById(R.id.qwerId);
        zxcvImage = (ImageView) findViewById(R.id.zxcvId);
        qwerImage.setOnClickListener(this);
        zxcvImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.qwerId:
                Intent qwerIntent = new Intent(MainActivity.this, DetailsActivity.class);
                qwerIntent.putExtra("qwer",qwerString);
                qwerIntent.putExtra("name", "qwer");
                startActivity(qwerIntent);
                break;
            case R.id.zxcvId:
                Intent zxcvIntent = new Intent(MainActivity.this, DetailsActivity.class);
                zxcvIntent.putExtra("zxcv", zxcvString);
                zxcvIntent.putExtra("name", "zxcv");
                startActivity(zxcvIntent);
                break;
        }
    }
}
