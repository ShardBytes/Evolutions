package com.github.randomtypek;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.github.randomtypek.entity.CancerEntity;

public class GdxTest extends ApplicationAdapter {
	private SpriteBatch batch;
	private CancerEntity player;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		player = new CancerEntity();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		player.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
