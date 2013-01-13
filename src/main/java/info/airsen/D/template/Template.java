package info.airsen.D.template;

import lombok.Data;

import java.util.Random;

/**
 * <p>模板模式，该类为抽象的模板</p>
 *
 * @author airsen
 * @since 13-1-13 下午6:47
 */
@Data
public abstract class Template {

	protected String name;
	protected int HP; // 初始血量
	protected int ATK; // 每次攻击掉血量
	protected int DEF; // 回血
	protected int STR; // 暴击率（0～100）

	private Random random = new Random();

	/**
	 * 初始方法，需要初始化HP/ATK/DEF/STR.
	 */
	protected abstract void init(String name);

	/**
	 * 暴击方式
	 */
	protected abstract void bigBreak(Template enemy);

	public void setUp(Template enemy) {
		if (random.nextInt(100) < STR) {
			System.out.println(name + "暴击成功！");
			bigBreak(enemy);
		} else
			attack(enemy);
	}

	public void attack(Template enemy) {
		if (ATK > enemy.getDEF())
			enemy.setHP(enemy.getHP() - ATK + enemy.getDEF());
		else
			enemy.setHP(enemy.getHP() - 1);
	}

	public void recover() {
		HP += DEF;
	}


	@Override
	public String toString() {
		return name + " : {" + "HP:" + HP + "}";
	}
}
