package dev.reece.Game.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static final int width = 32, height = 32;
	public static BufferedImage dirt, grass, stone, tree;
	public static BufferedImage[] player_down, player_up, player_left, player_right;
	
	public static void init(){
		
		SpriteSheet backs = new SpriteSheet(ImageLoader.loadImage("/textures/backs.png"));
		SpriteSheet playerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/player.png"));
		
		player_down = new BufferedImage[3];
		player_up = new BufferedImage[3];
		player_left = new BufferedImage[3];
		player_right = new BufferedImage[3];
		
		player_down[0] = playerSheet.crop(0,0,width,height);
		player_down[1] = playerSheet.crop(width,0,width,height);
		player_down[2] = playerSheet.crop(width*2,0,width,height);
		player_up[0] = playerSheet.crop(0,height,width,height);
		player_up[1] = playerSheet.crop(width,height,width,height);
		player_up[2] = playerSheet.crop(width*2,height,width,height);
		player_right[0] = playerSheet.crop(0,height*2,width,height);
		player_right[1] = playerSheet.crop(width,height*2,width,height);
		player_right[2] = playerSheet.crop(width*2,height*2,width,height);
		player_left[0] = playerSheet.crop(0,height*3,width,height);
		player_left[1] = playerSheet.crop(width,height*3,width,height);
		player_left[2] = playerSheet.crop(width*2,height*3,width,height);
		
		
		grass = backs.crop(0,0,width,height);
		tree = backs.crop(width, 0, width, height);
		stone = backs.crop(0, height, width, height);
		dirt = backs.crop(width, height, width, height);
		
	}

}
