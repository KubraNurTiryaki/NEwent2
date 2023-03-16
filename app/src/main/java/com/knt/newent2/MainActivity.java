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

import io.realm.Realm;


public class MainActivity extends AppCompatActivity {
    Realm realm;

    Button btn1;
    ImageButton btn2;
    TextView username, password;

    String malmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RealmTanimla();


    }


    public void RealmTanimla() {
        realm = Realm.getDefaultInstance();
    }




    /*private void tanimla1() {
        btn1 = (Button) findViewById(R.id.bezdumbutton);
    }*/

    private void tanimla2() {
        btn2 = findViewById(R.id.LikeButtonLisa);
    }

    private void islevVer() {
        btn1.setOnClickListener(v -> System.out.println("turuncu buton tıklandı"));


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

        this.username = findViewById(R.id.username);
        this.username.setText(username);


    }


}