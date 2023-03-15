package com.knt.newent2;

//<!--Activity Classlar ekranı temsil eder-->




import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button btn1;
    ImageButton btn2;
    TextView username,password;

    String malmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tanimlamaUsername("Nasıl yapıcaz abla onu be BASEL");


    }

    /*private void tanimla1() {
        btn1 = (Button) findViewById(R.id.bezdumbutton);
    }*/

    private void tanimla2() {
        btn2 = (ImageButton) findViewById(R.id.LikeButtonLisa);
    }

    private void islevVer() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("turuncu buton tıklandı");
            }
        });


    }

    private void islevVer2() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("imagebuton tıklandı");
            }
        });


    }

    private void tanimlamaUsername(String username) {

        this.username = (TextView) findViewById(R.id.username);
        this.username.setText(username);




    }


}