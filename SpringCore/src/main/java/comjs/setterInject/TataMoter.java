package comjs.setterInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component()
public class TataMoter {
	@Autowired()
	//@Qualifier(value = "Mother")
	MotherSumi ms;
      
	public void setMs(MotherSumi ms) {
		this.ms = ms;
		
	}
	
	
	public TataMoter() {
		System.out.println("Dependancy Injected"+ms);
	}
      
      

}
