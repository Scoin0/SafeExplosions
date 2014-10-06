package net.scoin0.safeexplosions;

import net.canarymod.Canary;
import net.canarymod.plugin.Plugin;

public class SafeExplosions extends Plugin{
	
	public static String Plugin_Name = "SafeExplosions ";
	public static String Plugin_Version = "1.0.4 ";
	public static String Plugin_Author = "Scoin0 ";
	
	public boolean enable() {
		getLogman().info(Plugin_Name + Plugin_Version + "created by " + Plugin_Author + "has been enabled!");
		
		Canary.hooks().registerListener(new onExplode(), this);
		
		getLogman().info("Your server is protected with SafeExplosions!");
		
		return true;
	}

	public void disable() {
		getLogman().info(Plugin_Name + "has been Disabled!");
	}
}
