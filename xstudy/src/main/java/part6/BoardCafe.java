package part6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{
	@Autowired
	private Write write;

	
	@Override
	public void boardWrite() {
		write.doWrite();
		
	}

}
