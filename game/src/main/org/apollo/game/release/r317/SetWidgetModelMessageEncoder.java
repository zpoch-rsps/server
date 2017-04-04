package org.apollo.game.release.r317;

import org.apollo.game.message.impl.SetWidgetModelMessage;
import org.apollo.net.codec.game.*;
import org.apollo.net.release.MessageEncoder;

/**
 * A {@link MessageEncoder} for the {@link SetWidgetModelMessage}.
 *
 * @author Major
 */
public class SetWidgetModelMessageEncoder extends MessageEncoder<SetWidgetModelMessage> {

	@Override
	public GamePacket encode(SetWidgetModelMessage message) {
		GamePacketBuilder builder = new GamePacketBuilder(8);

		builder.put(DataType.SHORT, DataOrder.LITTLE, DataTransformation.ADD, message.getInterfaceId());
		builder.put(DataType.SHORT, message.getModel());

		return builder.toGamePacket();
	}

}
