package part8;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{
	@Resource(name = "qnaWrite")
	private Write write;

//	public void setWrite(Write write) {
//		this.write = write;
//	}
	
	@Override
	public void boardWrite() {
		write.doWrite();
		
	}

}
