/*
Implement a class Polynomial that models a polynomial equation. Use a constructor that
takes a variable number of coefficients (using varargs) and initializes the polynomial. Write a
method to display the polynomial in a readable format (e.g., 3x^2 + 2x + 1)
*/

class Polynomial {
    private double[] coeffs; // coeffs[0] is coefficient of highest power

    public Polynomial(double... coefficients) {
        if (coefficients == null || coefficients.length == 0) {
            // If no coefficients provided, treat as zero polynomial
            this.coeffs = new double[] {0.0};
        } else {
            // Copy and trim leading zeros so degree is accurate
            int firstNonZero = 0;
            while (firstNonZero < coefficients.length && isZero(coefficients[firstNonZero])) {
                firstNonZero++;
            }
            if (firstNonZero == coefficients.length) {
                // all zeros
                this.coeffs = new double[] {0.0};
            } else {
                int newLen = coefficients.length - firstNonZero;
                this.coeffs = new double[newLen];
                System.arraycopy(coefficients, firstNonZero, this.coeffs, 0, newLen);
            }
        }
    }

    // Helper to compare to zero with small tolerance
    private boolean isZero(double v) {
        return Math.abs(v) < 1e-9;
    }

    // Format a coefficient without .0 when it's an integer
    private String formatNumber(double v) {
        long asLong = (long) v;
        if (Math.abs(v - asLong) < 1e-9) {
            return Long.toString(asLong);
        } else {
            return Double.toString(v);
        }
    }

    // Display the polynomial (e.g., "3x^2 + 2x + 1")
    public String display() {
        StringBuilder sb = new StringBuilder();
        int n = coeffs.length;
        int deg = n - 1;
        boolean firstTermPrinted = false;

        for (int i = 0; i < n; i++) {
            double coeff = coeffs[i];
            int power = deg - i;
            if (isZero(coeff)) continue; // skip zero coefficient

            // Determine sign and spacing
            if (!firstTermPrinted) {
                // first printed term: handle negative sign if needed
                if (coeff < 0) sb.append("-");
            } else {
                // subsequent terms: include + or - with spaces
                sb.append(coeff < 0 ? " - " : " + ");
            }

            double absCoeff = Math.abs(coeff);

            // Decide whether to print coefficient value
            boolean printCoeff = true;
            if (power != 0 && Math.abs(absCoeff - 1.0) < 1e-9) {
                // For x-terms with coefficient ±1, omit "1"
                printCoeff = false;
            }

            if (printCoeff) {
                sb.append(formatNumber(absCoeff));
                if (power != 0) sb.append(""); // coefficient followed by variable part
            }

            // Variable part
            if (power > 0) {
                sb.append("x");
                if (power > 1) {
                    sb.append("^").append(power);
                }
            }

            firstTermPrinted = true;
        }

        if (!firstTermPrinted) {
            // polynomial is zero
            return "0";
        }
        return sb.toString();
    }

    // Example method: evaluate polynomial at x
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result = result * x + coeffs[i]; // Horner's method (coeffs in descending order)
        }
        return result;
    }
}

public class Problem06{
    // --- Example usage in main ---
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(3, 2, 1);        // 3x^2 + 2x + 1
        Polynomial p2 = new Polynomial(1, -1, 0, 5);    // x^3 - x^2 + 0x + 5 -> x^3 - x^2 + 5
        Polynomial p3 = new Polynomial(0, 0, 0);        // 0
        Polynomial p4 = new Polynomial(-1, 1);          // -x + 1
        Polynomial p5 = new Polynomial(2.5, 0, -1.75);  // 2.5x^2 - 1.75

        System.out.println(p1.display()); // "3x^2 + 2x + 1"
        System.out.println(p2.display()); // "x^3 - x^2 + 5"
        System.out.println(p3.display()); // "0"
        System.out.println(p4.display()); // "-x + 1"
        System.out.println(p5.display()); // "2.5x^2 - 1.75"

        // evaluating
        System.out.println("p1(2) = " + p1.evaluate(2)); // evaluate at x=2
    }
}