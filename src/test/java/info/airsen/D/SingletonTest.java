package info.airsen.D;

import info.airsen.D.singleton.Singleton.LazySingleton;
import info.airsen.D.singleton.Singleton.NormalSingleton;
import junit.framework.Assert;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author airsen
 * @since 13-1-13 下午6:25
 */
public class SingletonTest {

	@Test
	public void eagerSingletonTest() {
		NormalSingleton a = NormalSingleton.getInstance();
		NormalSingleton b = NormalSingleton.getInstance();
		Assert.assertSame(a, b);
	}

	@Test
	public void lazySingletonTest() {
		LazySingleton a = LazySingleton.getInstance();
		LazySingleton b = LazySingleton.getInstance();
		Assert.assertSame(a, b);
	}

}
