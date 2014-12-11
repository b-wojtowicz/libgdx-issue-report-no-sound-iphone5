package com.softkiwi.libgdx.issues.nosoundiphone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class IssueReport extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;

    Music music;

    @Override
    public void create() {
        super.create();

        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");

        music = Gdx.audio.newMusic(new FileHandle("test.m4a"));
        music.play();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
    }

    @Override
    public void dispose() {
        music.stop();
        music.dispose();

        super.dispose();
    }
}
