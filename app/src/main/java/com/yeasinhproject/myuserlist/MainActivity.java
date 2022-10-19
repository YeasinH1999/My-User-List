package com.yeasinhproject.myuserlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.progressindicator.CircularProgressIndicator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CircularProgressIndicator progressBar_circular;
    String Url = "https://dummyjson.com/users";
    MyAdapter myAdapter;
    List<MyUserList> myUserList_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar_circular = findViewById(R.id.progressBar_circular);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        myUserList_list = new ArrayList<>();

        loadServerData();


    } // OnCreate Method Ends Here -----------------------------------------------------------------


    //----------------------------------------------------------------------------------------------

    private void loadServerData() {

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, Url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                progressBar_circular.setVisibility(View.GONE);

                try {
                    JSONArray jsonArray = response.getJSONArray("users");

                    for (int x=0; x<jsonArray.length(); x++) {

                        JSONObject jsonObject = jsonArray.getJSONObject(x);

                        String image = jsonObject.getString("image");
                        String firstName = jsonObject.getString("firstName");
                        String lastName = jsonObject.getString("lastName");
                        String age = jsonObject.getString("age");
                        String gender = jsonObject.getString("gender");
                        String bloodGroup = jsonObject.getString("bloodGroup");
                        String eyeColor = jsonObject.getString("eyeColor");
                        String birthDate = jsonObject.getString("birthDate");
                        String phone = jsonObject.getString("phone");
                        String email = jsonObject.getString("email");
                        String domain = jsonObject.getString("domain");

                        JSONObject jsonObject_user_address = jsonObject.getJSONObject("address");

                        String user_address = jsonObject_user_address.getString("address");
                        String user_city = jsonObject_user_address.getString("city");
                        String user_postalCode = jsonObject_user_address.getString("postalCode");
                        String user_state = jsonObject_user_address.getString("state");


                        //--------------------------------------------------------------------------
                        JSONObject jsonObject_bank = jsonObject.getJSONObject("bank");

                        String cardExpire = jsonObject_bank.getString("cardExpire");
                        String cardNumber = jsonObject_bank.getString("cardNumber");
                        String cardType = jsonObject_bank.getString("cardType");
                        String currency = jsonObject_bank.getString("currency");
                        String iban = jsonObject_bank.getString("iban");

                        //--------------------------------------------------------------------------


                        //--------------------------------------------------------------------------
                        JSONObject jsonObject_company = jsonObject.getJSONObject("company");

                        String com_department = jsonObject_company.getString("department");
                        String com_name = jsonObject_company.getString("name");
                        String com_title = jsonObject_company.getString("title");

                        //--------------------------------------------------------------------------


                        //--------------------------------------------------------------------------
                        JSONObject jsonObject_com_address = jsonObject_company.getJSONObject("address");

                        String com_address = jsonObject_com_address.getString("address");

                        //--------------------------------------------------------------------------


                        MyUserList myUserList = new MyUserList(image,firstName,lastName,
                                age,gender,bloodGroup,eyeColor,birthDate,phone,email,domain,user_address,user_city,
                                user_postalCode,user_state,cardNumber,cardType,currency,cardExpire,iban,com_name,
                                com_title,com_department,com_address);

                        myUserList_list.add(myUserList);

                        myAdapter = new MyAdapter(myUserList_list, getApplicationContext());
                        recyclerView.setAdapter(myAdapter);
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
        requestQueue.add(jsonObjectRequest);

    }

    //----------------------------------------------------------------------------------------------




//**********************************************************************************************

    @Override
    public void onBackPressed() {
        // super.onBackPressed();

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
        builder.setTitle("Confirm Exit!")
                .setIcon(R.drawable.warning)
                .setMessage("Do you really want to exit?")

                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                        finishAndRemoveTask();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                })
                .show();
    }

    //----------------------------------------------------------------------------------------------




} // MainActivity Ends Here ------------------------------------------------------------------------