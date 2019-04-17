package com.example.studentportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;

class StudentPortal{

    private String mPortalName;
    private String mPortalLink;

    static public List<String> mPortalNameList;
    static public List<String> mPortalLinkList;

    StudentPortal(String mPortalName, String mPortalLink){
        this.mPortalName = mPortalName;
        this.mPortalLink = mPortalLink;
        this.mPortalNameList = mPortalNameList;
        this.mPortalLinkList = mPortalLinkList;
    }

    String getmPortalName() {
        return mPortalName;
    }

    public void setmPortalName(String mPortalName) {
        this.mPortalName = mPortalName;
    }

    String getmPortalLink() {
        return mPortalLink;
    }

    public void setmPortalLink(String mPortalLink) {
        this.mPortalLink = mPortalLink;
    }




    static final String[] PRE_DEFINED_PORTAL_NAMES = {
            "VLO",
            "DCMI",
            "DME",
            "MAD",
            "Resultaten"
    };

    static final String[] PRE_DEFINED_PORTAL_LINKS = {
            "https://vlo.informatica.hva.nl/",
            "https://www.hva.nl/faculteit/fdmci/digitale-media-en-creatieve-industrie.html",
            "https://sites.google.com/view/designingmobileexperiences2018/",
            "https://www.android-development.app/#!/home",
            "https://sis.hva.nl:8011/psc/S2PRD/EMPLOYEE/HRMS/c/SNS_MENU_FLD.SNS_SS_STD_RES_FL.GBL?/"
    };
}
