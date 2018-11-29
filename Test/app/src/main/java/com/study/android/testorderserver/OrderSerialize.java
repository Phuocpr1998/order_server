package com.study.android.testorderserver;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class OrderSerialize implements JsonSerializer<Offer> {
    @Override
    public JsonElement serialize(Offer src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.addProperty("id", -1);
        object.addProperty("namedish", src.getNamedish());
        object.addProperty("discount_percent", src.getDiscount_percent());
        object.addProperty("guest_email", src.getGuest_email());
        object.addProperty("total", src.getTotal());
        object.addProperty("status", src.getStatus());
        object.addProperty("date_order", src.getDateString());
        return object;
    }
}
