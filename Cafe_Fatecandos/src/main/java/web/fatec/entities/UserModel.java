package web.fatec.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;

    public UserModel(Long idUser, String nome, String lastName, String cpf, LocalDate birthDate) {
        this.idUser = idUser;
        this.name = nome;
        this.lastName = lastName;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public UserModel() {

    }
}
