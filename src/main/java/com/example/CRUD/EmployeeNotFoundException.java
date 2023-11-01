package com.example.CRUD;

public class EmployeeNotFoundException extends RuntimeException{

    EmployeeNotFoundException(long id){
        super("Não foi possivel encontrar o Funcionário");
    }
}
