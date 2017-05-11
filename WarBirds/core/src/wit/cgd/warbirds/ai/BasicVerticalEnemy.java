package wit.cgd.warbirds.ai;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

import wit.cgd.warbirds.game.objects.Level;
import wit.cgd.warbirds.game.util.Constants;

public class BasicVerticalEnemy extends AbstractEnemy {

    public BasicVerticalEnemy(Level level, int multiplyer) {
        super(level, multiplyer);
        velocity  = new Vector2(0f, -1f);
    }
    
    @Override
    public void update(float deltaTime) {
        super.update(deltaTime);
        position.x = MathUtils.clamp(position.x,-Constants.VIEWPORT_WIDTH/2+0.5f,Constants.VIEWPORT_WIDTH/2-0.5f);
    }

}