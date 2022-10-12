package myenum;

public enum MsgStatus {
	SENT("Single tick"),
	DELIVERED("Double tick"),
	READ("Double Blue tick"),
	DELETED("This msg is deleted");
	
	String des;
	
	private MsgStatus(String m) {
		des=m;
	}
	public String geMsg()
	{
		return des;
	}
}
