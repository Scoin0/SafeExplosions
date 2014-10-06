package net.scoin0.safeexplosions;

import net.canarymod.hook.HookHandler;
import net.canarymod.hook.world.ExplosionHook;
import net.canarymod.plugin.PluginListener;

public class onExplode implements PluginListener {
	
	@HookHandler
	  public void onExplosion(ExplosionHook hook){
		
	    hook.setCanceled();
	    
	  }
}
