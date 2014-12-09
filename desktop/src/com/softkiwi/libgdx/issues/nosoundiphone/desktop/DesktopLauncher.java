package com.softkiwi.libgdx.issues.nosoundiphone.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.softkiwi.libgdx.issues.nosoundiphone.IssueReport;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new IssueReport(), config);
	}
}
