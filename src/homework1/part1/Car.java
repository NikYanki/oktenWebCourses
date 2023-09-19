package homework1.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
   private String model;
   private int power;
   private double volumeEngine;
   private boolean turbo;
}
