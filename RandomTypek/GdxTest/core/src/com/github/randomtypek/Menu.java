package com.github.randomtypek;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.github.randomtypek.entity.Teams;

public class Menu implements Screen{

	private GdxTest stuff;
	private Sprite button;

	Menu(GdxTest game){
		stuff = game;
		button = new Sprite(new Texture("core/assets/CancerButton.png"));
		button.setPosition(100, 100);

	}

	@Override
	public void show(){

	}

	@Override
	public void render(float delta){
		Gdx.gl.glClearColor(0.0f, 0.0f, 0.2f, 1.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stuff.spriteBatch.begin();
		stuff.font.draw(stuff.spriteBatch, "what", 15.0f, 15.0f);
		button.draw(stuff.spriteBatch);
		stuff.spriteBatch.end();

		if(Gdx.input.isTouched()){
			stuff.setScreen(new CancerGame(stuff, Teams.LMAO));
		} else if(Gdx.input.isKeyPressed(Input.Keys.B)){
			stuff.setScreen(new CancerGame(stuff, Teams.KYS));
		}
	}

	@Override
	public void resize(int width, int height){

	}

	@Override
	public void pause(){

	}

	@Override
	public void resume(){

	}

	@Override
	public void hide(){

	}

	@Override
	public void dispose(){

	}
}
