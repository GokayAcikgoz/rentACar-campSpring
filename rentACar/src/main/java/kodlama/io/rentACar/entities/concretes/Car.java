package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //@Getter, @setter sadece getter, setter oluşturur. biz hem getter hem setter oluşturduk o yüzden @data
@AllArgsConstructor
@NoArgsConstructor
@Entity //sen bir veri tabanı varlığısın. Tablo olarak da buraya karşılık geliyorsun.
@Table(name = "cars") //veri tabani tablom
public class Car {
	
	@Id //sen db de primary key alanısın
	@GeneratedValue(strategy = GenerationType.IDENTITY) //sen otomatik artan bir id sin
	@Column(name = "id") //sen db deki brands tablosundaki id ye karşılık geleceksin.
	private int id;
	
	@Column(name = "plate", unique = true) //unique constrain - benzersiz olacak.
	private String plate; //plaka
	
	@Column(name = "dailyPrice")
	private double dailyPrice;
	
	@Column(name = "modelYear")
	private int modelYear;
	
	@Column(name = "state")
	private int state; //1- Available 2-Rented 3-Maintenance
	
	@ManyToOne
	@JoinColumn(name = "model_id")
	private Model model;
	

}
