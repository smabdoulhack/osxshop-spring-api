package shop.osx.osxshop.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

@Builder
@Data // combine toutes les annotation (@Getter, @Setter, @ToString,
      // @EqualsAndHashCode)
@Entity // Pour signifier que la classe représente une class dans la base de donnée
@NoArgsConstructor // Génère un constructeur sans arguments
@AllArgsConstructor // Génère un constructeur avec tours le arguments
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String email;

    @Column(columnDefinition = "TEXT")
    private String password;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private LocalDateTime updatedAt;
}