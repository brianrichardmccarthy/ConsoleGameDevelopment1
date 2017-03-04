/**
 * 
 * @file        GoldCoin.java
 * @author      Brian McCarthy, 20063914
 * @assignment  BunnyHop
 * @brief       Class for gold coin object (extends the Abstract Game Object Class)
 * @notes       Code for rendering the gold coin texture, as well as tracking if the gold coin is collected, no BUGS or ISSUES
 *
 */

package ie.wit.cgd.bunnyhop.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ie.wit.cgd.bunnyhop.game.Assets;

public class GoldCoin extends AbstractGameObject {

    private TextureRegion regGoldCoin;
    public boolean collected;

    public GoldCoin() {
        init();
    }

    private void init() {

        dimension.set(0.5f, 0.5f);
        regGoldCoin = Assets.instance.goldCoin.goldCoin;
        // Set bounding box for collision detection
        bounds.set(0, 0, dimension.x, dimension.y);
        collected = false;
    }

    @Override
    public void render(SpriteBatch batch) {

        if (collected) return;

        TextureRegion reg = null;
        reg = regGoldCoin;
        batch.draw(reg.getTexture(), position.x, position.y, origin.x, origin.y, dimension.x, dimension.y, scale.x, scale.y, rotation, reg.getRegionX(), reg.getRegionY(), reg.getRegionWidth(), reg.getRegionHeight(), false, false);
    }

    public int getScore() {

        return 100;
    }
}