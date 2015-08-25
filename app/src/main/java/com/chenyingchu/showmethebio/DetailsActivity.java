package com.chenyingchu.showmethebio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends Activity {


    private ImageView detailImage;
    private TextView detailText;
    private TextView detailName;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        detailImage = (ImageView) findViewById(R.id.detailsImage);
        detailText = (TextView) findViewById(R.id.detailsText);
        detailName = (TextView) findViewById(R.id.nameText);

        extras = getIntent().getExtras();
        if (extras != null) {

            String name = extras.getString("name");
            showDetails(name);
        }
    }

    public void showDetails(String mName) {
        if (mName.equals("qwer")) {
            detailImage.setImageDrawable(getResources().getDrawable(R.drawable.qwer));
            detailText.setText(extras.getString("qwer"));
            detailName.setText("qwer");
        } else if (mName.equals("zxcv") ) {
            detailImage.setImageDrawable(getResources().getDrawable(R.drawable.zxcv));
            detailText.setText(extras.getString("zxcv"));
            detailName.setText("zxcv");
        }
    }

}
