package com.github.randomtypek.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CancerEntity{

	private Sprite playerSprite;

	private static final int SPEED = 10;

	public CancerEntity(){
		playerSprite = new Sprite(new Texture("core/assets/lmao.png"));

	}

	public void draw(SpriteBatch batch){
		inputHandle();
		playerSprite.draw(batch);

	}

	private void inputHandle(){
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
			playerSprite.setX(playerSprite.getX() - CancerEntity.SPEED);
		}

		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
			playerSprite.setX(playerSprite.getX() + CancerEntity.SPEED);
		}

		if(Gdx.input.isKeyPressed(Input.Keys.UP)){
			playerSprite.setY(playerSprite.getY() + CancerEntity.SPEED);
		}

		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
			playerSprite.setY(playerSprite.getY() - CancerEntity.SPEED);

		}

	}



}
