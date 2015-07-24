package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

public class TestGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture pixmaptex;
	Texture [][] textArr;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		textArr = new Texture[10][10];
		Pixmap pixmap = new Pixmap(64,64, Pixmap.Format.RGBA8888);
		pixmap.setColor( 0, 0, 0, 1f );
		pixmap.drawRectangle(0,0,64,64);
		 pixmaptex = new Texture( pixmap );
		pixmap.dispose();
		initialize(textArr, pixmaptex);
int a = 0;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		drawPixMaps(pixmaptex, batch);
		batch.end();
	}

	public void initialize(Texture[][] pma, Texture tex) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++ ) {
				pma[i][j] = tex;
			}
		}


	}

	public void drawPixMaps(Texture pma, SpriteBatch batch) {

		int xOffset = 63;
		int xPos = 50;
		int yPos = 50;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 11; j++ ) {
				batch.draw(pma, xPos+(j*xOffset), yPos+(i*xOffset), 64, 64);
			}
		}


	}
}
