package info.airsen.D;

import info.airsen.D.strategy.Context;
import info.airsen.D.strategy.Strategy;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author airsen
 * @since 13-1-13 下午5:08
 */
public class StrategyTest {

	@Test
	public void test() {
		Context context = new Context(Strategy.WIZARD);
		context.attack();
		context.vitality();
		context.defensive();

		context.setStrategy(Strategy.GENERAL);
		context.attack();
		context.vitality();
		context.defensive();

		context.setStrategy(Strategy.SOLDIER);
		context.attack();
		context.vitality();
		context.defensive();
	}

}
