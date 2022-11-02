package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //@Getter, @setter sadece getter, setter oluşturur. biz hem getter hem setter oluşturduk o yüzden @data
@AllArgsConstructor
@NoArgsConstructor
@Entity //sen bir veri tabanı varlığısın. Tablo olarak da buraya karşılık geliyorsun.
@Table(name = "brands") //veri tabani tablom
public class Brand {
	
	@Id //sen db de primary key alanısın
	@GeneratedValue(strategy = GenerationType.IDENTITY) //sen otomatik artan bir id sin
	@Column(name = "id") //sen db deki brands tablosundaki id ye karşılık geleceksin.
	private int id;
	
	@Column(name = "name")
	private String name;
	
	
	
}
