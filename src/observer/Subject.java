package observer;

/**
 * Created by sdlili on 16-10-10.
 *目标，为所有的具体目标定义接口进行观察者操作,添加、删除、通知
 *
 */
public interface Subject {

    /**
     * 添加观察者
     * @param watcher
     */
    public void addWatcher(Watcher watcher);

    /**
     * 删除观察者
     * @param watcher
     */
    public void removeWatcher(Watcher watcher);

    /**
     * 通知观察者
     */
    public void notifyWatcher();
}
