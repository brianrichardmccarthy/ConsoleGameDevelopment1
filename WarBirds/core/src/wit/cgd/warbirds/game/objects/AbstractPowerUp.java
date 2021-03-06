/**
 *
 * @file        AbstractPowerUp
 * @author      Brian McCarthy, 20063914
 * @assignment  Warbirds
 * @brief       Abstract/ base power up class
 * @notes       DESCRIPTION OF CODE, BUGS, FEATURES, ISSUES, ETC.
 *
 */
package wit.cgd.warbirds.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import wit.cgd.warbirds.game.Assets.Asset;
import wit.cgd.warbirds.game.util.Constants;

public abstract class AbstractPowerUp extends AbstractGameObject {

    private TextureRegion region;
    public String name;
    
    public AbstractPowerUp(Level level, Vector2 position, Asset texture) {
        super(level, 0);
        init(position, texture);
    }
    
    private void init(Vector2 position, Asset texture) {
        dimension.set(0.5f, 0.5f);
        region = texture.region;
        origin.set(dimension.x / 2, dimension.y / 2);
        this.position = position;
        state = State.ACTIVE;
    }
    
    @Override
    public void update(float deltaTime) {
        
        if (!isInScreen()) state = State.DEAD;
        
        return;
    }
    
    @Override
    public void render(SpriteBatch batch) {

        if (state != State.ACTIVE) return;
        
        batch.draw(region.getTexture(), position.x-origin.x, position.y-origin.y, origin.x, origin.y, 
            dimension.x, dimension.y, scale.x, scale.y, rotation, 
            region.getRegionX(), region.getRegionY(), region.getRegionWidth(), region.getRegionHeight(), 
            false, false);  
        
    }

}
