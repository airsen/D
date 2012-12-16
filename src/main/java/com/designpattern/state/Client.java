package com.designpattern.state;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * <p>状态模式</p>
 *
 * @author airsen
 * @since 12-12-16 下午1:02
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context(State.NORMAL);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int input;
		try {
			System.out.println("输入：1、吃一顿；2、玩一阵；3、万能恢复");
			while ((input = Integer.valueOf(reader.readLine())) != 0) {
				switch (input) {
					case 1:
						context.eat();
						break;
					case 2:
						context.play();
						break;
					case 3:
						context.takePills();
						break;
					default:
						continue;
				}
				System.out.println("输入：1、吃一顿；2、玩一阵；3、万能恢复");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
