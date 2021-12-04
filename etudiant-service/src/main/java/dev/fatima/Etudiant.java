package dev.fatima;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Etudiant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long roomId;
	@Transient
	private Room room;

	private String name;
	private int age;
}
