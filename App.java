
public class App {

	public static void main(String[] args) {
		Logger astrLog = new AsteriskLogger();
		astrLog.log("Info dump");
		Logger astrErr = new AsteriskLogger();
		astrErr.error("Warning!!");
		
		Logger spcLog = new SpacedLogger();
		spcLog.log("spaced out man!");
		Logger spcErr = new SpacedLogger();
		spcErr.error("Not a Test");
	}
	//Questions 9, 10, and 11
}
