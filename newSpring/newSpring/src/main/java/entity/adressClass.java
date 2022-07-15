package entity;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ADDRESS")
public class adressClass {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;
	@Column(name="IL")
	private String ilAdi;
	@Column(name="ILCE")
	private String ilceAdi;

}
