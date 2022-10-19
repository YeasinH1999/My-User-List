package com.yeasinhproject.myuserlist;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView userImg;
    TextView nameOne,userAge,userGender,userBloodG,userEyeC,userBirthDay;
    Button btn_user_phone,btn_user_email,btn_user_web,moreInfo;

    MaterialCardView user_list;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        FindViewsById();

    }


    private void FindViewsById () {

        userImg = itemView.findViewById(R.id.userImg);
        nameOne = itemView.findViewById(R.id.nameOne);
        userAge = itemView.findViewById(R.id.userAge);
        userGender = itemView.findViewById(R.id.userGender);
        userBloodG = itemView.findViewById(R.id.userBloodG);
        userEyeC = itemView.findViewById(R.id.userEyeC);
        userBirthDay = itemView.findViewById(R.id.userBirthDay);
        btn_user_phone = itemView.findViewById(R.id.btn_user_phone);
        btn_user_email = itemView.findViewById(R.id.btn_user_email);
        btn_user_web = itemView.findViewById(R.id.btn_user_web);
        moreInfo = itemView.findViewById(R.id.moreInfo);
        user_list = itemView.findViewById(R.id.user_list);

    }


}
