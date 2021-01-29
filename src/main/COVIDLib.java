package main;

import org.apache.commons.math3.distribution.NormalDistribution;

public class COVIDLib {

    double covidChanceEnMoyenne(NormalDistribution n, double m) {
        return n.cumulativeProbability(m);
    }

    double covidChanceDurree(NormalDistribution n , double a, double b) {
        return n.probability(a, b);
    }

    public static void main(String[] args) {

        COVIDLib app = new COVIDLib();

        NormalDistribution normalDistribution = new NormalDistribution(15.0, 7.0);

        System.out.println("Covid 7 jours : "+app.covidChanceEnMoyenne(normalDistribution, 15.0));
        System.out.println("Covid entre 8 et 22 jours : "+app.covidChanceDurree(normalDistribution, 8.0, 22.0));
        System.out.println("Covid entre 1 et 29 jours : "+app.covidChanceDurree(normalDistribution, 1.0, 29.0));
        System.out.println("Covid entre 0 et 36 jours : "+app.covidChanceDurree(normalDistribution, -6.0, 29.0));
        System.out.println("Covid 0 jours : "+app.covidChanceEnMoyenne(normalDistribution, 0.0));

    }

}
