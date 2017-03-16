package com.example.dialogs;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDailog extends DialogFragment {

    public static final String DIALOG_ALERT = "alert";


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Dialog dialog = null;

        if (getTag().equals(DIALOG_ALERT)){
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setIcon(R.mipmap.ic_launcher)
                    .setMessage(R.string.message)
                    .setTitle(R.string.title)
                    .setPositiveButton(R.string.btnYes,null)
                    .setNegativeButton(R.string.btnNo,null);
            dialog = builder.create();
        }

        return dialog;
    }
}
