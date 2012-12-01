package com.designpattern.state;

import lombok.Getter;

/**
 * Project: D
 * User: airsen
 * Date: 12-11-30
 * Time: 上午7:34<br/>
 * 状态模式中的上下文环境类，客户端操作的就是该上下文环境类。<br/>
 * 它隔离了调用者和状态间的关联，状态类不包含当前的情况，它们只知道遇见这种情况应该如何解决。<br/>
 * 而保持着这些信息的就是该类。<br/>
 */
public class Context {

    @Getter
    private State state;

    public Context(State state) {
        this.state = state;
        state.setContext(this);
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    // 事件（状态转移条件）：吃了个饭
    public void eat() {
        state.eat();
        System.out.println("吃了个饭:" + state);
    }

    // 事件（状态转移条件）：玩了一会
    public void play() {
        state.play();
        System.out.println("玩了一会:" + state);
    }

    // 事件（状态转移条件）：吃万能恢复药
    public void takePills() {
        state.takePills();
        System.out.println("吃万能恢复药:" + state);
    }

}
