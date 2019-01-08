package com.github.randomtypek.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CancerEntity{

	private Sprite playerSprite;
	private Teams playerTeam;

	private static final int SPEED = 10;

	public CancerEntity(Teams team){
		playerTeam = team;
		if(team.equals(Teams.KYS)){
			playerSprite = new Sprite(new Texture("core/assets/kys.png"));
		} else {
			playerSprite = new Sprite(new Texture("core/assets/lmao.png"));
		}

	}

	public void draw(SpriteBatch batch){
		inputHandle(playerTeam);
		playerSprite.draw(batch);

	}

	private void inputHandle(Teams team){
		if(team == Teams.LMAO){
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
		} else {
				if(Gdx.input.isKeyPressed(Input.Keys.A)){
					playerSprite.setX(playerSprite.getX() - CancerEntity.SPEED);
				}

				if(Gdx.input.isKeyPressed(Input.Keys.D)){
					playerSprite.setX(playerSprite.getX() + CancerEntity.SPEED);
				}

				if(Gdx.input.isKeyPressed(Input.Keys.W)){
					playerSprite.setY(playerSprite.getY() + CancerEntity.SPEED);
				}

				if(Gdx.input.isKeyPressed(Input.Keys.S)){
					playerSprite.setY(playerSprite.getY() - CancerEntity.SPEED);

				}
			}
		}


	}

