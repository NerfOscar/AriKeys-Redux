package org.nerfoscar.arikeysredux;

public class AriKeysChannels {
    // These channels are listened to either by the server or client.
    public static final String HANDSHAKE = "arikeysredux:greeting";
    public static final String ADD_KEY = "arikeysredux:addkey";
    public static final String KEY_PRESS = "arikeysredux:keybind";
    public static final String LOAD_KEYS = "arikeysredux:load";
}