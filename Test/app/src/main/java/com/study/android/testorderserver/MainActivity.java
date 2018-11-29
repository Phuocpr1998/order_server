package com.study.android.testorderserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
    private Socket msocket;
    private Button  order;

    {
        try {
            msocket = IO.socket("http://foodmap-notifyserver.herokuapp.com/");
        } catch (URISyntaxException e) {}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msocket.connect();
        order = (Button) findViewById(R.id.order);
        msocket.emit("register", "chauhoangphuc@gmail.com");
        msocket.on("receive_result", onReceice);


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Offer offer = new Offer("anonymous", 10, "chauhoangphuc@gmail.com", 2, 0,  Calendar.getInstance().getTime());
                Order order = new Order("the.dreamers.k16@gmail.com", "chauhoangphuc@gmail.com", "Quán ăn chay", 4, 1, offer);
                GsonBuilder builder = new GsonBuilder();
                builder.registerTypeHierarchyAdapter(Serializer.class, new Serializer());
                Gson gson = builder.create();
                String req =  gson.toJson(order, Order.class);
                System.out.printf(req);
                Toast.makeText(MainActivity.this, req, Toast.LENGTH_LONG).show();
                msocket.emit("send_order", req);
            }
        });

    }

    private Emitter.Listener onReceice = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    String data = args[0].toString();
                    Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();
                }
            });
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        msocket.disconnect();
    }
}
