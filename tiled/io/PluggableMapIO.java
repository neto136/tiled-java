/*
 *  Tiled Map Editor, (c) 2004
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 * 
 *  Adam Turk <aturk@biggeruniverse.com>
 *  Bjorn Lindeijer <b.lindeijer@xs4all.nl>
 */

package tiled.io;

import java.util.Stack;

/**
 * This is the interface for all Tiled I/O plugins, whether they
 * load, save, or both. The PluginClassLoader also uses this to
 * check the supported file extensions 
 */
public interface PluggableMapIO
{
    /**
     * Lists supported file extensions. This function is used by the
     * editor to find the plugin to use for a specific file extension.
     * 
     * @return a comma delimited string of supported file extensions
     * @throws Exception
     */
    public String getFilter() throws Exception;

    /**
     * Returns a short description of the plugin, or the plugin name. This 
     * string is displayed in the list of loaded plugins under the
     * Help menu in Tiled.
     * 
     * @return A short name or description  
     */
    public String getName();

    /**
     * Returns a long description (no limit) that details the plugin's 
     * capabilities, author, contact info, etc.
     * 
     * @return A long description of the plugin
     */
    public String getDescription();
    
    public String getPluginPackage();
    
    /**
     * The Stack object passed by the editor when the plugin is called to 
     * load or save a map can be used by the plugin to notify the user
     * of any problems or messages.
     * 
     * @param es An initialized Stack that will be used by the editor to 
     * print messages from the plugin 
     */
    public void setErrorStack(Stack es);
}
