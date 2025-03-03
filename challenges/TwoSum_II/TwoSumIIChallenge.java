package com.dev.challenges.TwoSum_II;


import com.dev.core.BaseChallenge;
import com.dev.utils.validation_errors.InputValidator;

import java.util.InputMismatchException;

public class TwoSumIIChallenge extends BaseChallenge {
    private final InputValidator validator = new InputValidator(scanner);

    @Override
    public void execute() {
        printHeader("Two Sum II Challenge");

        int size = validator.getValidSize("Ingrese el tamaño del array (mínimo 2):", 2);
        int[] nums = validator.getValidSortedArray(size);
        int target = validator.getValidInteger("Ingrese el objetivo:");

        TwoSumIISolver solver = new TwoSumIISolver();
        int[] result = solver.findTwoSumII(nums, target);

        if (result.length == 2) {
            System.out.println("✅ Solución encontrada: Índices (base 1) [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("⚠ No se encontraron soluciones.");
        }
    }
}
