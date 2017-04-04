package org.apollo.game.plugin;

import java.io.InputStream;

/**
 * Represents some sort of environment that plugins could be executed in, e.g. {@code javax.script} or Jython.
 *
 * @author Graham
 */
public interface PluginEnvironment {

	/**
	 * Parses the input stream.
	 *
	 * @param is   The input stream.
	 * @param name The name of the file.
	 */
	void parse(InputStream is, String name);

	/**
	 * Sets the context for this environment.
	 *
	 * @param context The context.
	 */
	void setContext(PluginContext context);

}