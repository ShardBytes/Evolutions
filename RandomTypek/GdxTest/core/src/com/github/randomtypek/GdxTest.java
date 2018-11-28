package com.github.randomtypek;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GdxTest extends Game{

	SpriteBatch spriteBatch;
	BitmapFont font;

	@Override
	public void create(){
		spriteBatch = new SpriteBatch();
		font = new BitmapFont();

		this.setScreen(new Menu(this));

	}
}
