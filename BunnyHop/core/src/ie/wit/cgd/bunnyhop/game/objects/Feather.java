/**
 * 
 * @file        Feather.java
 * @author      Brian McCarthy, 20063914
 * @assignment  BunnyHop
 * @brief       Class for feather object (extends the Abstract Game Object Class)
 * @notes       Code for rendering the feather texture, as well as tracking if the feather is collected, no known BUGS or ISSUES
 *
 */

package ie.wit.cgd.bunnyhop.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ie.wit.cgd.bunnyhop.game.Assets;

public class Feather extends AbstractGameObject {

    private TextureRegion regFeather;
    public boolean collected;

    public Feather() {
        init();
    }

    private void init() {

        dimension.set(0.5f, 0.5f);
        regFeather = Assets.instance.feather.feather;
        // Set bounding box for collision detection
        bounds.set(0, 0, dimension.x, dimension.y);
        collected = false;
    }

    @Override
    public void render(SpriteBatch batch) {

        if (collected) return;
        TextureRegion reg = null;
        reg = regFeather;
        batch.draw(reg.getTexture(), position.x, position.y, origin.x, origin.y, dimension.x, dimension.y, scale.x, scale.y, rotation, reg.getRegionX(), reg.getRegionY(), reg.getRegionWidth(), reg.getRegionHeight(), false, false);
    }

    public int getScore() {

        return 250;
    }
}