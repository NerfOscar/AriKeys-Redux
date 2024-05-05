package org.nerfoscar.arikeysredux.fabric;

import org.nerfoscar.arikeysredux.fabric.mixin.AKKeyboardFabricMixin;
import org.nerfoscar.arikeysredux.util.AriKeysChannels;
import org.nerfoscar.arikeysredux.util.network.KeyPressData;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.network.PacketByteBuf;

public class AriKeysPlatformImpl {
	public static void sendHandshake() {
		ClientPlayNetworking.send(AriKeysChannels.HANDSHAKE_CHANNEL, PacketByteBufs.empty());
	}

	public static KeyBinding getKeyBinding(InputUtil.Key code) {
		return AKKeyboardFabricMixin.getKeyBindings().get(code);
	}

	public static void sendKey(KeyPressData data) {
		PacketByteBuf buf = PacketByteBufs.create();
		buf.writeByte(0);
		data.write(buf);
		ClientPlayNetworking.send(AriKeysChannels.KEY_CHANNEL, buf);
	}
}
