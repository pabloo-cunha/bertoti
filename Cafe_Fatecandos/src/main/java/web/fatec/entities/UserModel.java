package web.fatec.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Setter
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
    private String name;
    private String lastName;
    private String cpf;
    private LocalDate birthDate;

    public UserModel(Long idUser, String nome, String lastName, String cpf, String birthDate) {
        this.idUser = idUser;
        this.name = nome;
        this.lastName = lastName;
        this.cpf = cpf;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(birthDate, dtf);
    }

    public UserModel() {

    }
}
