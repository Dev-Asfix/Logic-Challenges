package com.dev.challenges.Palindrome;


import com.dev.core.BaseChallenge;
import com.dev.utils.validation_errors.InputValidator;

import java.util.InputMismatchException;

public class PalindromeChallenge extends BaseChallenge {

    private final InputValidator validator = new InputValidator(scanner);

    @Override
    public void execute() {
        printHeader("Palindrome Number Challenge");

        int x = validator.getValidInteger("Ingrese un número entero:");

        PalindromeSolver solver = new PalindromeSolver();
        boolean result = solver.isPalindrome(x);

        System.out.println("Resultado: El número " + x + (result ? " SÍ" : " NO") + " es un palíndromo.");
    }
}
