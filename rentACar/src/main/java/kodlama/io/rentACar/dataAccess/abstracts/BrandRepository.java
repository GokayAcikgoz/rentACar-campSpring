package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;


public interface BrandRepository extends JpaRepository<Brand, Integer> {
	//List<Brand> getAll();
	//spring jpa bize findAll, id ye göre getirme gibi temel işlemleri yapıtğı için yukardakini sildik.
	//jpa generic bir yapıda çalışır. Onu sanki iplemente etmiş gibi bir class oluşturuyor. concretini oluşturmuş oluyor.
	
	//Burada bir sorgu yok. Bu sorguyu JPA Repo özel keywordler aracılığı ile kendi üretir.
	//spring jpa keywords
	boolean existsByName(String name);
}
