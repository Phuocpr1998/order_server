package com.study.android.testorderserver;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class Serializer implements JsonSerializer<Order> {
    @Override
    public JsonElement serialize(Order src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.addProperty("email_owner", src.getEmail_owner());
        object.addProperty("email_guest", src.getEmail_guest());
        object.addProperty("name_rest", src.getName_rest());
        object.addProperty("id_rest", src.getId_rest());
        object.addProperty("id_discount", src.getId_discount());
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeHierarchyAdapter(OrderSerialize.class, new OrderSerialize());
        Gson gson = builder.create();
        object.addProperty("order", gson.toJson(src.getOrder(), Offer.class));
        return object;
    }
}
