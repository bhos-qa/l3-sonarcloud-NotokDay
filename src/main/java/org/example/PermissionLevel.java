package org.example;


public enum PermissionLevel {
    ADMIN("Admin"), //0
    DEVELOPER("Developer"), //1
    USER("User"); //2

    private final String roleName;

    PermissionLevel(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}