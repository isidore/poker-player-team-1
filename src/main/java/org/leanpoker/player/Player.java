package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonObject j = request.getAsJsonObject();

        int current_buy_in = j.get("current_buy_in").getAsInt();
        int mimimum_raise = j.get("minimum_raise").getAsInt();
        return mimimum_raise;
    }

    public static void showdown(JsonElement game) {
    }
}
