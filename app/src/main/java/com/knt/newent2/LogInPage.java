package com.knt.newent2;
/*<!--Activity Classlar ekranı temsil eder-->*/



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogInPage extends AppCompatActivity {


    EditText editTextUserID, editTextPassID;
    Button signInButton;
    TextView textViewFU;

    CheckBox malsinCb;

    String kadi, ksifre, malmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);


        tanimla();
        mesajVer();
        tiklamaSignInButton();
    }

    /*activity sayfaları arası geçiş*/
    public void gecisyap() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("username",kadi);
        intent.putExtra("password",ksifre);
        intent.putExtra("Mal mi",malmi);
        startActivity(intent);
    }


    private void tanimla() {

        editTextUserID = (EditText) findViewById(R.id.userID);
        editTextPassID = (EditText) findViewById(R.id.sifreID);
        signInButton = (Button) findViewById(R.id.signinButton);
        textViewFU = (TextView) findViewById(R.id.fucku);
        malsinCb = (CheckBox) findViewById(R.id.malsin);

    }

    private void tiklamaSignInButton() {

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String deger = editTextUserID.getText().toString();

                if (deger.equals("Tony")) {
                    textViewFU.setText("Fuck You Tony");
                    gecisyap();
                } else if (deger.equals("Ezekiel")) {
                    textViewFU.setText("FUCK YOU EZEKIEL. U BETTER NOT BRING MY MOTHER TO THIS CONVERSATION");
                    gecisyap();
                } else {
                    textViewFU.setText("Welcome " + deger);
                    gecisyap();
                }

                degerAl();
                Log.i("Degerler:", "" + kadi + " " + ksifre + " " + malmi);
            }
        });
    }

    private void mesajVer() {
        malsinCb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (malsinCb.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Hayir, sadece robot aileni bulmaya calisiyorsun", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(LogInPage.this, "saka yaptim, malsin", Toast.LENGTH_LONG).show();

                }


            }
        });

    }

    void degerAl() {
        kadi = editTextUserID.getText().toString();
        ksifre = editTextPassID.getText().toString();
        malmi = String.valueOf(malsinCb.isChecked());
    }


    public void tiklaGec() {
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerAl();
                Log.i("Degerler:", "" + kadi + " " + ksifre + " " + malmi);
            }
        });
    }
}