package com.tasktop.koans;

import org.junit.runner.notification.RunNotifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stopper {
    private List<RunNotifier> notifiers = Collections.synchronizedList(new ArrayList<RunNotifier>());

    public void pleaseStop(){
        for(RunNotifier notifier: notifiers){
            notifier.pleaseStop();
        }
    }

    public void addNotifier(RunNotifier notifier){
        notifiers.add(notifier);
    }
}
