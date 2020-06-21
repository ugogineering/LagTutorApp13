package com.lagtutor.android.lagtutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdmissionRequirements extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.lagtutor.lagtutorapp.extra.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.lagtutor.lagtutorapp.extra.MESSAGE2";
    private String myMessageHeader;
    private String myMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_requirements);
    }

    public void launchCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_of_arts);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.faculty_arts_details);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchBasicMedSciCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_of_basic_medical_sciences);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.faculty_basic_med_sci);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchBizAdCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_of_business_administration);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.faculty_bus_admin);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchClinicalSciencesCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_cli_sci);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.text_faculty_of_clinical_sciences);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchEducationCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_edu);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.text_faculty_of_education);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchEngineeringCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_eng);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.text_faculty_of_engineering);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchEnvironmentalScienceCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_env_sci);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.text_faculty_of_environmental_sciences);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchLawCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_law);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.text_faculty_of_law);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchPharmacyCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_pharm);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.text_faculty_of_pharmacy);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchScienceCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_sci);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.text_faculty_of_science);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }

    public void launchSocialScienceCourseRequirements(View view) {
        Intent intent2 = new Intent(this, CourseRequirements.class);
        myMessageHeader = getString(R.string.faculty_soc_sci);
        intent2.putExtra(EXTRA_MESSAGE2, myMessageHeader);
        myMessage = getString(R.string.text_faculty_of_social_science);
        intent2.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(intent2);
    }
}
