package org.apollo.game.release.r317;

import org.apollo.game.message.impl.ItemActionMessage;
import org.apollo.net.codec.game.*;
import org.apollo.net.release.MessageDecoder;

/**
 * A {@link MessageDecoder} for the third {@link ItemActionMessage}.
 *
 * @author Graham
 */
public final class ThirdItemActionMessageDecoder extends MessageDecoder<ItemActionMessage> {

	@Override
	public ItemActionMessage decode(GamePacket packet) {
		GamePacketReader reader = new GamePacketReader(packet);

		int interfaceId = (int) reader.getUnsigned(DataType.SHORT, DataOrder.LITTLE);
		int id = (int) reader.getUnsigned(DataType.SHORT, DataTransformation.ADD);
		int slot = (int) reader.getUnsigned(DataType.SHORT, DataTransformation.ADD);

		return new ItemActionMessage(3, interfaceId, id, slot);
	}

}