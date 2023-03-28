package br.com.scorpion.userapi.shared.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "password", length = 20)
    private String password;
}
