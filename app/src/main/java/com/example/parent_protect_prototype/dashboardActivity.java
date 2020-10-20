package com.example.parent_protect_prototype;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;


public class dashboardActivity extends AppCompatActivity {
    GoogleSignInClient mGoogleSignInClient;
    String email,name,Id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        GoogleSignInAccount acc=GoogleSignIn.getLastSignedInAccount(dashboardActivity.this);
        if(acc!=null){
             name=acc.getDisplayName();
            email=acc.getEmail();
            Id=acc.getId();

        }
        //MongoClient mongoClient = new MongoClient("mongodb+srv://ujjwal:ujjwal-connect123@parentprotectadmin-qkgeq.mongodb.net/parentprotectadmin?retryWrites=true&w=majority");

        //MongoClientURI connectionString = new MongoClientURI("mongodb+srv://ujjwal:ujjwal-connect123@parentprotectadmin-qkgeq.mongodb.net/parentprotectadmin?retryWrites=true&w=majority");
        //MongoClient mongoClient = new MongoClient(connectionString);

        //CallbackManager callbackManager = CallbackManager.Factory.create();
        /*DB database = mongoClient.getDB("parentprotectadmin");

        DBCollection collection= database.getCollection("customers");
        if(collection!=null){
            Toast.makeText(this, "Connected", Toast.LENGTH_LONG).show();
        }

        String json= String.format("\"personal_details\":{\"name\":{\"first_name\":%s,\"last_name\":null},\"photo\":\"0\",\"blood_group\":null,\"age\":null,\"aadhar\":null,\"email\":%s,\"address\":{\"building\":null,\"locality\":null,\"city\":null,\"state\":null},\"phone\":null,\"alternate_phone\":null},\"payment_details\":{\"bank_account_no\":null,\"total_amount_spent\":0,\"current_plan_type\":null,\"current_plan_start_date\":null,\"current_plan_expire_date\":null},\"fitness_details\":{\"heart_rate\":null,\"blood_oxygen\":null,\"blood_pressure\":null,\"blood_pressure2\":null,\"total_distance_travelled\":0},\"alerts\":false,\"stats\":[],\"googleId\":%s,\"password\":null,\"__v\":0",email,email,Id);

        BasicDBObject dbObject = com.mongodb.BasicDBObject.parse(json);
        collection.insert((DBObject) dbObject);*/


    }

}


        /*
        private BluetoothAdapter mBluetoothAdapter;
    private SparseArray<BluetoothDevice> mDevices;
    private BluetoothGatt mConnectedGatt;
    private ProgressDialog mProgress;
    private Handler mHandler;
    private Runnable mStopRunnable, mStartRunnable;




        BluetoothManager manager=(BluetoothManager) getSystemService(BLUETOOTH_SERVICE);
       mBluetoothAdapter=manager.getAdapter();
       mDevices=new SparseArray<BluetoothDevice>();*/




    /*@Override
    protected void onResume() {
        super.onResume();

        if(mBluetoothAdapter==null || !mBluetoothAdapter.isEnabled()){

            Intent enableBtIntent=new Intent((BluetoothAdapter.ACTION_REQUEST_ENABLE));
            startActivity(enableBtIntent);
            finish();
            return;
        }
        if(!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)){
            Toast.makeText(this,"Sorry your Mobile does not support Bluetooth LE",Toast.LENGTH_SHORT);
            finish();
            return;
        }

    }

    @Override
    protected void onPause() {
        super.onPause();

        mHandler.removeCallbacks(mStopRunnable);
        mHandler.removeCallbacks(mStartRunnable);
        mBluetoothAdapter.stopLeScan(this);

    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mConnectedGatt!=null){
            mConnectedGatt.disconnect();
            mConnectedGatt=null;
        }
    }


    @Override
    public void onLeScan(BluetoothDevice device, int rssi, byte[] scanRecord) {

    }
}*/