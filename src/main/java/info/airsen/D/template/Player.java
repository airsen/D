package info.airsen.D.template;

/**
 * <p>模板类的子类</p>
 *
 * @author airsen
 * @since 13-1-13 下午7:26
 */
public class Player {

	public static class Saya extends Template {

		@Override
		public void init(String name) {
			HP = 100;
			ATK = 30;
			DEF = 12;
			STR = 34;
			this.name = name;
		}

		/**
		 * 愤怒攻击3次并回血1次
		 *
		 * @param enemy 对手
		 */
		@Override
		public void bigBreak(Template enemy) {
			attack(enemy);
			attack(enemy);
			attack(enemy);
			recover();
		}
	}

	public static class Shualu extends Template {

		@Override
		public void init(String name) {
			HP = 200;
			ATK = 20;
			DEF = 10;
			STR = 28;
			this.name = name;
		}

		/**
		 * 吸血
		 *
		 * @param enemy 对手
		 */
		@Override
		public void bigBreak(Template enemy) {
			enemy.setHP(enemy.getHP() - 20);
			this.HP += 20;
		}
	}

}
