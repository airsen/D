package com.designpattern.strategy;

import lombok.Setter;

/**
 * <p>策略模式用来保存上下文环境的类，由他来隔离策略和调用者的关联</p>
 * <p>虽然实际上没有完全不关联，但多了Context的好处就是，在更换算法的时候只需要改构造方法。</p>
 *
 * @author airsen
 * @since 12-12-16 下午1:02
 */
public class Context {

	@Setter
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void attack() {
		strategy.attack();
	}

	public void defensive() {
		strategy.defensive();
	}

	public void vitality() {
		strategy.vitality();
	}

}
