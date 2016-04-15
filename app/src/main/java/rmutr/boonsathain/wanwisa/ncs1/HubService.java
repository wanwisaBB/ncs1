package rmutr.boonsathain.wanwisa.ncs1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HubService extends AppCompatActivity {

    //Explicit
    private ImageView hubImageView;
    private TextView hub4TextView;
    private String nameString, surnameString, statusString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub_service);

        //Bind Wigget
        hubImageView = (ImageView) findViewById(R.id.imageView5);
        hub4TextView = (TextView) findViewById(R.id.textView8);

        //check Status
        checkStatus();


    }   //main Method

    private void checkStatus() {

        statusString = getIntent().getStringExtra("Status");
        if (statusString.equals("0")) {

            hubImageView.setVisibility(View.INVISIBLE);
            hub4TextView.setVisibility(View.INVISIBLE);

        }   //if



    }   //check status




}   //main class
