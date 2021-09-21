package comjs.setterInject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("Mother")
public class MotherSumi {

	public MotherSumi() {
		System.out.println("MotherSumi::Wire,Indicator,Sound");
	}
	
	
}
