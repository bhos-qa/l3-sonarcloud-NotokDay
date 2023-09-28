package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    public PermissionManager() {
        mCurrentLevel = PermissionLevel.USER;
    }

    //this returns a string value such as "Admin"
    public String getRoleName(PermissionLevel level) {
        return level.getRoleName();
    }

    //this returns enum value
    public PermissionLevel getCurrentPermissionLevel() {
        return mCurrentLevel;
    }

    public void setPermissionLevel(PermissionLevel level) {
        mCurrentLevel = level;
    }
}
