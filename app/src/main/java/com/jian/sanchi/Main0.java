package com.jian.sanchi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main0 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        findViewById(R.id.main0_btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main0.this,Main1.class));

            }
        });

        findViewById(R.id.main0_btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(Main0.this,Main6.class));

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nygirlofmydreams.com/")));


            }
        });
    }
}
