package org.example.main;

import org.example.combustion.CombustionCarBehavior;
import org.example.electric.ElectricCarBehavior;
import org.example.hybrid.HybridCarBehavior;

public interface Car extends CombustionCarBehavior,ElectricCarBehavior,HybridCarBehavior{
}
