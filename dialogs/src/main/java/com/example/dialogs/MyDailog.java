package com.example.dialogs;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDailog extends DialogFragment {

    public static final String DIALOG_ALERT = "alert";
    public static final String DIALOG_DATE_PICKER = "datePicker";


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Dialog dialog = null;

        if (getTag().equals(DIALOG_ALERT)) dialog = showAlertDialog();
        if (getTag().equals(DIALOG_DATE_PICKER)) dialog = showDatePicker();

        return dialog;
    }

    private Dialog showDatePicker() {
        DatePickerDialog datePicker = new DatePickerDialog(getActivity(), null, 2017, 0 , 1);
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
