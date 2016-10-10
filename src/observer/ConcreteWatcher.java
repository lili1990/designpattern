package observer;

/**
 * Created by sdlili on 16-10-10.
 */
public class ConcreteWatcher implements Watcher {

    public void changeData(){
        System.out.print("数据发生变化，这边收到通知，可以进行相应的操作！");
    }
}
