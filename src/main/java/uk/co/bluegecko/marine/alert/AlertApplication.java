package uk.co.bluegecko.marine.alert;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.co.bluegecko.marine.shared.application.AbstractApplication;

@SpringBootApplication
public class AlertApplication extends AbstractApplication {

	public static void main(String[] args) {
		run(AlertApplication.class, args);
	}

}