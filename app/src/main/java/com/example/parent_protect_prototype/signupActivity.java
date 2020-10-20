package com.example.parent_protect_prototype;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.parent_protect_prototype.controller.RetrofitClientInstance;
import com.example.parent_protect_prototype.data.SignUpclass;
import com.example.parent_protect_prototype.service.retrofitservices;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class signupActivity extends AppCompatActivity {
    EditText EdtUsername, EdtFirstName, EdtLastName, EdtEmail, EdtPassword;
    Button Btnsignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EdtUsername = findViewById(R.id.edtUsername);
        EdtFirstName = findViewById(R.id.edtFirstName);
        EdtLastName = findViewById(R.id.edtLastName);
        EdtEmail = findViewById(R.id.edtEmail);
        EdtPassword = findViewById(R.id.edtPassword);
        Btnsignup = findViewById(R.id.buttonSignup);
        Btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = EdtUsername.getText().toString();
                String firstname = EdtFirstName.getText().toString();
                String Lastname = EdtLastName.getText().toString();
                String Email = EdtEmail.getText().toString();
                String Password = EdtPassword.getText().toString();
                Toast.makeText(signupActivity.this, "Onclick called", Toast.LENGTH_SHORT).show();
                Log.i("error", "onClick: asdasd");
                if (username.length() == 0 || firstname.length() == 0 || Lastname.length() == 0 || Email.length() == 0 || Password.length() == 0) {
                    Toast.makeText(signupActivity.this, "Fill the entries correctly", Toast.LENGTH_LONG).show();
                } else {
                    if (Password.length() < 5) {
                        Toast.makeText(signupActivity.this, "Password is very small fill atleast 5 characters", Toast.LENGTH_LONG).show();
                    } else if (!Email.contains("@") || !Email.contains(".")) {
                        Toast.makeText(signupActivity.this, "Incorrect Email", Toast.LENGTH_LONG).show();
                    } else {

                    }


                }

            }

        });


    }

    public class DBAsynTask(
    String Email,
            String username,
    String Password, String firstname,
    String Lastname ):AsyncTask<Void, Void, Void>()


    {
        public void Retrofit () {
        retrofitservices services = (retrofitservices) RetrofitClientInstance.getRetrofitInstance().create(SignUpclass.class);
        SignUpclass body = new SignUpclass(Email, username, Password, firstname, Lastname);

        Call<List<SignUpclass>> call = services.loadChanges(body);
        call.enqueue(new Callback<List<SignUpclass>>() {
            @Override
            public void onResponse(Call<List<SignUpclass>> call, Response<List<SignUpclass>> response) {
                Toast.makeText(signupActivity.this, response.toString(), Toast.LENGTH_LONG).show();


            }

            @Override
            public void onFailure(Call<List<SignUpclass>> call, Throwable t) {

                Toast.makeText(signupActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });


    }
    }
}
