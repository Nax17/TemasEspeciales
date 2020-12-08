package com.example.tarea2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.emredavarci.noty.Noty;

public class PermissionsActivity extends AppCompatActivity {

    Button storage, location, camera, phone, contacts;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permissions);
        storage = findViewById(R.id.storage_btn);
        location = findViewById(R.id.location_btn);
        camera = findViewById(R.id.camera_btn);
        phone = findViewById(R.id.phone_btn);
        contacts = findViewById(R.id.contacts_btn);
        relativeLayout = findViewById(R.id.relative);
        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(PermissionsActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
                    Noty.init(PermissionsActivity.this, "Permission already granted.", relativeLayout, Noty.WarningStyle.ACTION).setActionText("OPEN").setClickListener(new Noty.ClickListener() {
                        @Override
                        public void onClick(Noty warning) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_GET_CONTENT);
                            intent.setType("file/*");
                            startActivity(intent);
                        }
                    }).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }else{
                    Noty.init(PermissionsActivity.this, "Please request permission.", relativeLayout, Noty.WarningStyle.ACTION).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(PermissionsActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED){
                    Noty.init(PermissionsActivity.this, "Permission already granted.", relativeLayout, Noty.WarningStyle.ACTION).setActionText("OPEN").setClickListener(new Noty.ClickListener() {
                        @Override
                        public void onClick(Noty warning) {
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            startActivity(intent);
                        }
                    }).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }else{
                    Noty.init(PermissionsActivity.this, "Please request permission.", relativeLayout, Noty.WarningStyle.ACTION).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(PermissionsActivity.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED){
                    Noty.init(PermissionsActivity.this, "Permission already granted.", relativeLayout, Noty.WarningStyle.ACTION).setActionText("OPEN").setClickListener(new Noty.ClickListener() {
                        @Override
                        public void onClick(Noty warning) {
                            Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                            startActivity(intent);
                        }
                    }).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }else{
                    Noty.init(PermissionsActivity.this, "Please request permission.", relativeLayout, Noty.WarningStyle.ACTION).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(PermissionsActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
                    Noty.init(PermissionsActivity.this, "Permission already granted.", relativeLayout, Noty.WarningStyle.ACTION).setActionText("OPEN").setClickListener(new Noty.ClickListener() {
                        @Override
                        public void onClick(Noty warning) {
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            startActivity(intent);
                        }
                    }).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }else{
                    Noty.init(PermissionsActivity.this, "Please request permission.", relativeLayout, Noty.WarningStyle.ACTION).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }
            }
        });
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(PermissionsActivity.this, Manifest.permission.READ_CONTACTS) == PackageManager.PERMISSION_GRANTED){
                    Noty.init(PermissionsActivity.this, "Permission already granted.", relativeLayout, Noty.WarningStyle.ACTION).setActionText("OPEN").setClickListener(new Noty.ClickListener() {
                        @Override
                        public void onClick(Noty warning) {
                            Intent intent = new Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI);
                            startActivity(intent);
                        }
                    }).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }else{
                    Noty.init(PermissionsActivity.this, "Please request permission.", relativeLayout, Noty.WarningStyle.ACTION).setWarningBoxBgColor("#ff5c33").setWarningTappedColor("#ff704d").setWarningBoxPosition(Noty.WarningPos.BOTTOM).setAnimation(Noty.RevealAnim.FADE_IN, Noty.DismissAnim.BACK_TO_BOTTOM, 400, 400).show();
                }
            }
        });
    }
}