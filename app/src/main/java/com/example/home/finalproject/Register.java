package com.example.home.finalproject;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    public EditText userName, email, password, name, familyName;
    private Button confirm;
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        userName = findViewById(R.id.etUserName);
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        name = findViewById(R.id.etName);
        familyName = findViewById(R.id.etFamilyName);
        confirm = findViewById(R.id.btnregister);
        radioGroup = findViewById(R.id.rg);
        confirm = findViewById(R.id.btnConfirm);

        userName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            // the user's changes are saved here
            public void onTextChanged(CharSequence c, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                visibel(confirm);
                if(s.length()==0||chekint(s)) {
                    userName.setError("you must fill your username or you start with number");
                    invisibel(confirm);
                }else {
                    visibel(confirm);
                }

            }

        });


        password.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            // the user's changes are saved here
            public void onTextChanged(CharSequence c, int start, int before, int count) {
                if (c.length() < 8) {
                    password.setError("password must be more than 8 chracter");
                    invisibel(confirm);
                }


            }
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()==0){
                    password.setError("you must fill your password");
                    invisibel(confirm);
                }else {
                visibel(confirm);
            }
            }

        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            // the user's changes are saved here
            public void onTextChanged(CharSequence c, int start, int before, int count) {


            }
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()==0) {
                    email.setError("you must fill your email");
                    invisibel(confirm);
                }
                else {
                    visibel(confirm);
                }

                for (int i = 0; i <s.length() ; i++) {
                    if (s.toString().charAt(i)== '@') {
                        if(s.toString().substring(s.length()-4,s.length())==".com") {
                        }
                        }else {
                            email.setError("email notvalid it must have @ and .com");
                        }



                }


            }

        });
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            // the user's changes are saved here
            public void onTextChanged(CharSequence c, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()==0) {
                    name.setError("you must fill your name");
                    invisibel(confirm);
                }else {
                    visibel(confirm);
                }

            }

        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }






    public void checkbutton(View v) {
        int radioid = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioid);
    }

    public void visibel(View v) {

        confirm.setVisibility(View.VISIBLE);
    }
    public void invisibel(View v){
        confirm.setVisibility(View.INVISIBLE);
    }
    public boolean chekint(Editable c){
        if(c.charAt(0)=='0'||c.charAt(0)=='1'||c.charAt(0)=='2'||c.charAt(0)=='3'||c.charAt(0)=='4'||c.charAt(0)=='5'||c.charAt(0)=='6'||c.charAt(0)=='7'||c.charAt(0)=='8'||c.charAt(0)=='9'){
            return true;
        }else {
            return false;
        }

    }
}
