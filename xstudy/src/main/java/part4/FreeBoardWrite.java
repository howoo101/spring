package part4;

public class FreeBoardWrite implements Write{
	private String sBoardName;

	@Override
	public void doWrite() {
		System.out.println(this.getsBoardName() + " Write down!!");
	}
	public FreeBoardWrite() {
		init();
	}
	
	public void init() {
		this.setsBoardName("Free Board");
	}
	
	public String getsBoardName() {
		return sBoardName;
	}

	public void setsBoardName(String sBoardName) {
		this.sBoardName = sBoardName;
	}
	
	
}
