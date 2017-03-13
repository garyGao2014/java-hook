package com.github.gary.hook.api.push;

/**
 * Created by gaozhicheng on 2017/3/13.
 */
public interface IPushHandler<P> {
    public abstract void handler(P bean);
}

