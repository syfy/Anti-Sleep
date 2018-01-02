import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.util.Random;

public class MouseMover {
	public static final int SIXTEE_SECONDS = 60000;
	public static final int MAX_Y = 400;
	public static final int MAX_X = 400;

	public static void main(String... args) throws Exception {
		Robot robot = new Robot();
		Random random = new Random();
		PointerInfo a = MouseInfo.getPointerInfo();
		Point savedPoint = a.getLocation();

		int savedPointerLocationX  = (int) savedPoint.getX();
		int savedPointerLocationY  = (int) savedPoint.getX();
		//while (true) {
////
		//	robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
		//	Thread.sleep(FIVE_SECONDS);
		//}
		for(int x=0;;x++){
			System.out.println("executing mouse move script");
			
			
			
			PointerInfo movingPointer = MouseInfo.getPointerInfo();
			Point movingPoint = movingPointer.getLocation();

			int xPointerLocation = (int) movingPoint.getX();
			int yPointerLocation = (int) movingPoint.getY();
			if(x%2==1){
				robot.mouseMove(xPointerLocation-1, yPointerLocation-1);

			}
			else{
				robot.mouseMove(xPointerLocation+1, yPointerLocation+1);

			}
				Thread.sleep(SIXTEE_SECONDS);
			
			
		}
	}
}
