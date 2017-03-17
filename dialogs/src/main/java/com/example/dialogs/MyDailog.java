package com.example.dialogs;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDailog extends DialogFragment {

    public static final String DIALOG_ALERT = "alert";
    public static final String DIALOG_DATE_PICKER = "datePicker";
    public static final String DIALOG_TIME_PICKER = "timePicker";
    public static final String DIALOG_PROGRESS = "progress";
    public static final String DIALOG_CUSTOM = "custom";


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Dialog dialog = null;

        if (getTag().equals(DIALOG_ALERT)) dialog = showAlertDialog();
        if (getTag().equals(DIALOG_DATE_PICKER)) dialog = showDatePicker();
        if (getTag().equals(DIALOG_TIME_PICKER)) dialog = showTimePicker();
        if (getTag().equals(DIALOG_PROGRESS)) dialog = showProgress();
        if (getTag().equals(DIALOG_CUSTOM)) dialog = showCustomDialog();

        return dialog;
    }

    private Dialog showCustomDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.custom_dialog,null,false);
        view.findViewById(R.id.btnLogin).setOnClickListener(view1 -> mt("Login Clicked"));
        builder.setView(view);
        return builder.create();

    }

    private Dialog showProgress() {

        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle(R.string.title);
        progressDialog.setMessage(getResources().getString(R.string.message));
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        return progressDialog;

    }

    private Dialog showTimePicker() {

        TimePickerDialog timePicker =  new TimePickerDialog(getActivity(),(view,hourofday,minute)->mt("" + hourofday + " : "+ minute),6,8,false);
        return timePicker;

    }

    private Dialog showDatePicker() {
        DatePickerDialog datePicker = new DatePickerDialog(getActivity(), (view, year, month, dayofmonth) -> 
            mt(" " + dayofmonth + " - " + (month+1) + " - " + year), 2017, 0 , 1);
        return datePicker;
    }

    private AlertDialog showAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(R.mipmap.ic_launcher)
                .setMessage(R.string.message)
                .setTitle(R.string.title)
                .setPositiveButton(R.string.btnYes,this::alertButtonClicked)
                .setNegativeButton(R.string.btnNo,this::alertButtonClicked);
        return builder.create();
    }

    private void alertButtonClicked(DialogInterface di,int which){
        if (which == DialogInterface.BUTTON_POSITIVE){
            mt("Yes my name is Dilip Virkud");
        }
        else if (which == DialogInterface.BUTTON_NEGATIVE){
            mt("No my name is Ajinkya Virkud");
        }
        else{
            mt("Nothing");
        }
    }
    private void mt(String msg){
        Toast.makeText(getActivity(), msg , Toast.LENGTH_SHORT).show();

    }
}
