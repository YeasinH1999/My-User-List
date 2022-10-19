package com.yeasinhproject.myuserlist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<MyUserList> myUserList_list;
    private Context context;

    // ----------------------- MyAdapter Constructor -----------------------------------


    public MyAdapter(List<MyUserList> myUserList_list, Context context) {
        this.myUserList_list = myUserList_list;
        this.context = context;
    }

    // ----------------------- MyAdapter Constructor Ends Here ---------------------------


    // ----------------------- MyAdapter Method Starts Here ---------------------------
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.userslist, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(myView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        MyUserList myUserListPosition = myUserList_list.get(position);

        Picasso.get().load(myUserListPosition.getUserImg()).placeholder(R.drawable.warning).
                into(holder.userImg);

        SetText(holder, myUserListPosition);

        LoadAnimation(holder);

        SetOnClickListener(holder, myUserListPosition, context);

    }

    @Override
    public int getItemCount() {

        return myUserList_list.size();
    }
    // ----------------------- MyAdapter Method Ends Here ---------------------------


    //----------------------------------- Private Method -----------------------------------------\\

    private void SetText(MyViewHolder holder, MyUserList myUserListPosition) {

        holder.nameOne.setText(myUserListPosition.getNameOne() + " " + myUserListPosition.getLastName());
        holder.userAge.setText("Age : " + myUserListPosition.getUserAge());
        holder.userGender.setText("Gender : " + myUserListPosition.getUserGender());
        holder.userBloodG.setText("Blood : " + myUserListPosition.getUserBloodG());
        holder.userEyeC.setText("Eye : " + myUserListPosition.getUserEyeC());
        holder.userBirthDay.setText("BirthDay : " + myUserListPosition.getUserBirthDay());
        holder.btn_user_phone.setText(myUserListPosition.getBtn_user_phone());
        holder.btn_user_email.setText(myUserListPosition.getBtn_user_email());
        holder.btn_user_web.setText(myUserListPosition.getBtn_user_web());

    }


    private void LoadAnimation(MyViewHolder holder) {

        holder.nameOne.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_two));
        holder.userAge.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_two));
        holder.userGender.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_two));
        holder.userBloodG.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_two));
        holder.userEyeC.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_two));
        holder.userBirthDay.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_two));

        holder.user_list.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_scale));

    }


    private void SetOnClickListener(MyViewHolder holder, MyUserList myUserListPosition, Context context) {

        holder.btn_user_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent number = new Intent(Intent.ACTION_DIAL);
                number.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                number.setData(Uri.parse("tel:" + holder.btn_user_phone.getText().toString()));
                context.startActivity(number);

            }
        });

        holder.btn_user_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Inemail = new Intent(Intent.ACTION_SEND);
                Inemail.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Inemail.putExtra(Intent.EXTRA_EMAIL, new String[]{holder.btn_user_email.getText().toString()});
                Inemail.putExtra(Intent.EXTRA_SUBJECT, "Your Subject");

                //need this to prompt`enter code here`s email client only
                Inemail.setType("message/rfc822");

                Intent chooserIntent = Intent.createChooser(Inemail, "Choose an Email Client");
                chooserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(chooserIntent);

            }
        });

        holder.btn_user_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                webIntent.setData(Uri.parse("https://" + holder.btn_user_web.getText().toString()));
                context.startActivity(webIntent);
            }
        });


        holder.moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                UserDetails.UserAddress = myUserListPosition.userAddress;
                UserDetails.UserCity = myUserListPosition.userCity;
                UserDetails.UserPostalCode = myUserListPosition.userPostalCode;
                UserDetails.UserState = myUserListPosition.userState;
                UserDetails.UserCardNum = myUserListPosition.userCardNum;
                UserDetails.Tv_userCardType = myUserListPosition.userCardType;
                UserDetails.Tv_userCurrency = myUserListPosition.userCurrency;
                UserDetails.Tv_userCardExpire = myUserListPosition.userCardExpire;
                UserDetails.Tv_userCard_iban = myUserListPosition.userCard_iban;
                UserDetails.Tv_userComName = myUserListPosition.userComName;
                UserDetails.Tv_userComTitle = myUserListPosition.userComTitle;
                UserDetails.Tv_userComDep = myUserListPosition.userComDep;
                UserDetails.Tv_userComAdd = myUserListPosition.userComAdd;

                Intent intent = new Intent(context.getApplicationContext(), UserDetails.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    //----------------------------------- Private Method -----------------------------------------\\


} // MyAdapter Class Ends Here ------------------------------------------
