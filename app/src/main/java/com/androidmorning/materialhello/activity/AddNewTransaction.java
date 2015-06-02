package com.androidmorning.materialhello.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.androidmorning.materialhello.R;

/**
 * Created by huy.nd on 6/2/2015.
 */
public class AddNewTransaction extends Activity {

    EditText edtNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addnewtransaction);

        edtNotice = (EditText)findViewById(R.id.edtNotice);
        edtNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNotice.setText("");
            }
        });
    }


}
