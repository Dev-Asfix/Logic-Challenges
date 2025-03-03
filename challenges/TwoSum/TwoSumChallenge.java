package com.dev.challenges.TwoSum;


import com.dev.core.BaseChallenge;
import com.dev.utils.validation_errors.InputValidator;

import java.util.InputMismatchException;

public class TwoSumChallenge extends BaseChallenge {
    private final InputValidator validator = new InputValidator(scanner);

    @Override
    public void execute() {
        printHeader("Two Sum Challenge");

        int size = validator.getValidSize("Ingrese el tamaño del array (mínimo 2):", 2);
        int[] nums = new int[size];

        System.out.println("Ingrese " + size + " números enteros:");
        for (int i = 0; i < size; i++) {
            nums[i] = validator.getValidInteger("Elemento [" + (i + 1) + "]: ");
        }

        int target = validator.getValidInteger("Ingrese el objetivo:");

        TwoSumSolver solver = new TwoSumSolver();
        int[] result = solver.findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("✅ Solución encontrada: Índices [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("⚠ No se encontraron soluciones.");
        }
    }
}
