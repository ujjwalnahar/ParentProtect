package com.example.parent_protect_prototype;

import androidx.appcompat.app.AppCompatActivity;

public class Login_activity extends AppCompatActivity {
  /*  private Button emailLogin;
    private LoginButton FacebookSignIn;
    private SignInButton googleSignIn;
    private static final String EMAIL = "email";
    private EditText edtemail, edtpassword;
    int RC_SIGN_IN = 0;
    GoogleSignInClient mGoogleSignInClient;/*

    //CallbackManager mFaceBookcallbackManager;


  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);*/
        /*googleSignIn = findViewById(R.id.Google_login);
        edtemail = findViewById(R.id.edtEmail);
        edtpassword = findViewById(R.id.edtPassword);
        emailLogin = findViewById(R.id.button_Login);
        //FacebookSignIn = findViewById(R.id.Facebook_login);
        //FacebookSignIn.setReadPermissions("email", "public_profile");
        //mFaceBookcallbackManager = CallbackManager.Factory.create();
        /*(FacebookSignIn).registerCallback(mFaceBookcallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                String userid = loginResult.getAccessToken().getUserId();
                GraphRequest graphRequest = GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject object, GraphResponse response) {
                        sendData(object);
                    }

                });
                Bundle parameters = new Bundle();
                parameters.putString("fields", "first_name,last_name,email,id");
                graphRequest.setParameters(parameters);
                graphRequest.executeAsync();
            }

            // App code


            @Override
            public void onCancel() {
                Toast.makeText(Login_activity.this, "Some error occured while sign up", Toast.LENGTH_LONG).show();

                // App code
            }

            @Override
            public void onError(FacebookException exception) {
                Toast.makeText(Login_activity.this, "Some exception occured while sign up", Toast.LENGTH_LONG).show();

                // App code
            }
        });*/

/*
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);


        googleSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });
        /*emailLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email_login();
            }
        });*/

/*
    }

    private void email_login() {
        String emailId = edtemail.getText().toString();
        String password = edtpassword.getText().toString();


    }

    private void signIn() {
        Toast.makeText(this, "Sign in called", Toast.LENGTH_SHORT);
        Log.w("Google Sign In Error1", "signInResult:failed code=");

        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }




    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            Log.w("Google Sign In Error5", "signInResult:failed code=");
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            startActivity(new Intent(Login_activity.this, dashboardActivity.class));


            // Signed in successfully, show authenticated UI.

        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.

            Log.w("Google Sign In Error3", "signInResult:failed code=" + e.getStatusCode());

            Toast.makeText(this, "Sign in Successful", Toast.LENGTH_SHORT).show();


        }
    }
    @Override

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        /*mFaceBookcallbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);



        if (requestCode == RC_SIGN_IN) {
            Log.w("Google Sign In Error4", "signInResult:failed code=");

            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }


    @Override
    protected void onStart() {
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        if (account != null) {
            startActivity(new Intent(Login_activity.this, dashboardActivity.class));
        }
        super.onStart();
    }

    public void sendData(JSONObject object) {
        String first_name, last_name, email, id;
            //first_name = object.getString("first_name");
            //last_name = object.getString("last_name");
            //email = object.getString("email");
            //id = object.getString("id");
            Intent intent = new Intent(Login_activity.this, dashboardActivity.class);
            //intent.putExtra("first_name", first_name);
            //intent.putExtra("email", email);
            //intent.putExtra("last_name", last_name);
            //intent.putExtra("id", id);
            startActivity(intent);




    }*/
}
