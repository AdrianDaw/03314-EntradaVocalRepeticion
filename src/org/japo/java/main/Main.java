/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        // VARIABLE
        char entrada = 0;

        do {
            // CONTROL
            boolean testOK = false;
            do {
                try {

                    // ENTRADA CONSOLA
                    System.out.print("Vocal inglesa...: ");
                    entrada = SCN.nextLine().charAt(0);
                    testOK = true;

                } catch (Exception e) {
                    // MENSAJE
                    System.out.println("ERROR: entrada incorrecta");
                }
            } while (!testOK);

            // VALIDACION LETRA INGLESA
            if (entrada != 'A' && entrada != 'E' && entrada != 'I' && entrada
                    != 'O' && entrada != 'U') {
                System.out.println("ERROR: Letra incorrecta");
            }

        } while (entrada != 'A' && entrada != 'E' && entrada != 'I' && entrada
                != 'O' && entrada != 'U');
        //  MENSAJE DE SALIDA
        System.out.printf("Vocal seleccionada: %c%n", entrada);
    }
}
