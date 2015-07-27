package org.mp2dteam.mp2d;

import com.badlogic.gdx.physics.box2d.BodyDef;

/**
 * Created by Simon on 7/26/2015.
 * This class houses all information pertaining to the player, inculding physical aspects, like current position,
 * velocity, etc. We also store all persistent-state data with the player. By persistent, we mean data that the game
 * keeps track of and saves even between rooms. By housing all persistent data in one class, we make it easier to
 * serialize that data when we add save files.
 */
public class Player {

    // Width of the kinematic body to use at the player's feet to detect collision with the ground.
    public static final int PLAYER_FIXTURE_SENSOR_X = 16;

    private int x;
    private int y;
    private int width;
    private int height;
    private PlayerState currentState;
    private BodyDef playerKinematicBody;


}
