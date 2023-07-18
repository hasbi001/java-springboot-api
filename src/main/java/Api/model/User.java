package Api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;


@Data
@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")

public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = true)
    private String address;
    @Column(nullable = true)
    private String nohp;
    @Column(nullable = false)
    private String password;
    @Column(nullable = true)
    private String status;
    @Column(nullable = true)
    private String createdAt;
    @Column(nullable = true)
    private String updatedAt;
}
