package Projects.Project_1;
import java.util.Scanner;

class projectile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constants
        final double g = 9.81; // gravity (m/s^2)
        final double wheelDiameter = 0.05; // 5 cm in meters

        // Input target coordinates
        System.out.print("Enter target horizontal distance X (m): ");
        double X = sc.nextDouble();

        System.out.print("Enter target vertical distance Y (m): ");
        double Y = sc.nextDouble();

        // We will try both solutions for theta using quadratic form
        // Equation: Y = X*tanθ - (g*X^2)/(2*v^2*cos^2θ)
        // Rearranged: tanθ = (v^2 ± sqrt(v^4 - g*(g*X^2 + 2*Y*v^2)))/(g*X)

        // Instead of directly solving, we sweep angles and find valid v
        double bestLow = Double.NaN;
        double bestHigh = Double.NaN;
        double lowAngle = 0;
        double highAngle = 0;

        for (double thetaDeg = 1; thetaDeg < 89; thetaDeg++) {
            double theta = Math.toRadians(thetaDeg);

            double denom = 2 * (X * Math.tan(theta) - Y) * Math.pow(Math.cos(theta), 2);
            if (denom <= 0) continue; // invalid

            double v = Math.sqrt((g * X * X) / denom);

            if (!Double.isNaN(v) && !Double.isInfinite(v)) {
                if (Double.isNaN(bestLow)) {
                    bestLow = v;
                    lowAngle = thetaDeg;
                }
                bestHigh = v;
                highAngle = thetaDeg;
            }
        }

        // Print results
        System.out.println("\n=== Launcher Calculation ===");
        System.out.println("Target: (" + X + " m, " + Y + " m)");

        if (!Double.isNaN(bestLow)) {
            double rpmLow = (60 * bestLow) / (Math.PI * wheelDiameter);
            System.out.println("\nLow Arc Solution:");
            System.out.println("  Angle: " + String.format("%.2f", lowAngle) + " degrees");
            System.out.println("  Velocity: " + String.format("%.2f", bestLow) + " m/s");
            System.out.println("  Motor Speed: " + String.format("%.2f", rpmLow) + " RPM");
        }

        if (!Double.isNaN(bestHigh)) {
            double rpmHigh = (60 * bestHigh) / (Math.PI * wheelDiameter);
            System.out.println("\nHigh Arc Solution:");
            System.out.println("  Angle: " + String.format("%.2f", highAngle) + " degrees");
            System.out.println("  Velocity: " + String.format("%.2f", bestHigh) + " m/s");
            System.out.println("  Motor Speed: " + String.format("%.2f", rpmHigh) + " RPM");
        }

        if (Double.isNaN(bestLow) && Double.isNaN(bestHigh)) {
            System.out.println("No valid solution found for this target.");
        }

        sc.close();
    }
}