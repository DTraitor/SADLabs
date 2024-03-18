package com.mcw.observer;

public interface IObserveSubject {
    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers(String message);
}
