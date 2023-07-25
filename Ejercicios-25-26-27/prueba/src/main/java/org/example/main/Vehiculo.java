package org.example.main;

public class Vehiculo implements Car {
    @Override
    public void mechanicalEnergyOfCombustion() {
        System.out.println("Energia mecanica producto luego de quemar combustible en el motor de combustion");
    }

    @Override
    public void mechanicalEnergyForElectricalEnergy() {
        System.out.println("Energia mecanica obtenida a partir de la bateria del coche electrico");
    }

    @Override
    public void mechanicalEnergyByTheHybridSystem() {
        System.out.println("La energia mecanica generada por el sistema Hybrido comprende la generacion de manera independiente tanto del motor de combustion como el motor electrico o la actuacion de ambos en conjunto");
    }

    @Override
    public void accelerate() {
        System.out.println("Esto es acelerar!");
    }

    @Override
    public void stop() {
        System.out.println("Esto es detenerse!");
    }

}
