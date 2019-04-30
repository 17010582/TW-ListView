package com.myapplicationdev.android.tw_listview;

public class Module {
    String mc;
    boolean isProgramming;

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public boolean isProgramming() {
        return isProgramming;
    }

    public void setProgramming(boolean programming) {
        isProgramming = programming;
    }

    public Module(String mc, boolean isProgramming) {
        this.mc = mc;
        this.isProgramming = isProgramming;
    }
}
