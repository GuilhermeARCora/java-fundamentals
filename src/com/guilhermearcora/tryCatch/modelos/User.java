package com.guilhermearcora.tryCatch.modelos;

import com.guilhermearcora.tryCatch.exceptions.SenhaInvalidaException;

public class User {

    private String senha;

    public User(String senha) {

        if(senha.length() < 8){
            throw new SenhaInvalidaException("A senha é inválida pois tem menos de 8 caracteres!");
        }
        this.senha = senha;
        System.out.println("Senha criada com sucesso");
    }


}
