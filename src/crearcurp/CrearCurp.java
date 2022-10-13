/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crearcurp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author symbian
 */
public class CrearCurp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String curp = "";
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Ingrese un fecha de nacimiento (DD/MM/AAAA): ");
        String fecha = scanInput.nextLine();
        fecha = fecha.toUpperCase();
        System.out.println("Ingrese su nombre(s): ");
        String nombre = scanInput.nextLine();
        nombre = nombre.toUpperCase();
        System.out.println("Ingrese su apellido Paterno: ");
        String ap = scanInput.nextLine();
        ap = ap.toUpperCase();
        System.out.println("Ingrese su Apellido Materno: ");
        String am = scanInput.nextLine();
        am = am.toUpperCase();
        System.out.println("Ingrese su estado de nacimiento: ");
        String estado = scanInput.nextLine();
        estado = estado.toUpperCase();
        System.out.println("Ingrese su Genero (H/M): ");
        String genero = scanInput.nextLine();
        genero = genero.toUpperCase();

        char[] cadenaap = new char[ap.length()];
        cadenaap = ap.toCharArray();
        curp = String.valueOf(cadenaap[0]);
        for (int j = 1; j < ap.length(); j++) {
            if (cadenaap[j] == 'A' || cadenaap[j] == 'E' || cadenaap[j] == 'I' || cadenaap[j] == 'O' || cadenaap[j] == 'U') {
                curp = curp.concat(String.valueOf(cadenaap[j]));
                j = ap.length();
            }
        }
        char[] cadenaam = new char[am.length()];
        if (am.length() != 0) {
            cadenaam = am.toCharArray();
            curp = curp.concat(String.valueOf(cadenaam[0]));
        } else {
            curp = curp.concat("X");
        }
        char[] cadenan = new char[nombre.length()];
        cadenan = nombre.toCharArray();
        if (cadenan[0] == 'J' && cadenan[1] == 'O' && cadenan[2] == 'S' && cadenan[3] == 'E') {
            if (nombre.length() > 4) {
                curp = curp.concat(String.valueOf(cadenan[5]));
            } else {
                curp = curp.concat(String.valueOf(cadenan[0]));
            }
        } else {
            if (cadenan[0] == 'M' && cadenan[1] == 'A' && cadenan[2] == 'R' && cadenan[3] == 'I' && cadenan[4] == 'A') {
                if (nombre.length() > 5) {
                    curp = curp.concat(String.valueOf(cadenan[6]));
                }
            } else {
                curp = curp.concat(String.valueOf(cadenan[0]));
            }
        }

        char[] cadenaf = new char[10];
        cadenaf = fecha.toCharArray();
        int dia = ((cadenaf[0] - 48) * 10) + (cadenaf[1] - 48);
        int mes = ((cadenaf[3] - 48) * 10) + (cadenaf[4] - 48);
        int an = ((cadenaf[8] - 48) * 10) + (cadenaf[9] - 48);
        if (an < 10) {
            curp = curp.concat("0" + String.valueOf(an));
        } else {
            curp = curp.concat(String.valueOf(an));
        }
        if (mes < 10) {
            curp = curp.concat("0" + String.valueOf(mes));
        } else {
            curp = curp.concat(String.valueOf(mes));
        }
        if (dia < 10) {
            curp = curp.concat("0" + String.valueOf(dia));
        } else {
            curp = curp.concat(String.valueOf(dia));
        }

        curp = curp.concat(genero);
        switch (estado) {
            case "AGUASCALIENTES":
                curp = curp.concat("AS");
                break;
            case "BAJA CALIFORNIA":
                curp = curp.concat("BC");
                break;
            case "BAJA CALIFORNIA SUR":
                curp = curp.concat("BS");
                break;
            case "CAMPECHE":
                curp = curp.concat("CC");
                break;
            case "CHIAPAS":
                curp = curp.concat("CS");
                break;
            case "CHIHUAHUA":
                curp = curp.concat("CH");
                break;
            case "COAHUILA":
                curp = curp.concat("CL");
                break;
            case "COLIMA":
                curp = curp.concat("CM");
                break;
            case "DF":
                curp = curp.concat("DF");
                break;
            case "DURANGO":
                curp = curp.concat("DG");
                break;
            case "GUANAJUATO":
                curp = curp.concat("GT");
                break;
            case "GUERRERO":
                curp = curp.concat("GR");
                break;
            case "HIDALGO":
                curp = curp.concat("HG");
                break;
            case "JALISCO":
                curp = curp.concat("JC");
                break;
            case "ESTADO DE MEXICO":
                curp = curp.concat("MC");
                break;
            case "MICHOACAN":
                curp = curp.concat("MN");
                break;
            case "MORELOS":
                curp = curp.concat("MS");
                break;
            case "NAYARIT":
                curp = curp.concat("NT");
                break;
            case "NUEVO LEON":
                curp = curp.concat("NL");
                break;
            case "OAXACA":
                curp = curp.concat("OC");
                break;
            case "PUEBLA":
                curp = curp.concat("PL");
                break;
            case "QUERETARO":
                curp = curp.concat("QT");
                break;
            case "QUINTANA ROO":
                curp = curp.concat("QR");
                break;
            case "SAN LUIS POTOSI":
                curp = curp.concat("SP");
                break;
            case "SINALOA":
                curp = curp.concat("SL");
                break;
            case "SONORA":
                curp = curp.concat("SR");
                break;
            case "TABASCO":
                curp = curp.concat("TC");
                break;
            case "TAMAULIPAS":
                curp = curp.concat("TS");
                break;
            case "TLAXCALA":
                curp = curp.concat("TL");
                break;
            case "VERACRUZ":
                curp = curp.concat("VZ");
                break;
            case "YUCATAN":
                curp = curp.concat("YN");
                break;
            case "ZACATECAS":
                curp = curp.concat("ZS");
                break;
            default:
                curp = curp.concat("NE");
                break;
        }

        for (int i = 1; i < ap.length(); i++) {
            if (cadenaap[i] != 'A' && cadenaap[i] != 'E' && cadenaap[i] != 'I' && cadenaap[i] != 'O' && cadenaap[i] != 'U') {
                curp = curp.concat(String.valueOf(cadenaap[i]));
                i = ap.length();
            }
        }
        if (am.length() != 0) {
            for (int i = 1; i < am.length(); i++) {
                if (cadenaam[i] != 'A' && cadenaam[i] != 'E' && cadenaam[i] != 'I' && cadenaam[i] != 'O' && cadenaam[i] != 'U') {
                    int v = cadenaam[i];
                    if (v == 65533) {
                        curp = curp.concat("X");
                    } else {
                        curp = curp.concat(String.valueOf(cadenaam[i]));
                        i = am.length();
                    }
                }
            }
        } else {
            curp = curp.concat("X");
        }
        for (int i = 1; i < nombre.length(); i++) {
            if (cadenan[i] != 'A' && cadenan[i] != 'E' && cadenan[i] != 'I' && cadenan[i] != 'O' && cadenan[i] != 'U') {
                curp = curp.concat(String.valueOf(cadenan[i]));
                i = nombre.length();
            }
        }
        String era = (String.valueOf(cadenaf[6]) + String.valueOf(cadenaf[7]) + String.valueOf(cadenaf[8]) + String.valueOf(cadenaf[9]));
        int era2 = Integer.parseInt(era);
        if (era2 < 2000) {
            curp = curp.concat("0");
        } else {
            curp = curp.concat("A");
        }
        Random aleatorio = new Random(System.currentTimeMillis());
        int al = aleatorio.nextInt(10);
        curp = curp.concat(String.valueOf(al));
        System.out.println("Su CURP aproximado es: " + curp);
    }

}
