package com.designpattern.strategy;

/**
 * <p>策略模式</p>
 *
 * @author airsen
 * @since 12-12-16 下午1:02
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context(Strategy.WIZARD);
		context.attack();
		context.vitality();
		context.defensive();

		context.setStrategy(Strategy.GENERAL);
		context.attack();

		context.setStrategy(Strategy.SOLDIER);
		context.defensive();

	}

}
