/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.a2dam.jamp;

/**
 *
 * @author paula
 */
public class PasswordNotOkException extends Exception{

    public PasswordNotOkException(String msg){

        super(msg);

    }

    public PasswordNotOkException() {
    }

}