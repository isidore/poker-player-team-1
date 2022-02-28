package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonObject j = request.getAsJsonObject();

        return j.get("current_buy_in").getAsInt();
    }

    public static void showdown(JsonElement game) {
    }
}
