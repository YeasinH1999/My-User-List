package com.yeasinhproject.myuserlist;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserDetails extends AppCompatActivity {

    TextView userAddress,userCity,userPostalCode,userState,
    userCardNum,tv_userCardType,tv_userCurrency,tv_userCardExpire,tv_userCard_iban,
            tv_userComName,tv_userComTitle,tv_userComDep,tv_userComAdd;

    public static String UserAddress = "", UserCity = "", UserPostalCode = "", UserState = "",
            UserCardNum = "", Tv_userCardType = "", Tv_userCurrency = "", Tv_userCardExpire = "",
            Tv_userCard_iban = "", Tv_userComName = "", Tv_userComTitle = "",
            Tv_userComDep = "", Tv_userComAdd = "";

    LinearLayout userPerAddress,userWorkDetails;
    RelativeLayout userPerBankDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        FindViewsById();

        SetText();

        LoadAnimation();

    } // onCreate Method Ends Here -----------------------------------------------------------------


    private void FindViewsById () {

        userAddress = findViewById(R.id.userAddress);
        userCity = findViewById(R.id.userCity);
        userPostalCode = findViewById(R.id.userPostalCode);
        userState = findViewById(R.id.userState);

        userPerAddress = findViewById(R.id.userPerAddress);
        userPerBankDetails = findViewById(R.id.userPerBankDetails);
        userWorkDetails = findViewById(R.id.userWorkDetails);

        userCardNum = findViewById(R.id.userCardNum);
        tv_userCardType = findViewById(R.id.tv_userCardType);
        tv_userCurrency = findViewById(R.id.tv_userCurrency);
        tv_userCardExpire = findViewById(R.id.tv_userCardExpire);
        tv_userCard_iban = findViewById(R.id.tv_userCard_iban);

        tv_userComName = findViewById(R.id.tv_userComName);
        tv_userComTitle = findViewById(R.id.tv_userComTitle);
        tv_userComDep = findViewById(R.id.tv_userComDep);
        tv_userComAdd = findViewById(R.id.tv_userComAdd);

    }


    private void SetText () {

        userAddress.setText("Address : "+UserAddress);
        userCity.setText("City : "+UserCity);
        userPostalCode.setText("Postal Code : "+UserPostalCode);
        userState.setText("State : "+UserState);
        userCardNum.setText("Card No : "+UserCardNum);
        tv_userCardType.setText("Card Type : "+Tv_userCardType);
        tv_userCurrency.setText("Currency : "+Tv_userCurrency);
        tv_userCardExpire.setText("Expire : "+Tv_userCardExpire);
        tv_userCard_iban.setText(Tv_userCard_iban);
        tv_userComName.setText("Company : "+Tv_userComName);
        tv_userComTitle.setText("Title : "+Tv_userComTitle);
        tv_userComDep.setText("Department : "+Tv_userComDep);
        tv_userComAdd.setText("Address : "+Tv_userComAdd);

    }


    private void LoadAnimation () {

        userPerAddress.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_scale));
        userPerBankDetails.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_scale));
        userWorkDetails.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_scale));

        userAddress.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        userCity.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        userPostalCode.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        userState.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        userCardNum.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        tv_userCardType.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        tv_userCurrency.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        tv_userCardExpire.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        tv_userCard_iban.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        tv_userComName.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        tv_userComTitle.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        tv_userComDep.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));
        tv_userComAdd.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_transition_two));

    }


} // MainActivity Ends Here ------------------------------------------------------------------------