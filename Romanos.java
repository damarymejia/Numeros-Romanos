import java.util.*;

public class Romanos {

static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
Roma();
}

static public void Roma() {

String un = "", de = "", ce = "", mi = "";
int uni, dec, cen, mil, num;

System.out.print("Ingrese un numero entero: ");
num = input.nextInt();

mil = num / 1000;
cen = (num % 1000) / 100;
dec = ((num % 1000) % 100) / 10;
uni = (((num % 1000) % 100) % 10);

switch (mil) {
case 1:
mi += "M";
break;
case 2:
mi += "MM";
break;
case 3:
mi += "MMM";
break;
}

switch (cen) {
case 1:
ce += "C";
break;
case 2:
ce += "CC";
break;
case 3:
ce += "CCC";
break;
case 4:
ce += "CD";
break;
case 5:
ce += "D";
break;
case 6:
ce += "DC";
break;
case 7:
ce += "DCC";
break;
case 8:
ce += "DCCC";
break;
case 9:
ce += "CM";
break;
}

switch (dec) {
case 1:
de += "X";
break;
case 2:
de += "XX";
break;
case 3:
de += "XXX";
break;
case 4:
de += "XL";
break;
case 5:
de += "L";
break;
case 6:
de += "LX";
break;
case 7:
de += "LXX";
break;
case 8:
de += "LXXX";
break;
case 9:
de += "XC";
break;
}

switch (uni) {
case 1:
un += "I";
break;
case 2:
un += "II";
break;
case 3:
un += "III";
break;
case 4:
un += "IV";
break;
case 5:
un += "V";
break;
case 6:
un += "VI";
break;
case 7:
un += "VII";
break;
case 8:
un += "VIII";
break;
case 9:
un += "IX";
break;
}

System.out.println("Su numero " + num + " en romano es: " + mi + ce + de + un);

}
}
