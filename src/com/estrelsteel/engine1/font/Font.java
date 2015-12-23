package com.estrelsteel.engine1.font;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import com.estrelsteel.engine1.world.Image;
import com.estrelsteel.engine1.world.Location;

public class Font {
	private String charBlock0;
	private String charBlock1;
	private String charBlock2;
	private String charBlock3;
	private String charBlock4;
	private String charBlock5;
	private Image image;
	private Location charSize;
	private Location textLoc;
	private Location charSpace;
	
	public Font() {
		charBlock0 = "ABCDEFGH";
		charBlock1 = "IJKLMNOP";
		charBlock2 = "QRSTUVWX";
		charBlock3 = "YZ123456";
		charBlock4 = "7890.,!?";
		charBlock5 = ":;- ####";
		image = new Image("/com/estrelsteel/engine1/res/font.png");
		charSize = new Location(0, 0, 16, 16);
		textLoc = new Location(0, 0, 256, 32);
		charSpace = new Location(0, 0, 2, 2);
	}
	
	public String getCharBlock0() {
		return charBlock0;
	}
	
	public String getCharBlock1() {
		return charBlock1;
	}
	
	public String getCharBlock2() {
		return charBlock2;
	}
	
	public String getCharBlock3() {
		return charBlock3;
	}
	
	public String getCharBlock4() {
		return charBlock4;
	}
	
	public String getCharBlock5() {
		return charBlock5;
	}
	
	public Location getCharSize() {
		return charSize;
	}
	
	public Location getTextLocation() {
		return textLoc;
	}
	
	public Location getCharSpace() {
		return charSpace;
	}
	
	public Graphics2D renderString(Graphics2D ctx, String str) {
		AffineTransform trans;
		int x = textLoc.getX();
		int y = textLoc.getY();
		Location loc = new Location(112, 112, 16, 16);
		int yPush = 0;
		for(int i = 0; i < str.length(); i++) {
			for(int a = 0; a < charBlock0.length(); a++) {
				
			}
			trans = new AffineTransform();
			if(x + (charSpace.getWidth() * i) + (charSize.getWidth() * i) + charSize.getWidth() > textLoc.getX() + textLoc.getWidth()) {
				x = textLoc.getX();
				y = y + (charSize.getHeight()) + (charSpace.getHeight());
			}
			else {
				x = x + (charSpace.getWidth() * i) + (charSize.getWidth() * i);
			}
			trans.translate(x, y);
			trans.scale(charSize.getWidth() / 16, charSize.getHeight() / 16);
			
			trans.rotate(Math.toRadians(charSize.getRotation()), charSize.getWidth() / 2, charSize.getHeight() / 2);
			ctx.drawImage(image.getImage().getSubimage(x, y, w, h), trans, null);
		}
		
		return ctx;
	}
	
	public void setCharSize(Location charSize) {
		this.charSize = charSize;
		return;
	}
	
	public void setTextLocation(Location textLoc) {
		this.textLoc = textLoc;
		return;
	}
	
	public void setCharSpace(Location charSpace) {
		this.charSpace = charSpace;
		return;
	}
}
