package com.example.simplenav;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TwokViewHolder extends RecyclerView.ViewHolder {
    private TextView txtName, txtText;

    public TwokViewHolder(@NonNull View itemView) {
        super(itemView);
        txtName = itemView.findViewById(R.id.name);
        txtText = itemView.findViewById(R.id.twok);
    }

    public void updateContent(Twok twok) {
        txtName.setText(twok.name);
        txtText.setText(twok.text);
    }
}
