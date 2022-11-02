package kodlama.io.rentACar.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;

	
	@Autowired //Git parametrelerine bak BrandService uygulamayı tara kim bunu implemente ediyor. 
	//BrandManager onun newlenmiş halini bana ver
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getAll")
	public List<Brand> getAll(){
		return brandService.getAll();
	}
	
}
