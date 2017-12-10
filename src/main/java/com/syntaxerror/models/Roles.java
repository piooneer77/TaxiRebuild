package com.syntaxerror.models;

public enum Roles {
    Admin{
        @Override
        public Integer getAccountRoleNumber(){return 0;}
    },
    Driver{
        @Override
        public Integer getAccountRoleNumber(){return 1;}
    },
    Client{
        @Override
        public Integer getAccountRoleNumber(){return 2;}
    };
    public abstract Integer getAccountRoleNumber();
}