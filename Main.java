public class Main extends JFrame implents ActionListener {

	Area a;
	Volume v;
	
	public void main(){
		this.Main().setVisible(true);
	}
	
	private final int sq = 20000;
   	private final int rect = 20001;
    	private final int circ = 20010;
   	private final int tri = 20011;
    	private final int hexa = 20100;
    	private final int para = 20101;
    	private final int trap = 20110;
    	private final int penta = 20111;
    	private final int poly = 21000;
	
	private final int cube = 30000;
    	private final int rectP = 30001;
   	private final int cyl = 30010;
   	private final int sph = 30011;
   	private final int cone = 30100;
   	private final int pyra = 30101;
	
	public Main(){
		super("Area and Volume Calculator");
		setBounds(0,0,500,500);
		
		JLabel labelRadius = new JLabel("Radius");
		JLabel labelWidth = new JLabel("Width");
		JLabel labelLength = new JLabel("Length");
		JLabel labelHeight = new JLabel("Height");
		JLabel labalPerimeter = new JLabel("Perimeter");
		JLabel labelBaseOne = new JLabel("Base 1");
		JLabel labelBaseTwo = new JLabel("Base 2");
		JLabel labelApothem = new JLabel("Apothem");
		
		JTextBox boxOne = new JTextBox();
		JTextBox boxTwo = new JTextBox();
		JTextBox boxAnswer = new JTextBox();
		
		int labelX = 10;
		int labelY = 30;
		int labelH = 10;
		int labelW = 50;
		
		int boxX = 70;
		int boxY = 30;
		int boxH = 10;
		int boxW = 250;
		
		//labelRadius.setBounds
	}
