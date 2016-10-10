package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdlili on 16-10-10.
 * 把所有对观察者对戏的引用保存在一个聚集里，每一个主题都可以有多个观察者。
 */
public class ConcreteSubject implements Subject {

    private List<Watcher> watcherList = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        watcherList.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watcherList.remove(watcher);
    }

    @Override
    public void notifyWatcher() {
        for(Watcher watcher:watcherList){
            watcher.changeData();
        }

    }
}
