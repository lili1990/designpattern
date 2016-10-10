package observer;

/**
 * Created by sdlili on 16-10-10.
 */
public class Test {

    public static  void main(String[] args){

        Subject subject = new ConcreteSubject();
        Watcher watcher1 = new ConcreteWatcher();
        Watcher watcher2 = new ConcreteWatcher();
        subject.addWatcher(watcher1);
        subject.addWatcher(watcher2);
        subject.notifyWatcher();

    }
}
