package com.syntaxerror.models;

public enum Roles {

    // <editor-fold defaultstate="collapsed" desc="Nodes">
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
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Abstract Methods">
    public abstract Integer getAccountRoleNumber();
    // </editor-fold>

}