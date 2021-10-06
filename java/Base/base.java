package ru.mycompany.utils;

/** Wrap around Lock to simplify interface */
class LockWrapper {
    private Lock lock;
    public wait() {
        this.lock.wait()
    }
}