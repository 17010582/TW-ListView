package com.myapplicationdev.android.tw_listview;

public class Module {
    String moduleCode;
    boolean isProgramming;

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public boolean isProgramming() {
        return isProgramming;
    }

    public void setProgramming(boolean programming) {
        isProgramming = programming;
    }

    public Module(String moduleCode, boolean isProgramming) {
        this.moduleCode = moduleCode;
        this.isProgramming = isProgramming;
    }
}
