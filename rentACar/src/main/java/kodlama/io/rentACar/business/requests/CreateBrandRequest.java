package kodlama.io.rentACar.business.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Elimde şöyle bir marka var onu eklermisin
//apiyi kullanan son kullanıcıdan data alıyorsak rquest bir şey veriyorsak response
//response request pattern

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20)
	private String name;
}
