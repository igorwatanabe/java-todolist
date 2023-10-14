package br.com.igorwatanabe.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // inserer gettes e setters
@Entity(name = "tb_users") //nome da tabela
public class UserModel {

    @Id //Primary Key
    @GeneratedValue(generator = "UUID") //gerar automaticamente
    private UUID id;

    // @Column(name ="usuarios") - se quiser nomear a coluna com outro nome
    @Column(unique = true) //tranforma em chave unica
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
