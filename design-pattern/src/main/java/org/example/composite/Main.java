package org.example.composite;

import org.example.composite.entitie.Aluno;
import org.example.composite.entitie.Professor;

public class Main {

    public static void main(String[] args) {
        Professor prof1 = new Professor();

        prof1.add(new Aluno("João", "123"));
        prof1.add(new Professor("Maria", "456"));


        prof1.getProfessores();
    }
}
