package com.example.studentportal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AddPortal extends AppCompatActivity {

    public EditText mNewPortalName;
    public EditText mNewPortalLink;

    private ImageButton addConfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_portal);

        mNewPortalName = findViewById(R.id.portalNameText);
        mNewPortalLink = findViewById(R.id.portalLinkText);

        addConfirm = findViewById(R.id.addConfirmButton);

        // add name and link to list when button is pressed

        addConfirm.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                // Get user input
                String portalName = mNewPortalName.getText().toString();
                String portalLink = mNewPortalLink.getText().toString();

                if (!portalName.equals("") && !portalLink.equals("")) {
                    // Add input to list

                    mNewPortalName.setText(portalName);
                    mNewPortalLink.setText(portalLink);


                    Intent intent = new Intent(AddPortal.this, MainActivity.class);
                    intent.putExtra("Name", portalName);
                    intent.putExtra("Link", portalLink);
                    startActivity(intent);

                    // Clear the input
                    resetEntry();
                } else {

                    Toast invalidEntry = Toast.makeText(AddPortal.this,
                            "Don't leave anything blank", Toast.LENGTH_LONG);
                    invalidEntry.show();
                }
            }

        });


    }

    // Clear the input
    private void resetEntry() {
        mNewPortalName.setText("");
        mNewPortalLink.setText("");

    }

}
