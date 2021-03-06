package part3;

public class BoardCafe implements Board{
	private Write write;

	public Write getWrite() {
		return write;
	}

	public void setWrite(Write write) {
		this.write = write;
	}
	
	public BoardCafe() {
		this.setWrite(Factory.getWriteInstance());
	}

	@Override
	public void boardWrite() {
		write.doWrite();
		
	}

}
