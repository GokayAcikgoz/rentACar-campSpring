package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //@Getter, @setter sadece getter, setter oluşturur. biz hem getter hem setter oluşturduk o yüzden @data
@AllArgsConstructor
@NoArgsConstructor
@Entity //sen bir veri tabanı varlığısın. Tablo olarak da buraya karşılık geliyorsun.
@Table(name = "models") //veri tabani tablom
public class Model {
	
	@Id //sen db de primary key alanısın
	@GeneratedValue(strategy = GenerationType.IDENTITY) //sen otomatik artan bir id sin
	@Column(name = "id") //sen db deki brands tablosundaki id ye karşılık geleceksin.
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "brand_id") //model tablosunda hangi alana karşılık gelecek
	private Brand brand;
	
	@OneToMany(mappedBy = "model")
	private List<Car> cars;

}
