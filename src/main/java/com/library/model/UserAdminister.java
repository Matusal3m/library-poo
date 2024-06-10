package com.library.model;
class UserAdminister extends User {
    public UserAdminister(int id, String name, String email, String password, String role) {
        super(id, name, email, password);
        this.role = role;
    }
    @Override
    public String getRole() {
        return "role";
    }                                                
}

