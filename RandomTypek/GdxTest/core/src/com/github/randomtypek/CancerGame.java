package com.github.randomtypek;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.github.randomtypek.entity.CancerEntity;
import com.github.randomtypek.entity.Teams;

public class CancerGame implements Screen{
	private CancerEntity player;
	private GdxTest stuff;
	private Teams team;

	CancerGame(GdxTest game, Teams a){
		stuff = game;
		team = a;
	}

	@Override
	public void show(){
		player = new CancerEntity(team);
	}

	@Override
	public void render(float delta){
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stuff.spriteBatch.begin();
		player.draw(stuff.spriteBatch);
		stuff.font.draw(stuff.spriteBatch, "plz dont", Gdx.input.getX(), Gdx.graphics.getHeight()-Gdx.input.getY());
		stuff.spriteBatch.end();

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
	public void dispose () {
		//batch.dispose();

	}

}
