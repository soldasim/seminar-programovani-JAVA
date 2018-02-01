import cz.alisma.alej.prog.pg16.QuadraticEquationGenerator;
import cz.alisma.alej.prog.pg16.QuadraticEquationPrinter;

public class Rovnice {
	public static void main(String[] args) {
		int s = Integer.parseInt(args[0]);

		if (s == 0) {
			QuadraticEquationPrinter printer = new ScreenPrinter();
		} else if (s == 1) {
			System.out.printf("<html>\n\t<head></head>\n\t<body>\n\t\t");
			QuadraticEquationPrinter printer = new HtmlPrinter();
		}

		QuadraticEquationGenerator.generate(10, printer);

		if (s == 1) {
			System.out.printf("\t</body>\n</html>");
		}
	}
}