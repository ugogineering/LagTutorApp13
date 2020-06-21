package com.lagtutor.android.lagtutorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.app.ShareCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    /**
     * Creates the content view and toolbar, sets up the drawer layout and the
     * action bar toggle, and sets up the navigation view.
     * @param savedInstanceState    Saved instance state bundle.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        if (fab != null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Feel free to reach us on WhatsApp on +2348092327228", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        if(drawer != null) {
            drawer.addDrawerListener(toggle);
        }
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }
    }

    /** Handles the Back button: closes the nav drawer. */
    @Override
    public void onBackPressed(){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if(drawer != null ) {
            if(drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
    }

    /* Inflates the options menu @param menu Menu to inflate
    * @return Returns true if menu is inflated. */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /* Handles a click on the Settings item in the options menu.
    * @param item Item in options menu that was clicked
    * @return Returns true if the item was Settings.
     */
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        // Handle action bar item clicks here. The action bar will automatically
        // handle clicks on the Home/Up button, so long as you specify a parent
        // activity in AndroidManifest.xm.
        int id = item.getItemId();

        // no inspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    /**
     * Handles a navigation drawer item click. It detects which item was
     * clicked and displays a toast message showing which item.
     * @param item  Item in the navigation drawer
     * @return      Returns true after closing the nav drawer
     */
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.nav_home:
                // Handle home action (Close Drawer).
                drawer.closeDrawer(GravityCompat.START);

                return true;
            case R.id.nav_utme:
                // Handle UTME action
                drawer.closeDrawer(GravityCompat.START);
                Intent intent1 = new Intent(this, utme.class);
                startActivity(intent1);
                return true;

            case R.id.nav_foundation:
                // Handle Foundation action
                drawer.closeDrawer(GravityCompat.START);
                Intent intent2 = new Intent(this, Foundation.class);
                startActivity(intent2);
                return true;

            case R.id.nav_mba:
                // Handle MBA action
                drawer.closeDrawer(GravityCompat.START);
                Intent intent3 = new Intent(this, UnilagMba.class);
                startActivity(intent3);
                return true;

            case R.id.nav_about:
                // Handle About action
                drawer.closeDrawer(GravityCompat.START);
                Intent intent4 = new Intent(this, AboutApp.class);
                startActivity(intent4);
                return true;

            case R.id.nav_cbt:
                // Handle About action
                drawer.closeDrawer(GravityCompat.START);
                Intent intent5 = new Intent(this, Cbt.class);
                startActivity(intent5);
                return true;

            case R.id.nav_caseray:
                // Handle About action
                drawer.closeDrawer(GravityCompat.START);
                Intent intent7 = new Intent(this, CaseraySolutions.class);
                startActivity(intent7);
                return true;

            case R.id.nav_past_questions:
                // Handle the past questions action (for now display a toast).
                drawer.closeDrawer(GravityCompat.START);
                // displayToast(getString(R.string.past_questions));
                //
                Intent intent6 = new Intent(this, PastQuestions.class);
                startActivity(intent6);
                 //
                return true;


            case R.id.nav_share:
                // Handle the share action.
                drawer.closeDrawer(GravityCompat.START);

                String txt = getString(R.string.share_this_app_text);
                String mimeType = "text/plain";
                ShareCompat.IntentBuilder
                        .from(this)
                        .setType(mimeType)
                        .setChooserTitle(R.string.share_this_app)
                        .setText(txt)
                        .startChooser();

                return true;
            case R.id.nav_contact:
                // Handle the send action (for now display a toast).
                drawer.closeDrawer(GravityCompat.START);
                Intent intent8 = new Intent(this, ContactLagtutor.class);
                startActivity(intent8);
                return true;
            default:
                return false;
        }
    }

    /**
     * Displays a toast message.
     * @param message   Message to display in toast
     */
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void contactLagtutor(View view) {
        Intent intent8 = new Intent(this, ContactLagtutor.class);
        startActivity(intent8);
    }
}
