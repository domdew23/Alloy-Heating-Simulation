public class main{
	public static void main(String[] args){
		
		Settings settings = null;
		init(settings, args);

		Control control = new Control();
		
		GraphicsEngine graphicsEngine = new GraphicsEngine(control);
		Jacobi jacobi = new Jacobi(control.A, control.B, 0, Settings.HEIGHT, 0, Settings.WIDTH, Settings.MAX_STEPS, Settings.THRESHOLD);
		graphicsEngine.start();
		jacobi.invoke();
	}

	private static void init(Settings settings, String[] args){
		if (args.length < 1){
			settings = new Settings();
		} else if (args.length == 1){
			settings = new Settings(args[0]);
		} else {
			System.out.println("Unexpected amount of arguments.");
			return;
		}
	}
}