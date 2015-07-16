/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combodecksimulator;

import Simulation.Simulation;

/**
 *
 * @author Bash
 */
public class ComboDeckSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Simulation simulation = new Simulation();
        simulation.simulateBelcherWithMulligan();
    }
    
}
