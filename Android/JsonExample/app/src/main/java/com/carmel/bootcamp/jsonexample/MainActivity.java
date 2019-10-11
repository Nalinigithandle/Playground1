package com.carmel.bootcamp.jsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    String JSON_STRING ="{\"person\":{\"name\":\"Sameera Rautela\",\"conversation\":Integer porta tellus a lectus volutpat volutpat. Fusce ac fringilla justo, sed iaculis purus. In laoreet non est vel euismod. Ut gravida pretium justo id pretium. Aliquam elementum pellentesque lectus. Nulla odio elit, feugiat non ultrices ut, condimentum ac augue. Vivamus consectetur posuere dui at consectetur. Nam neque lacus, luctus eget dapibus a, pellentesque ut quam. Duis et tristique tellus. Ut sed mauris nec purus convallis venenatis non at sem. Donec a purus porta, suscipit lacus consectetur, varius nisi.}}";
    String name, conversation;
    TextView personName, personConversation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personName =(TextView) findViewById(R.id.personname);
        personConversation =(TextView) findViewById(R.id.personconversation);

        try {
            JSONObject object=new JSONObject(JSON_STRING);
            JSONObject person=object.getJSONObject("person");
            name=person.getString("name");
            conversation=person.getString("conversation");
            personName.setText("Name:"+name);
            personConversation.setText("Conversation:"+conversation);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
