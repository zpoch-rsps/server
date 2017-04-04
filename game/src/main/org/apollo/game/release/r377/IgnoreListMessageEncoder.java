package org.apollo.game.release.r377;

import org.apollo.game.message.impl.IgnoreListMessage;
import org.apollo.net.codec.game.DataType;
import org.apollo.net.codec.game.GamePacket;
import org.apollo.net.codec.game.GamePacketBuilder;
import org.apollo.net.release.MessageEncoder;
import org.apollo.util.NameUtil;

import java.util.List;

/**
 * A {@link MessageEncoder} for the {@link IgnoreListMessage}.
 *
 * @author Major
 */
public final class IgnoreListMessageEncoder extends MessageEncoder<IgnoreListMessage> {

	@Override
	public GamePacket encode(IgnoreListMessage message) {
		GamePacketBuilder builder = new GamePacketBuilder(226);

		List<String> usernames = message.getUsernames();
		for (String username : usernames) {
			builder.put(DataType.LONG, NameUtil.encodeBase37(username));
		}

		return builder.toGamePacket();
	}

}