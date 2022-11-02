package kodlama.io.rentACar.business.requests;

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
	private String name;
}
