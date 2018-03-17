public class Kadane {

    double maximoSubArranjo(double x[]) {
        double maxAteAgora = 0;
        double maxFinalAqui = 0;

        for (int i = 0; i < x.length; i++)
        {
            maxFinalAqui = Math.max(0.0, (maxFinalAqui + x[i]));
            maxAteAgora = Math.max(maxAteAgora, maxFinalAqui);
        }
        return maxAteAgora;
    }

}
