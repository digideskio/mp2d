package org.mp2dteam.mp2d;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Box2D;

public class Mp2dGame extends ApplicationAdapter {

	public static final int renderWidth = 512; // 32 16-pixel tiles
	public static final int renderHeight = 288; // 18 16-pixel tiles

	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		Gdx.graphics.setDisplayMode(renderWidth, renderHeight, false);

		Box2D.init();

		batch = new SpriteBatch();
		img = new Texture("res/sprites/bigsamus.png");
	}

	/*
	 *	If we put the
	 */
	@Override
	public void render () {
		Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
