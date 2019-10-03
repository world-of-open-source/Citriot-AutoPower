package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends Activity implements View.OnClickListener {

    private ToggleButton button_light1, button_light2, button_light3, button_fan;
    String IP = "http://192.168.1.190/";
    int buttonNum;
    //private EditText ipAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Reached here1");
        //ipAddress = findViewById(R.id.iptext);//a

        System.out.println("Reached here2");

        //while (ipAddress.getText().toString().equals("")) {
        //  Toast.makeText(MainActivity.this, "Please enter the ip address...", Toast.LENGTH_SHORT).show();
        //}

        addClick();

    }

    public void addClick() {

        button_light1 = (ToggleButton) findViewById(R.id.toggleButton1);
        System.out.println("Reached here3");
        button_light2 = (ToggleButton) findViewById(R.id.toggleButton2);
        System.out.println("Reached here4");
        button_fan = (ToggleButton) findViewById(R.id.toggleButton3);
        System.out.println("Reached here5");
        button_light3 = (ToggleButton) findViewById(R.id.toggleButton4);

        button_light1.setOnClickListener(this);
        System.out.println("Reached here6");
        button_light2.setOnClickListener(this);
        System.out.println("Reached here7");
        button_light3.setOnClickListener(this);
        System.out.println("Reached here8");
        button_fan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        buttonNum = view.getId();
        new Task().execute(IP);
    }

    public class Task extends AsyncTask<String, String, String> {

        @SuppressLint("WrongThread")
        @Override
        protected String doInBackground(String... params) {
            {

                //  while (ipAddress.getText().toString().equals((""))) {

                //    System.out.println("Reached here10");

                //  Toast.makeText(MainActivity.this, "Please enter the ip address...", Toast.LENGTH_SHORT).show();
                //  }

                String url;
                switch (buttonNum) {

                    case R.id.toggleButton1:

                        System.out.println("Reached here11");
                        if (button_light1.isChecked()) {
                            url = IP + "r1on";

                            try {
                                URL K = new URL(url);
                                //System.out.println("Reached here12");
                                URLConnection urlConnection = K.openConnection();
                                System.out.println(K);
                                HttpURLConnection C = null;
                                C = (HttpURLConnection) urlConnection;
                                //System.out.println(C);
                                C.setRequestMethod("GET");
                                //System.out.println("Reached here20");
                                C.setReadTimeout(1000);
                                //System.out.println("Reached here21");
                                C.setConnectTimeout(1500);
                                //System.out.println("Reached here22");
                                C.connect();
                                System.out.println("reached112");
                                int responseCode = C.getResponseCode();
                                System.out.println(responseCode);
                                System.out.println("Reached here99");
                            } catch (IOException e) {
                                System.out.println("Reached here111111");
                                e.printStackTrace();
                            }
                            finally {
                                System.out.println("Finally1");
                            }
                        } else {
                            url = IP + "r1off";

                            try {
                                URL K = new URL(url);
                                System.out.println("Reached here12");
                                URLConnection urlConnection = K.openConnection();
                                System.out.println("Reached here13");
                                HttpURLConnection C = null;
                                C = (HttpURLConnection) urlConnection;
                                System.out.println("Reached here14");
                                C.setRequestMethod("GET");
                                int responseCode = C.getResponseCode();
                                System.out.println(responseCode);
                                System.out.println("Reached here99");
                            } catch (IOException e) {
                                System.out.println("Reached here111111");
                                e.printStackTrace();
                            }
                            finally {
                                System.out.println("Finally2");
                            }
                        }
                        break;

                    case R.id.toggleButton2:


                        System.out.println("Reached here11");
                        if (button_light2.isChecked()) {
                            url = IP + "r2on";

                            try {
                                URL K = new URL(url);
                                //System.out.println("Reached here12");
                                URLConnection urlConnection = K.openConnection();
                                System.out.println(K);
                                HttpURLConnection C = null;
                                C = (HttpURLConnection) urlConnection;
                                //System.out.println(C);
                                C.setRequestMethod("GET");
                                //System.out.println("Reached here20");
                                C.setReadTimeout(1000);
                                //System.out.println("Reached here21");
                                C.setConnectTimeout(1500);
                                //System.out.println("Reached here22");
                                C.connect();
                                System.out.println("reached112");
                                int responseCode = C.getResponseCode();
                                System.out.println(responseCode);
                                System.out.println("Reached here99");
                            } catch (IOException e) {
                                System.out.println("Reached here111111");
                                e.printStackTrace();
                            }
                            finally {
                                System.out.println("Finally1");
                            }
                        } else {
                            url = IP + "r2off";

                            try {
                                URL K = new URL(url);
                                System.out.println("Reached here12");
                                URLConnection urlConnection = K.openConnection();
                                System.out.println("Reached here13");
                                HttpURLConnection C = null;
                                C = (HttpURLConnection) urlConnection;
                                System.out.println("Reached here14");
                                C.setRequestMethod("GET");
                                int responseCode = C.getResponseCode();
                                System.out.println(responseCode);
                                System.out.println("Reached here99");
                            } catch (IOException e) {
                                System.out.println("Reached here111111");
                                e.printStackTrace();
                            }
                            finally {
                                System.out.println("Finally2");
                            }
                        }
                        break;
                    //Send a string to nodemcu as a command


                    case R.id.toggleButton3:

                        System.out.println("Reached here11");
                        if (button_light3.isChecked()) {
                            url = IP + "r3on";

                            try {
                                URL K = new URL(url);
                                //System.out.println("Reached here12");
                                URLConnection urlConnection = K.openConnection();
                                System.out.println(K);
                                HttpURLConnection C = null;
                                C = (HttpURLConnection) urlConnection;
                                //System.out.println(C);
                                C.setRequestMethod("GET");
                                //System.out.println("Reached here20");
                                C.setReadTimeout(1000);
                                //System.out.println("Reached here21");
                                C.setConnectTimeout(1500);
                                //System.out.println("Reached here22");
                                C.connect();
                                System.out.println("reached112");
                                int responseCode = C.getResponseCode();
                                System.out.println(responseCode);
                                System.out.println("Reached here99");
                            } catch (IOException e) {
                                System.out.println("Reached here111111");
                                e.printStackTrace();
                            }
                            finally {
                                System.out.println("Finally1");
                            }
                        } else {
                            url = IP + "r3off";

                            try {
                                URL K = new URL(url);
                                System.out.println("Reached here12");
                                URLConnection urlConnection = K.openConnection();
                                System.out.println("Reached here13");
                                HttpURLConnection C = null;
                                C = (HttpURLConnection) urlConnection;
                                System.out.println("Reached here14");
                                C.setRequestMethod("GET");
                                int responseCode = C.getResponseCode();
                                System.out.println(responseCode);
                                System.out.println("Reached here99");
                            } catch (IOException e) {
                                System.out.println("Reached here111111");
                                e.printStackTrace();
                            }
                            finally {
                                System.out.println("Finally2");
                            }
                        }
                        break;

                    case R.id.toggleButton4:

                        System.out.println("Reached here11");
                        if (button_fan.isChecked()) {
                            url = IP + "r4on";

                            try {
                                URL K = new URL(url);
                                //System.out.println("Reached here12");
                                URLConnection urlConnection = K.openConnection();
                                System.out.println(K);
                                HttpURLConnection C = null;
                                C = (HttpURLConnection) urlConnection;
                                //System.out.println(C);
                                C.setRequestMethod("GET");
                                //System.out.println("Reached here20");
                                C.setReadTimeout(1000);
                                //System.out.println("Reached here21");
                                C.setConnectTimeout(1500);
                                //System.out.println("Reached here22");
                                C.connect();
                                System.out.println("reached112");
                                int responseCode = C.getResponseCode();
                                System.out.println(responseCode);
                                System.out.println("Reached here99");
                            } catch (IOException e) {
                                System.out.println("Reached here111111");
                                e.printStackTrace();
                            }
                            finally {
                                System.out.println("Finally1");
                            }
                        } else {
                            url = IP + "r4off";

                            try {
                                URL K = new URL(url);
                                System.out.println("Reached here12");
                                URLConnection urlConnection = K.openConnection();
                                System.out.println("Reached here13");
                                HttpURLConnection C = null;
                                C = (HttpURLConnection) urlConnection;
                                System.out.println("Reached here14");
                                C.setRequestMethod("GET");
                                int responseCode = C.getResponseCode();
                                System.out.println(responseCode);
                                System.out.println("Reached here99");
                            } catch (IOException e) {
                                System.out.println("Reached here111111");
                                e.printStackTrace();
                            }
                            finally {
                                System.out.println("Finally2");
                            }
                        }
                        break;

                    default:
                        break;
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            System.out.println("ReachedPOSTEXE");
        }
    }
}