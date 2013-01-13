package info.airsen.D.singleton;

/**
 * <p>单例模式</p>
 *
 * @author airsen
 * @since 13-1-13 下午6:06
 */
public class Singleton {

	/**
	 * 普通单例模式
	 */
	public static class NormalSingleton {
		private static final NormalSingleton instance = new NormalSingleton();

		private NormalSingleton() {
		}

		public static NormalSingleton getInstance() {
			return instance;
		}
	}

	/**
	 * 懒实例化单例模式
	 */
	public static class LazySingleton {
		private static volatile LazySingleton instance = new LazySingleton();

		private LazySingleton() {
		}

		public static LazySingleton getInstance() {
			if (instance == null) {
				synchronized (LazySingleton.class) {
					instance = new LazySingleton();
					return instance;
				}
			}
			return instance;
		}
	}

}
