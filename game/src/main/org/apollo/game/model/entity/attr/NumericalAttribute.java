package org.apollo.game.model.entity.attr;

import com.google.common.primitives.Longs;

/**
 * An {@link Attribute} with a numerical value.
 *
 * @author Major
 */
public final class NumericalAttribute extends Attribute<Number> {

	/**
	 * Creates the number attribute.
	 *
	 * @param value The value of this attribute.
	 */
	public NumericalAttribute(Number value) {
		super(typeOf(value), value);
	}

	/**
	 * Gets the {@link AttributeType} of number this attribute is.
	 *
	 * @param value The value of this attribute.
	 * @return The type.
	 */
	private static AttributeType typeOf(Number value) {
		return value instanceof Double ? AttributeType.DOUBLE : AttributeType.LONG;
	}

	@Override
	public byte[] encode() {
		long encoded = type == AttributeType.DOUBLE ? Double.doubleToLongBits((double) value) : (long) value;
		return Longs.toByteArray(encoded);
	}

	@Override
	public String toString() {
		return type == AttributeType.DOUBLE ? Double.toString((double) value) : Long.toString((long) value);
	}

}