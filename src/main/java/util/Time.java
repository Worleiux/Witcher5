package util;

import static org.lwjgl.glfw.GLFW.glfwGetTime;

public class Time {
    public static float timeStarted = System.nanoTime();

    public static float getTime() {
        //return (float)((System.nanoTime() - timeStarted) * 1E-9);
        return (float)glfwGetTime();
        }
}