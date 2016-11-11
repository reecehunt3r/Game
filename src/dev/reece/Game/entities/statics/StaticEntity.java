package dev.reece.Game.entities.statics;

import dev.reece.Game.Handler;
import dev.reece.Game.entities.Entity;

public abstract class StaticEntity extends Entity{
	
	public StaticEntity(Handler handler, float x, float y, int width, int height){
		super(handler,x,y,width,height);
	}

}
